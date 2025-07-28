package com.learningmgmt.service;

import com.learningmgmt.dto.UserDTO;
import com.learningmgmt.entity.User;

public interface UserServices {

	public User signup(UserDTO userDTO);
}
