# Struts action hook for login

The request URL when Sign In

```
http://localhost:8080/web/guest/home?p_p_id=58&p_p_lifecycle=1&p_p_state=normal&p_p_mode=view&p_p_col_id=column-1&p_p_col_count=1&_58_struts_action=%2Flogin%2Flogin
```

The struts action parameter from the url:

```
&_58_struts_action=%2Flogin%2Flogin
```

It means portlet 58, action-path:/login/login

It is a portlet action, so you have to extend BaseStrutsPortletAction not BaseStrutsAction.
You have to override the action-path /login/login

This info is enough to create a simple hook.

If you are curious what code is behind of /login/login struts action, you have to check struts-config.xml and find
action path="/login/login".

Here it is:

```
<action path="/login/login" type="com.liferay.portlet.login.action.LoginAction">
    <forward name="portlet.login.login" path="portlet.login.login" />
    <forward name="portlet.login.login_redirect" path="portlet.login.login_redirect" />
</action>
```

Excerpt from com.liferay.portlet.login.action.LoginAction.java's processAction method

```
String login = ParamUtil.getString(actionRequest, "login");
String password = actionRequest.getParameter("password");
boolean rememberMe = ParamUtil.getBoolean(actionRequest, "rememberMe");
```
