package com.dcode.service;

import io.smallrye.jwt.build.Jwt;
import jakarta.inject.Singleton;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author zavier
 */

@Singleton
public class OtolaseJwtService {
    public String generateJwt(){
        Set<String> roles = new HashSet<>(Arrays.asList("admin", "user"));
        return Jwt.issuer("otolase-jwt")
                .subject("")
                .groups(roles)
                .expiresAt(System.currentTimeMillis() + 3600)
                .sign();
    }
}
