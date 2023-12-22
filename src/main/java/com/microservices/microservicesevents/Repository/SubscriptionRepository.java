package com.microservices.microservicesevents.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.microservicesevents.domain.Subscription;

import jakarta.persistence.Id;

public interface SubscriptionRepository extends JpaRepository<Subscription, Id> {
    
    
}
