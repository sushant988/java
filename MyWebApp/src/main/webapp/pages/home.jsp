<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Hello

<form action="add">
<input type="text" name="i"/>
<input type="text" name="j"/>
<input type="submit">
</form>

<form action="hello">
<input type="text" name="aid"/>
<input type="text" name="aname"/>
<input type="text" name="tech"/>
<input type="submit">
</form>

<form action="getAlien">
<input type="text" name="aid"/>
<input type="submit">
</form>

${obj.aname}
</form>
</body>
</html>