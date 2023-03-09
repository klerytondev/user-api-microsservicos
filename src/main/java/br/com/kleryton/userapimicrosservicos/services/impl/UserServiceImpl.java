package br.com.kleryton.userapimicrosservicos.services.impl;

import br.com.kleryton.userapimicrosservicos.domain.User;
import br.com.kleryton.userapimicrosservicos.domain.dtos.UserDTO;
import br.com.kleryton.userapimicrosservicos.repositories.UserRepository;
import br.com.kleryton.userapimicrosservicos.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepositorie;
    @Autowired
    private ModelMapper mapper;

    @Override
    public User findByID(Long id) {
        Optional<User> userOptional = userRepositorie.findById(id);
        return userOptional.get();
    }

    @Override
    public List<User> findAll() {
        return userRepositorie.findAll();
    }

    @Override
    public User createUser(UserDTO userDTO) {
        findByEmail(userDTO);
        return userRepositorie.save(mapper.map(userDTO, User.class));
    }

    @Override
    public User updateUser(UserDTO obj) {
        findByEmail(obj);
        return userRepositorie.save(mapper.map(obj, User.class));
    }

    @Override
    public void deleteUser(Long id) {
        findByID(id);
        userRepositorie.deleteById(id);
    }

    private void findByEmail(UserDTO obj){
        Optional<User> user = userRepositorie.findByEmail(obj.getEmail());
        if(user.isPresent() && !user.get().getId().equals(obj.getId())){
            throw new IntegridadeDeDadosException("Email já cadastrado!");
        }
    }
}
