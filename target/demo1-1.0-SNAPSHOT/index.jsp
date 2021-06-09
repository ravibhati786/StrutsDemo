<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1> Hello World
</h1>
<s:form action="hello">
    <s:label for="name">Enter your name</s:label> <br/>
    <input type="text" name="name"/>
    <input type="submit" value="Submit"/>
</s:form>
</body>
</html>