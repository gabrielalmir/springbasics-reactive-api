package br.com.gabrielalmir.reactiveapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.gabrielalmir.reactiveapi.models.User;

import br.com.gabrielalmir.reactiveapi.repositories.UserRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/users")
public class UserController {
    final UserRepository userRepository;

    UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    public Mono<User> create(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping
    public Flux<User> list() {
        return userRepository.findAll();
    }
}
