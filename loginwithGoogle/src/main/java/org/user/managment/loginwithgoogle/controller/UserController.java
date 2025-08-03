package org.user.managment.loginwithgoogle.controller;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserController {

    @GetMapping("/")
    public String home() {
        return "<h1>Welcome</h1><a href='/oauth2/authorization/google'>Login with Google</a>";
    }

    @GetMapping("/user")
    public Map<String, Object> getUser(OAuth2AuthenticationToken authentication) {
        return authentication.getPrincipal().getAttributes();
    }
}
