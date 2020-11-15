<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<center>
	<h2>Result</h2>

	<c:choose>
		<c:when test="${ studList ne null && !empty studList}">
                   <c:forEach var="student" items="${studList}">
                                Details :: <br>
                                        ${student.sno}<br>
                                        ${student.sname}<br>
                                        ${student.address} 
                                        <hr>
                   </c:forEach>
		</c:when>
	<c:otherwise>
			<h2>NO RECORDS ARE FOUND</h2>
		</c:otherwise>

	</c:choose>

</center>

