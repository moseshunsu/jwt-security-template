package com.higherAchievers.service;

import com.higherAchievers.dto.AuthResponse;
import com.higherAchievers.dto.LoginDto;
import com.higherAchievers.dto.UserRequest;

public interface AuthService {
    AuthResponse register(UserRequest request);
    AuthResponse authenticate(LoginDto loginDto);
}
