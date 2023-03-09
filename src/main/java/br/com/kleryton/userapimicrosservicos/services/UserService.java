package br.com.kleryton.userapimicrosservicos.services;

import br.com.kleryton.userapimicrosservicos.domain.User;
import br.com.kleryton.userapimicrosservicos.domain.dtos.UserDTO;

import java.util.List;

public interface UserService {

    User findByID(Long id);
    List<User> findAll();
    User createUser(UserDTO userDTO);
    User updateUser(UserDTO obj);
    void deleteUser(Long id);

}
