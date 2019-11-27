<%-- 
    Document   : cadastrar
    Created on : 25/11/2019, 16:42:56
    Author     : matheus
--%>

<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c' %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="estilos.css">
        <link rel="shortcut icon" href="imagens/borracha.png" type="image/png"/>
        <meta charset="UTF-8">
            <title>Cadastro</title>
    </head>
    <body>
        <div id="main">
            <div class="container">
                <div id="logousjt"><img src="imagens/usjt.png"/></div>
                <div id="cadastro"><h1><font color="#191970">CADASTRO DE ALUNOS</font></h1></div>
            </div>
        </div>
        <div class="divider"></div>
        <br/>
        <c:if test="${ not empty aluno.nome }">
            <br/>
            &nbsp;&nbsp; Aluno Cadastrado!<br/>
            &nbsp;&nbsp; Nome: <c:out value = "${ aluno.nome }"/> <br/>
            &nbsp;&nbsp; Curso: <c:out value = "${ aluno.curso }"/> <br/>
            &nbsp;&nbsp; Ra: <c:out value = "${ aluno.ra }"/> <br/>
            &nbsp;&nbsp; Turma: <c:out value = "${ aluno.turma }"/> <br/>
        </c:if>
        <c:if test="${ empty aluno.nome }">
            <c:out value="Cadastro não efetuado!"/>
        </c:if>
        <br/><br/>
        <a href="index.html"> VOLTAR </a>
    </body>
</html>
