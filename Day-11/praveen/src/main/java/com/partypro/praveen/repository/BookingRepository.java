package com.partypro.praveen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.partypro.praveen.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, String>{
    
}
