<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<center>
	<c:choose>
		<c:when test="${listFiles ne null && !empty listFiles}">
			<table border="2">
			 <h2>All Files</h2>
				<c:forEach var="fileName" items="${listFiles}">
					<tr>
						<td>${fileName}</td>
					<td>	<a href="download.htm?filename=${fileName}">download</a></td>
					</tr>
				</c:forEach>
			</table>
		</c:when>
		<c:otherwise>
      No Files Are Found
  </c:otherwise>

	</c:choose>


</center>