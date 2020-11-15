<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
     <c:if test="${resultMsg ne null }">
     <h2 style="color: green; text-align: center;"> ${resultMsg} </h2>
     </c:if>
<h2 style="color: red; text-align: center;">Employee List</h2>
<c:choose>
	<c:when test="${listEmp ne null && !empty listEmp}">
		<table align="center" border="2" >
			<tr>
				<th>Serial No</th>
				<th>Id</th>
				<th>Name</th>
				<th>Job</th>
				<th>Dept no</th>
				<th>Salary</th>
				<th>Net Salary</th>
				<th>Gross Salary</th>
				<th>Operation</th>
			</tr>
			<c:forEach var="dto" items="${listEmp}">
				<tr>
					<td>${dto.serialNo}</td>
					<td>${dto.eNo}</td>
					<td>${dto.eName}</td>
					<td>${dto.job}</td>
					<td>${dto.deptNo}</td>
                     <td>${dto.sal}</td>
					<td>${dto.netSalary}</td>
					<td>${dto.grossSalary}</td>
					<td><a href="editEmp.htm?eno=${dto.eNo}">Edit</a>
					   <a href="deleteEmp.htm?eno=${dto.eNo}"   onclick="confirm('are u sure delete ${dto.eName}')">Delete</a>
					</td>
               </tr>
			</c:forEach>
		</table>
	</c:when>
	<c:otherwise>
               No record Found
    </c:otherwise>
</c:choose>

 <h2 style="color: red; text-align: center;">
                               <a href="addEmp.htm">Add Employee</a>
                               <a href="home.htm">Home Employee</a>
                               <a  href="JavaScript:doPrint()">Print</a>
                               </h2>
 <script language="JavaScript">
      function doPrint(){
    	  frames.focus();
    	  frames.print();
      }
 </script>


