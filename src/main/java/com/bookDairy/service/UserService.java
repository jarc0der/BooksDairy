package com.bookDairy.service;

import com.bookDairy.domain.User;

/**
 * Created by Maryna Kontar.
 */
public interface UserService {

    User get(Long id);
    User save(User user);
    User update(User user);
    User delete(User user);
    User findByUsername(String username);
    User findByEmail(String email);

}
