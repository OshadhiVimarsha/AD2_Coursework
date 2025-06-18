package lk.ijse.userservice.service;

import jakarta.validation.Valid;
import lk.ijse.userservice.dto.UserDTO;

public interface UserService {
    int saveUser(@Valid UserDTO userDTO);
    UserDTO searchUser(String username);

    void deleteUser(String email);
    Object getAllUser();

    int resetPassword(UserDTO exuser);

}