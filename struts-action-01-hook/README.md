# Struts action hook for login

The request URL when log out

```
http://localhost:8080/c/portal/logout
```

The struts action path from the url:

```
/portal/logout
```

It is a struts action, so you have to extend BaseStrutsAction not BaseStrutsPortletAction.
You have to override the action-path /login/login

This info is enough to create a simple hook.

If you are curious what code is behind of /login/login struts action, you have to check struts-config.xml and find
action path="/portal/logout".

Here it is:

```
<action path="/portal/logout" type="com.liferay.portal.action.LogoutAction" />
```

It is not important for this hook but it is worth to check com.liferay.portal.action.LogoutAction.java, especially
it's parts which calls logout pre- and post-actions:

```
    EventsProcessorUtil.process(
	PropsKeys.LOGOUT_EVENTS_PRE, PropsValues.LOGOUT_EVENTS_PRE,
	request, response);
...
    EventsProcessorUtil.process(
	PropsKeys.LOGOUT_EVENTS_POST, PropsValues.LOGOUT_EVENTS_POST,
	request, response);

```

The lines above make it possible to create event hooks for "logout.events.pre" and "logout.events.post".
