package test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.liferay.portal.kernel.events.Action;
import com.liferay.portal.kernel.events.ActionException;

public class TestLoginEventPreAction extends Action {

	@Override
	public void run(HttpServletRequest request, HttpServletResponse response) throws ActionException {
		_log.error("run pre action");
	}

	Logger _log = Logger.getLogger(TestLoginEventPreAction.class);
}
