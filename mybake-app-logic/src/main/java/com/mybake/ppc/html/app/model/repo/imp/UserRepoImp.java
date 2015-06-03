package com.mybake.ppc.html.app.model.repo.imp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.mybake.poc.html.uiobjects.JSUserInfo;
import com.mybake.ppc.html.app.model.repo.UserRepo;
import com.mybake.ppc.model.usermanagement.User;

@Component
public class UserRepoImp implements UserRepo {

	private List<JSUserInfo> jsUserInfoList = null;

	public UserRepoImp() {
		if (null == jsUserInfoList) {
			// TODO need to get this information from Database
			jsUserInfoList = new ArrayList<JSUserInfo>();
			JSUserInfo user1 = new JSUserInfo();
			user1.setUserId("1");
			user1.setUserName("maheshk");
			jsUserInfoList.add(user1);

			JSUserInfo user2 = new JSUserInfo();
			user2.setUserId("2");
			user2.setUserName("chaithum");
			jsUserInfoList.add(user2);

			JSUserInfo user3 = new JSUserInfo();
			user3.setUserId("3");
			user3.setUserName("anup");
			jsUserInfoList.add(user2);
		}
	}

	public JSUserInfo getUserDetails(String userId) {
		if (null != jsUserInfoList) {
			for (JSUserInfo jsUserInfo : jsUserInfoList) {
				if (jsUserInfo.getUserId().compareTo(userId) == 0) {
					return jsUserInfo;
				}
			}
		}
		return null;
	}

	public Map<String, User> getUserMap() {
		// TODO Auto-generated method stub
		return null;
	}

}
