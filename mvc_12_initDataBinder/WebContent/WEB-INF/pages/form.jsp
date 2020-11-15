<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>


<h2 style="color: red; text-align: center">Student</h2>
<center>
	<table>
		<frm:form modelAttribute="stdFrm">
           <tr><td>Student no</td> <td> <frm:input path="sno"/> </td> </tr>
            <tr><td>Student name</td> <td> <frm:input path="name"/> </td> </tr>
             <tr><td>Student </td> <td> <frm:input path="address"/> </td> </tr>
              <tr><td>Student no</td> <td> <frm:input path="per"/> </td> </tr>
              <tr><td>Student no</td> <td> <frm:input type="date" path="dob"/> </td> </tr>
              <tr><td colspan="2" align="center"> <input type="submit" value="Submit"/> </td> </tr>
	</frm:form>
	</table>
</center>