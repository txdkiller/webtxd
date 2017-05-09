package com.rlair.web.service;

import com.rlair.web.model.User;

import java.util.List;

/**
 * Created by TXD on 2017/5/9.
 */
public interface UserService {

    List<User> getAllUser();

    User getUserByPhoneOrEmail(String emailOrPhone, Short state);

    User getUserById(Long userId);
}
