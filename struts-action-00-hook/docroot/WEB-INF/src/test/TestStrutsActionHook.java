package test;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.apache.log4j.Logger;

import com.liferay.portal.kernel.struts.BaseStrutsPortletAction;
import com.liferay.portal.kernel.struts.StrutsPortletAction;
import com.liferay.portal.kernel.util.ParamUtil;

public class TestStrutsActionHook extends BaseStrutsPortletAction {

	@Override
	public void processAction(StrutsPortletAction originalStrutsPortletAction, PortletConfig portletConfig,
			ActionRequest request, ActionResponse actionResponse) throws Exception {
		_log.error("processAction");
		String login = ParamUtil.getString(request, "login");
		String password = request.getParameter("password");
		boolean rememberMe = ParamUtil.getBoolean(request, "rememberMe");
		_log.error(login + "," + password + "," + rememberMe);
		originalStrutsPortletAction.processAction(originalStrutsPortletAction, portletConfig, request, actionResponse);
	}

	@Override
	public String render(StrutsPortletAction originalStrutsPortletAction, PortletConfig portletConfig,
			RenderRequest renderRequest, RenderResponse renderResponse) throws Exception {
		_log.error("render");
		return originalStrutsPortletAction.render(originalStrutsPortletAction, portletConfig, renderRequest, renderResponse);
	}

	@Override
	public void serveResource(StrutsPortletAction originalStrutsPortletAction, PortletConfig portletConfig,
			ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws Exception {
		_log.error("serveResource");
		originalStrutsPortletAction.serveResource(originalStrutsPortletAction, portletConfig, resourceRequest, resourceResponse);
	}

	Logger _log = Logger.getLogger(getClass());

}
