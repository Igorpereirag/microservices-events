package com.microservices.microservicesevents.domain;

import com.microservices.microservicesevents.dtos.EventRequestDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
@Entity
@Table(name="event")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of="id")
public class Event {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private int maxParticipants;
    private int registeredParticipants;
    private String date;
    private String title;
    private String description;

    public Event(EventRequestDTO eventRequest){
        this.date= eventRequest.date();
        this.maxParticipants = eventRequest.maxParticipants();
        this.title = eventRequest.title();
        this.registeredParticipants=eventRequest.registeredParticipants();
        this.maxParticipants= eventRequest.maxParticipants();
        this.description= eventRequest.description();
    }

}
