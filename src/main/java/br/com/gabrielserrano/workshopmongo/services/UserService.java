package br.com.gabrielserrano.workshopmongo.services;

import br.com.gabrielserrano.workshopmongo.domain.User;
import br.com.gabrielserrano.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }
}
