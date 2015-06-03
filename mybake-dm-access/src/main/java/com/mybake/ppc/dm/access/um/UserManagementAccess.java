package com.mybake.ppc.dm.access.um;

import java.util.List;

import com.mybake.ppc.model.usermanagement.User;

public interface UserManagementAccess {
	List<User> getAllUsers();

	List<User> getActiveUsers();

	List<User> getDeletedUsers();

	List<User> getUser(String userLoginId);

	Boolean addUser(User user);

	Boolean editUser(User user);

	Boolean deleteUser(String userLoginId);

}
