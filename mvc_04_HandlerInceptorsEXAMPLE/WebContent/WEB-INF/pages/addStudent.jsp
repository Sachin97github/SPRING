<%@ page language="java" isELIgnored="false"%>
<h2 style="color: red; text-align: center;">Welcome ${username}</h2>

<form method="post" action="studentmgmt.htm">

	<table
		style="border: 1px; width: 40%; margin-left: 15%; margin-right: 15%;">
		<tr>
			<td>Name</td>
			<td><input type="text" name="name"></td>
		</tr>
		<tr>
			<td>Father Name</td>
			<td><input type="text" name="fatherName"></td>
		</tr>

		<tr>
			<td>Contact</td>
			<td><input type="text" name="contact"></td>
		</tr>

		<tr>
			<td>Email</td>
			<td><input type="text" name="email"></td>
		</tr>

		<tr>
			<td>DOB</td>
			<td><input type="text" name="dob"></td>
		</tr>
		<tr>
			<td colspan="2" style="text-align: center;"><input type="submit"
				name="submit" value="register"></td>
		</tr>
	</table>

</form>
