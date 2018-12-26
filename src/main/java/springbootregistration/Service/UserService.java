package springbootregistration.Service;


import springbootregistration.Persistence.model.User;
import springbootregistration.Web.dto.UserDto;

public interface UserService {
    User findUserByEmail(String email);

    void createUserAccount(UserDto user);
}
