package com.partypro.praveen.service.impl;

import org.springframework.stereotype.Service;

import com.partypro.praveen.dto.request.ServicesProvidedRequest;
import com.partypro.praveen.dto.response.RegisterResponse;
import com.partypro.praveen.model.ServicesProvided;
import com.partypro.praveen.repository.ServicesProvidedRepository;
import com.partypro.praveen.service.ServicesProvidedService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ServicesProvidedServiceImpl implements ServicesProvidedService{

    private final ServicesProvidedRepository repository;

    @Override
    public RegisterResponse addService(ServicesProvidedRequest request) {
        var service = ServicesProvided
        .builder()
        .name(request.getName())
        .lowPrice(request.getLowPrice())
        .highPrice(request.getHighPrice())
        .benefits(request.getBenefits())
        .location(request.getLocation())
        .build();

        repository.save(service);

        return RegisterResponse.builder().message("New service added").build();
    }

}
