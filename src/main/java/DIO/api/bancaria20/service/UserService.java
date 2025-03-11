package DIO.api.bancaria20.service;

import DIO.api.bancaria20.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
