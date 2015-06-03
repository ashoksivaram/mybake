package com.mybake.ppc.html.app.controller.requesthandler.imp;

import java.util.Map;

import javax.print.attribute.standard.Severity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mybake.poc.html.uiobjects.JSUserInfo;
import com.mybake.poc.html.uiobjects.ResultObject;
import com.mybake.ppc.html.app.adapter.UserAdapter;
import com.mybake.ppc.html.app.adapter.imp.UserAdapterImp;
import com.mybake.ppc.html.app.common.StringConstants;
import com.mybake.ppc.html.app.model.repo.UserRepo;
import com.mybake.ppc.model.usermanagement.User;

@Component
public class CreateNewUserRequestHandlerImp extends RequestHandlerImp {
	@Autowired
	private UserRepo userRepo;

	public ResultObject handleAddUserRequest(JSUserInfo jsUserInfo,
			String userId) {
		ResultObject resultObject = new ResultObject();
		if (null == jsUserInfo) {
			resultObject.setMessage(StringConstants.ERROR);
			resultObject.setObject("User Info is null.");
			resultObject.setSeverity(Severity.ERROR.getValue());
			return resultObject;
		}
		Map<String, User> userMap = userRepo.getUserMap();
		if (null == userMap) {
			resultObject.setMessage(StringConstants.ERROR);
			resultObject.setObject("Unable to get list of users.");
			resultObject.setSeverity(Severity.ERROR.getValue());
			return resultObject;
		}
		User user = userMap.get(userId);
		if (null == user) {
			resultObject.setMessage(StringConstants.ERROR);
			resultObject
					.setObject("Unable to get user with userId : " + userId);
			resultObject.setSeverity(Severity.ERROR.getValue());
			return resultObject;
		}

		switch (user.getUserType()) {
		case ADMIN:
			//String transactionKey = userRepo.createTrasaction();
			 User createUser = createUser(jsUserInfo);
			 //userRepo.commit(transactionKey);
			break;
		default:
			resultObject.setMessage(StringConstants.ERROR);
			resultObject.setObject("You dont have rigth to create user : "
					+ userId);
			resultObject.setSeverity(Severity.ERROR.getValue());
			return resultObject;
		}

		return resultObject;
	}

	private User createUser(JSUserInfo jsUserInfo) {
		ResultObject resultObject = new ResultObject();
		UserAdapter adapter = new UserAdapterImp();
		return adapter.toUser(jsUserInfo);
	}
}
