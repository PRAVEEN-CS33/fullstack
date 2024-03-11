package com.partypro.praveen.controller;

import static com.partypro.praveen.utils.MyConstant.FORGOT_PASSWORD;
import static com.partypro.praveen.utils.MyConstant.USER;

import java.security.Principal;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.partypro.praveen.dto.request.BookingRequest;
import com.partypro.praveen.dto.request.PasswordRequest;
import com.partypro.praveen.dto.response.RegisterResponse;
import com.partypro.praveen.service.BookingService;
import com.partypro.praveen.service.UserService;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(USER)
@PreAuthorize("hasAnyRole('USER', 'ADMIN')")
@Tag(name = "USER")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final BookingService bookingService;

    @GetMapping
    @PreAuthorize("hasAnyAuthority('user:read', 'admin:read')")
    public String get() {
        return "GET:: user controller";
    }

    @PatchMapping(FORGOT_PASSWORD)
    @PreAuthorize("hasAnyAuthority('user:update', 'admin:update')")
    // @Hidden
    public ResponseEntity<?> forgotPassword(PasswordRequest request, Principal principal) {
        userService.forgotPassword(request, principal);
        return ResponseEntity.ok().body("Password changed successfully");
    }

    @PostMapping("/requestService")
    @PreAuthorize("hasAnyAuthority('user:create', 'admin:create')")
    public ResponseEntity<?> requestService(@RequestBody BookingRequest request) {
        try {
            RegisterResponse response = new RegisterResponse();
            response = bookingService.requestService(request);
            return new ResponseEntity<>(response, HttpStatus.OK);
            
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
    }
    

}
