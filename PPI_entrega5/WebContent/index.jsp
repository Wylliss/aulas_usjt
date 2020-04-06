<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Paises</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
</head>
<body>
	<!-- Barra superior com os menus de navegacao -->
	<c:import url="Menu.jsp" />
	<div id="main" class="container">
		<h3 class="page-header">Cadastro de Paises</h3>
		<form action="ManterPais.do" method="get">

			<div class="row">
				<div class="form-group col-md-12">
					<label for="pais">Pais</label> <input type="text" name="nome"
						class="form-control" required maxlength="100"
						placeholder="Nome do Pais">
				</div>
			</div>

			<div class="row">
				<div class="form-group col-md-6">
					<label for="populacao">Populacao</label> <input type="number"
						name="populacao" class="form-control" maxlength="15" required
						placeholder="Total de habilantes">
				</div>
				<div class="form-group col-md-6">
					<label for="area">Area</label> <input type="number" name="area"
						class="form-control" required maxlength="15"
						placeholder="Area do Pais">
				</div>
			</div>
			<hr />
			<div id="actions" class="row">
				<div class="col-md-12">
					<input type="submit" class="btn btn-primary">

					<hr />

					<button type="submit" class="btn btn-primary" name="acao"
						value="Criar">Salvar</button>
					<a href="index.jsp" class="btn b	tn-danger">Apagar</a>
				</div>
			</div>
		</form>
	</div>
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>
</html>