package com.user.service;

import com.user.entity.User;

public interface UserService {

    public User getUser(Long id);
    
    public void postUser(User user);

}
