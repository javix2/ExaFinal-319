<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
String numero = "N = "+(String)session.getAttribute("numero");
String cade = (String)session.getAttribute("serie");
%>
<label><%=numero%><p><%=cade %>
</label>

</body>
</html>