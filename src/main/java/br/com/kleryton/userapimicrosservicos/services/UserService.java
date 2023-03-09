package br.com.kleryton.userapimicrosservicos.services;

import br.com.kleryton.userapimicrosservicos.domain.User;

import java.util.List;

public interface UserService {

    User findById(Long id);
    List<User> findAllUser();

}
