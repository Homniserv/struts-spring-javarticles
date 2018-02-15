<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<html>
<body>
<h2><%=WebApplicationContextUtils.getWebApplicationContext(application).getBean("springWebApp")%></h2>
</body>
</html>