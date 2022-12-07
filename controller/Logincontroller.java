package com.spring.security.login.controller;

import com.spring.security.login.Dto.SignupRequestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class Logincontroller {
   @PostMapping("/signup")

    public ResponseEntity<?> signup(@RequestBody SignupRequestDto signuprequestdto)
   {
          return ResponseEntity.ok().body(200);
   }
}
