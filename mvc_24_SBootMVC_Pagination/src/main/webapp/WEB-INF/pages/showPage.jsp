<%@ page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:choose>
	<c:when test="${ page ne null &&!empty page}">
		<table>
			<tr>
				<th>Number</th>
				<th>Model</th>
				<th>Company</th>
				<th>Price</th>
			</tr>
			<c:forEach var="dto" items="${page.getContent() }">
				<tr>
					<td>${dto.sno}</td>
					<td>${dto.model}</td>
					<td>${dto.company}</td>
					<td>${dto.price}</td>
				</tr>
			</c:forEach>
		</table>

		<a href="mobilePage?page=0">First Page</a>
 &nbsp;&nbsp;&nbsp;
 
<c:if test="${!page.isFirst()}">
			<a href="mobilePage?page=${ page.getNumber()-1}">Previous</a>&nbsp;&nbsp;&nbsp;
</c:if>

		<c:forEach var="i" begin="0" end="${page.getTotalPages()-1}">
          [<a href="mobilePage?page=${i}"> ${i+1}</a>]    &nbsp;&nbsp;&nbsp;
        </c:forEach>

		<c:if test="${!page.isLast()}">
			<a href="mobilePage?page=${ page.getNumber()+1}">Next</a>&nbsp;&nbsp;&nbsp;
     </c:if>

		<a href="mobilePage?page=${ page.getTotalPages()-1}">last</a>&nbsp;&nbsp;&nbsp;
 
	</c:when>
	<c:otherwise>
		<h2>No Records Found</h2>
	</c:otherwise>
</c:choose>

