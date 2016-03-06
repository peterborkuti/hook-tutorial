package test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.liferay.portal.kernel.struts.BaseStrutsAction;
import com.liferay.portal.kernel.struts.StrutsAction;

public class TestStrutsActionHook extends BaseStrutsAction {

	@Override
	public String execute(StrutsAction originalStrutsAction, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		_log.error("/portal/logout execute");
		return originalStrutsAction.execute(originalStrutsAction, request, response);
	}

	Logger _log = Logger.getLogger(getClass());
}
