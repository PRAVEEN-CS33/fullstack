package com.partypro.praveen.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.partypro.praveen.dto.request.BookingRequest;
import com.partypro.praveen.dto.response.RegisterResponse;
import com.partypro.praveen.model.Booking;
import com.partypro.praveen.repository.BookingRepository;
import com.partypro.praveen.service.BookingService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookingServiceImpl implements BookingService {

    private final BookingRepository bookingRepository;

    @Override
    public RegisterResponse requestService(BookingRequest request) {
        var booking = Booking
                .builder()
                .type(request.getType())
                .accepted(false)
                .foodTheme("")
                .location(request.getLocation())
                .budget(request.getBudget())
                .date(request.getDate())
                .status("pending")
                .build();

        bookingRepository.save(booking);

        return RegisterResponse.builder().message("Your Party Request has been Recieved").build();

    }

    @Override
    public List<Booking> getAll() {
        return bookingRepository.findAll();
    }

    @Override
    public RegisterResponse acceptOrRejectRequest(String id) {
        var booking = bookingRepository.findById(id);

        if (booking.isPresent()) {
            booking.ifPresent(b -> {
                b.setAccepted(true);
                bookingRepository.save(b);
            });
            return RegisterResponse.builder().message("The Party request has been accepted").build();
        }

        return RegisterResponse.builder().message("Booking with requested ID not found" + id).build();
    }

}
