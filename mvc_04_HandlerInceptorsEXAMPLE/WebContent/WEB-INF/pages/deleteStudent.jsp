<%@ page language="java" isELIgnored="false"%>
<h2 style="color: red; text-align: center;">Welcome ${username}</h2>

<form method="post" action="studentmgmt.htm">

	<table
		style="border: 1px; width: 40%; margin-left: 15%; margin-right: 15%;">
		<tr>
			<td>Student ID</td>
			<td><input type="text" name="id"></td>
		</tr>
		<tr>

			<td colspan="2" style="text-align: center;"><input type="submit"
				name="submit" value="remove"></td>
		</tr>
	</table>



</form>
