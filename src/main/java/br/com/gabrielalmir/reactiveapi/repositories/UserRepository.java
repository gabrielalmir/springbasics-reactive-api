package br.com.gabrielalmir.reactiveapi.repositories;


import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import br.com.gabrielalmir.reactiveapi.models.User;

public interface UserRepository extends ReactiveCrudRepository<User, Long>{

}
