package com.partypro.praveen.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ServicesProvidedRequest {
    private String name;
    private String lowPrice;
    private String highPrice;
    private String benefits;
    private String location;
}