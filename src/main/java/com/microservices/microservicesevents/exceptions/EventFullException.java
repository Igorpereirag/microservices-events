package com.microservices.microservicesevents.exceptions;

public class EventFullException extends RuntimeException {
    
    public EventFullException () {
        super("Evento está lotado");
    }

    public EventFullException (String message) {
        super(message);
    }
}
