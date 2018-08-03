<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Formulario de Cadastro</title>
</head>
<body>

	<h1>Cadastro de veiculo</h1>
	<form action="enviar" method="post">
		<div>
			<label for="id-placa">Placa</label>
			<input type="text" name="placa" id="id-placa">
		</div>
		<div>
			<label for="id-preco">Preco</label>
			<input type="text" name="preco" id="id-preco">
		</div>
		<div>
			<input type="checkbox" name="automatico" id="idAutomatico">
			<label for="idAutomatico">Automatico</label>
		</div>
		<div>
			<label for="id-marca">Marca</label>
			<select id="id-marca" name="marca">
				<option value="ford" selected="ford">Ford</option>
				<option value="fiat" >Fiat</option>
				<option value="tesla" >Tesla</option>
			</select>
		</div>
		<input type="submit" value="Ok">
	</form>

	${msg}</br>
	${carro.placa}</br>
	${carro.preco}</br>
	${carro.automatico}</br>
	${carro.marca}
	
</body>
</html>