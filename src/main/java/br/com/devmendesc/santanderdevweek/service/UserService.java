package br.com.devmendesc.santanderdevweek.service;

import br.com.devmendesc.santanderdevweek.domain.model.User;

public interface UserService {
    User findById(Long id);
    User create(User userToCreate);
}
