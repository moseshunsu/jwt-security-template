package com.higherAchievers.service;

import com.higherAchievers.dto.AuthResponse;
import com.higherAchievers.dto.LoginDto;
import com.higherAchievers.dto.UserRequest;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public interface AuthService {
    AuthResponse register(UserRequest request);
    AuthResponse authenticate(LoginDto loginDto);
    void refreshToken(HttpServletRequest request, HttpServletResponse response) throws IOException;
}
