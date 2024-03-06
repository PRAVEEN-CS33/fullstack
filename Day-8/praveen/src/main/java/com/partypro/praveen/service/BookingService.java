package com.partypro.praveen.service;

import java.util.List;

import com.partypro.praveen.dto.request.BookingRequest;
import com.partypro.praveen.dto.response.RegisterResponse;
import com.partypro.praveen.model.Booking;

public interface BookingService {

    RegisterResponse requestService(BookingRequest request);

    List<Booking> getAll();

    RegisterResponse acceptOrRejectRequest(String id);
}
