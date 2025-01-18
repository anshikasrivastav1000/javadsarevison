package com.springSecurity.service;

import com.springSecurity.Repository.UserRepository;
import com.springSecurity.dto.SignUpDto;
import com.springSecurity.dto.UserDto;
import com.springSecurity.entities.User;
import com.springSecurity.exceptions.ResourceNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements UserDetailsService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, ModelMapper modelMapper, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByEmail(username).orElseThrow(() -> new ResourceNotFoundException("user with this email not found" + username));
    }

    public UserDto signUP(SignUpDto signUpDto) {
   Optional<User> user = userRepository.findByEmail(signUpDto.getEmail());
   if(user.isPresent()){
       throw  new BadCredentialsException("user with this email already exits"+signUpDto.getEmail());
   }
   User toBeCreatedUser = modelMapper.map(signUpDto,User.class);
   toBeCreatedUser.setPassword((passwordEncoder.encode(toBeCreatedUser.getPassword())));
   User saveUser = userRepository.save(toBeCreatedUser);
   return modelMapper.map(saveUser,UserDto.class);
    }

}
