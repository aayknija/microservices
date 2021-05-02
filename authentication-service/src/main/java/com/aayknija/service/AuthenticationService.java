package com.aayknija.service;

import com.aayknija.model.AuthenticationRequest;
import com.aayknija.model.AuthenticationResponse;

public interface AuthenticationService {
    AuthenticationResponse authenticate(AuthenticationRequest authenticationRequest);
}
