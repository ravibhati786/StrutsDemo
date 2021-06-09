<%--
  Created by IntelliJ IDEA.
  User: RAVI BHATI
  Date: 07-06-2021
  Time: 09:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
Hello <s:property value="name"/>


<h3>Following are the Records:</h3>
<s:iterator  value="records">
    <fieldset>
        <s:property value="Id"/><br/>
        <s:property value="Name"/><br/>
        <s:property value="Email"/><br/>
        <s:property value="Phone"/><br/>
    </fieldset>
</s:iterator>
</body>
</html>
