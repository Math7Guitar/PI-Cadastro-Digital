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
            <title>CADASTRO</title>
    </head>
    <body>
        <c:if test="${ not empty prof.nome }">
            <br/>
            &nbsp;&nbsp; Professor Cadastrado!<br/>
            &nbsp;&nbsp; Nome: <c:out value = "${ prof.nome }"/> <br/>
            &nbsp;&nbsp; Matéria: <c:out value = "${ prof.materia }"/> <br/>
            &nbsp;&nbsp; Rp: <c:out value = "${ prof.rp }"/> <br/>
            &nbsp;&nbsp; Foto: <c:out value = "${ prof.foto }"/> <br/>
        </c:if>
        <c:if test="${ empty prof.nome }">
            <c:out value="Cadastro não efetuado!"/>
        </c:if>
        <br/><br/>
        <a href="index.html"> VOLTAR </a>
    </body>
</html>
