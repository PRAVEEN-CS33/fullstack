package com.partypro.praveen.dto.request;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookingRequest {
    private String type;
    private String location;
    private String foodTheme;
    private String budget;
    private String instructions;
    private boolean accepted;
    private String status;
    private String date;
}
