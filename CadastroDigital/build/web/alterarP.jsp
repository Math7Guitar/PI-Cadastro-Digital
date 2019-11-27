<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c' %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Alterar</title>
</head>
<body>
<h1>Alterar</h1>

<c:if test="${ not empty aluno.nome }">
	&nbsp;&nbsp; Aluno alterado com sucesso!<br/>
	&nbsp;&nbsp; Nome: <c:out value = "${ aluno.nome }"/> <br/>
	&nbsp;&nbsp; Ra: <c:out value = "${ aluno.ra }"/> <br/>
	&nbsp;&nbsp; E-mail: <c:out value = "${ aluno.email }"/> <br/>
	&nbsp;&nbsp; Curso: <c:out value = "${ aluno.curso }"/> <br/>
</c:if>
<c:if test="${ empty aluno.nome }">
	<c:out value="Alteração Impossibilitada!"/>
</c:if>
<br/><br/>
<a href="Index.html"> VOLTAR </a>
</body>
</html>