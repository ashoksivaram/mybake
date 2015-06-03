package com.mybake.ppc.html.app.model.repo;

import java.util.Map;

import com.mybake.poc.html.uiobjects.JSUserInfo;
import com.mybake.ppc.model.usermanagement.User;

public interface UserRepo {

	JSUserInfo getUserDetails(String userId);

	Map<String, User> getUserMap();

}
