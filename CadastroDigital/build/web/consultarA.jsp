<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c' %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Consultar</title>
    </head>
    <body>
        <div id="main">
            <div class="container">
                <div id="logousjt"><img src="imagens/usjt.png"/></div>
                <div id="cadastro"><h1><font color="#191970">CADASTRO DE ALUNOS</font></h1></div>
            </div>
        </div>
        <div class="divider"></div>
        <c:if test="${ not empty aluno.nome }">
            <br/>
            &nbsp;&nbsp; Nome: <c:out value = "${ aluno.nome }"/> <br/>
            &nbsp;&nbsp; Ra: <c:out value = "${ aluno.ra }"/> <br/>
            &nbsp;&nbsp; E-mail: <c:out value = "${ aluno.email }"/> <br/>
            &nbsp;&nbsp; Curso: <c:out value = "${ aluno.curso }"/> <br/>
        </c:if>
        <c:if test="${ empty aluno.nome }">
            <c:out value="Aluno não encontrado no sistema!"/>
        </c:if>
        <br/><br/>
        <a href="index.html"> VOLTAR </a>
    </body>
</html>



