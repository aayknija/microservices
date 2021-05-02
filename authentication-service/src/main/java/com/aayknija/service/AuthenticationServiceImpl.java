package com.aayknija.service;

import com.aayknija.model.AuthenticationRequest;
import com.aayknija.model.AuthenticationResponse;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    @Override
    public AuthenticationResponse authenticate(AuthenticationRequest authenticationRequest) {
        return null;
    }
}
