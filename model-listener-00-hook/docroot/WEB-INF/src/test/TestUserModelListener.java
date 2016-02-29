package test;

import org.apache.log4j.Logger;

import com.liferay.portal.ModelListenerException;
import com.liferay.portal.model.BaseModelListener;
import com.liferay.portal.model.User;

public class TestUserModelListener extends BaseModelListener<User> {

	@Override
	public void onAfterCreate(User model) throws ModelListenerException {
		_log.error("User " + model.getEmailAddress() + " created");
		super.onAfterCreate(model);
	}

	Logger _log = Logger.getLogger(TestUserModelListener.class);

}
