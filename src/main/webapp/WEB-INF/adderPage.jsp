<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div align="center">

		<form action="<%=request.getContextPath() %>/controller" method="post">

			<table style="with: 80%">


				<tr>
					<td>Put the first number</td>
					<td><input type="number" name="firstnumber" /></td>
				</tr>

				<tr>
					<td>Put the second number</td>
					<td><input type="number" name="secondnumber" /></td>
				</tr>

			</table>

			<input type="submit" value="Submit" />

		</form>
	

	</div>
	

</body>
</html>