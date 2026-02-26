package org.example.prac02_back.user;

import lombok.RequiredArgsConstructor;
import org.example.prac02_back.user.model.User;
import org.example.prac02_back.user.model.UserDto;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    public void signup(UserDto.SignupReq dto) {
        User user = dto.toEntity(dto);
        userRepository.save(user);
    }
}
