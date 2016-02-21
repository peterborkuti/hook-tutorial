<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>

<%@ page import="com.liferay.portal.kernel.util.StringUtil" %>
<liferay-util:buffer var="html">
	<liferay-util:include page="/html/taglib/portlet/icon_options/page.portal.jsp" />
</liferay-util:buffer>

<%
	html = html.replaceAll("direction-down", "direction-up");
%>
<%= html %>
