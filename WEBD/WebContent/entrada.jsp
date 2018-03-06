<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ENTRADA DE DADOS</title>
</head>
<body>
	<form action="cotacao_servlet" method="post">
		<table>
			<tr>
				<td>Nome:</td>
				<td><input type="text" name="nome" /></td>
			</tr>
			<tr>
				<td>Produto:</td>
				<td><input type="text" name="produto" /></td>
			</tr>
			<tr>
				<td>Valor R$:</td>
				<td><input type="number" name="valor" min="1000" /></td>
			</tr>
			<tr>
				<td>Data Início:</td>
				<td><input type="date" name="dataInicio" /></td>
			</tr>
			<tr>
				<td>Data Fim:</td>
				<td><input type="date" name="dataFim" /></td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: right;"><input type="submit"
					value="Enviar" /></td>
			</tr>

		</table>
		<h3 style="color: red;">${erro}</h3>
	</form>
</body>
</html>