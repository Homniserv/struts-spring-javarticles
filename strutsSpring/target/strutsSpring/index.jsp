<%@page
	import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<html>
<body>
	<h2><%=WebApplicationContextUtils.getWebApplicationContext(application).getBean("springWebApp")%></h2>


<!-- debug https://struts.apache.org/getting-started/debugging-struts.html -->
	<a href='<s:url action="index" namespace="config-browser" />'>Launch
		the configuration browser</a>
</body>
</html>