<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="utf-8">
		<title>Pesquisa de opini�o</title>
		</head>
	<body>
		<h2>Pesquisa de Opini�o</h2>
		
		<form action="GravarOpiniao" method="post">
		<fieldset>
			<legend>Deixa a sua opini�o</legend>
		
			<p>Qual das cores voc� gosta mais em um carro?</p>
			<input type="radio" name="cor" value="azul">Azul
			<input type="radio" name="cor" value="bege">Bege
			<input type="radio" name="cor" value="branco">Branco
			<input type="radio" name="cor" value="cinza">Cinza
			<input type="radio" name="cor" value="preto">Preto
			<input type="radio" name="cor" value="vermelho">Vermelho
			
			<hr>
			
			<input type="submit" value="Enviar Opini�o">	
		</fieldset>
		</form>
	</body>
</html>