package com.springsecurityjwt.service.user;

import com.springsecurityjwt.model.User;
import com.springsecurityjwt.service.IGenericService;
import org.springframework.security.core.userdetails.UserDetails;

public interface IUserService extends IGenericService<User> {
    UserDetails loadUserByUsername(String username);
    User findByUsername(String username);
}
