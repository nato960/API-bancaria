package DIO.api.bancaria20.service.impl;

import DIO.api.bancaria20.domain.model.User;
import DIO.api.bancaria20.domain.repository.UserRepository;
import DIO.api.bancaria20.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.NoSuchElementException;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

//    private final UserRepository userRepository;

//    public UserServiceImpl(UserRepository userRepository){
//        this.userRepository = userRepository;
//    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This Account number already exists.");
        }
        return userRepository.save(userToCreate);
    }
}
