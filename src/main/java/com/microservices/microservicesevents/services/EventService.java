package com.microservices.microservicesevents.services;


import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.microservicesevents.Repository.EventRepository;
import com.microservices.microservicesevents.Repository.SubscriptionRepository;
import com.microservices.microservicesevents.domain.Event;
import com.microservices.microservicesevents.domain.Subscription;
import com.microservices.microservicesevents.dtos.EmailRequestDTO;
import com.microservices.microservicesevents.dtos.EventRequestDTO;
import com.microservices.microservicesevents.exceptions.EventNotFoundException;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private SubscriptionRepository subscriptionRepository;

    @Autowired
    private EmailServiceClient emailServiceClient;

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public List<Event> getUpcomingEvents() {
        return eventRepository.findUpcomingEvents(LocalDateTime.now());
    }

    public Event createEvent(EventRequestDTO eventRequest) {
        Event newEvent = new Event(eventRequest);
        return eventRepository.save(newEvent);
    }

		private Boolean isEventFull(Event event){
        return event.getRegisteredParticipants() >= event.getMaxParticipants();
    }

    public void registerParticipant(String eventId, String participantEmail) {
				Event event = eventRepository.findById(eventId).orElseThrow(EventNotFoundException::new);

				if(isEventFull(event)) {
            throw new EventNotFoundException();
        }

        Subscription subscription = new Subscription(event, participantEmail);
        subscriptionRepository.save(subscription);

        event.setRegisteredParticipants(event.getRegisteredParticipants() + 1);

        EmailRequestDTO emailRequest = new EmailRequestDTO(participantEmail, "Confirmação de Inscrição", "Você foi inscrito no evento com sucesso!");

        emailServiceClient.sendEmail(emailRequest);
    }
}