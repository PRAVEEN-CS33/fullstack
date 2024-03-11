package com.partypro.praveen.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.partypro.praveen.dto.request.BookingRequest;
import com.partypro.praveen.dto.request.ServicesProvidedRequest;
import com.partypro.praveen.dto.response.RegisterResponse;
import com.partypro.praveen.model.Booking;
import com.partypro.praveen.service.BookingService;
import com.partypro.praveen.service.ServicesProvidedService;

import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/admin")
@PreAuthorize("hasRole('ADMIN')")
@Tag(name = "Admin")
public class AdminController {

    private final ServicesProvidedService servicesProvidedService;
    private final BookingService bookingService;

    @GetMapping("/getBookings")
    @PreAuthorize("hasAuthority('admin:read')")
    public ResponseEntity<?> getAllBookings() {
        try {
            return new ResponseEntity<>(bookingService.getAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.EXPECTATION_FAILED);
        }
    }

    @PostMapping("/addService")
    @PreAuthorize("hasAuthority('admin:create')")
    public ResponseEntity<?> addService(@RequestBody ServicesProvidedRequest request) {

        try {
            RegisterResponse reponse = new RegisterResponse();
            reponse = servicesProvidedService.addService(request);
            return new ResponseEntity<>(reponse, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
    }

    @PutMapping("/acceptOrRejectRequest")
    @PreAuthorize("hasAuthority('admin:update')")
    public ResponseEntity<?> acceptOrRejectRequest(@RequestParam String id) {
        try {
            RegisterResponse response = bookingService.acceptOrRejectRequest(id);
            return new ResponseEntity<>(response, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
    }

    @DeleteMapping
    @PreAuthorize("hasAuthority('admin:delete')")
    @Hidden
    public String delete() {
        return "DELETE:: admin controller";
    }
}
