package com.partypro.praveen.service;

import com.partypro.praveen.dto.request.ServicesProvidedRequest;
import com.partypro.praveen.dto.response.RegisterResponse;

public interface ServicesProvidedService {

    RegisterResponse addService(ServicesProvidedRequest request);

}
