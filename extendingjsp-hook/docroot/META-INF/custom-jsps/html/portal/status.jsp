<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>

<%@ page import="com.liferay.portal.kernel.util.StringUtil" %>

<liferay-util:buffer var="html">
	<liferay-util:include page="/html/portal/status.portal.jsp" />
</liferay-util:buffer>

<%
	html = StringUtil.add("<p>BEFORE</p>", html, "\n");

	html = StringUtil.add(html,"<p>AFTER</p>", "\n");
%>

<%= html %>