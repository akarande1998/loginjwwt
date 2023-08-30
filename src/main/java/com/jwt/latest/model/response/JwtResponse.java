package com.jwt.latest.model.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JwtResponse {
    private String jwtToken;
    private String username;
}
