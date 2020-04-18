<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Lista de Paises</title>
	<link href="css/bootstrap.min.css" rel="stylesheet">
	<link href="css/style.css" rel="stylesheet">
</head>

<body>

	<c:import url="Menu.jsp" />

	<div id="main" class="container">
		<h3 class="page-header">Países</h3>
		<c:forEach var="pais" items="${paises}">
		<div class="row">
			<div class="col-md-12">
				<p>
					<strong>ID</strong>
				</p>
				<p>
					${pais.id}
				</p>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">
				<p>
					<strong>Nome</strong>
				</p>
				<p>
					${pais.nome}
				</p>
			</div>
		</div>
		<div class="row">
			<div class="col-md-6">
				<p>
					<strong>População</strong>
				</p>
				<p>
					${pais.populacao}
				</p>
			</div>
			<div class="col-md-6">
				<p>
					<strong>Área</strong>
				</p>
				<p>
					${pais.area}
				</p>
			</div>
		</div>
		<hr />
		</c:forEach>
		<div id="actions" class="row">
			<div class="col-md-12">
				<a href="index.jsp" class="btn btn-default">Voltar</a>
			</div>
		</div>
	</div>

	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>

</body>

</html>