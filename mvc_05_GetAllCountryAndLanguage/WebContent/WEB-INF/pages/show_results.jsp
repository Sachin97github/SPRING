<%@ page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <h2 style="color:red;text-align:center"> Get All ${operation} Name</h2>

<c:choose>
	<c:when test="${infoList ne null && !empty infoList }">
	  <table>
	      <c:forEach var="country" items="${infoList }">
	         <tr>
	                   <td style="color:red"> ${country }</td>
	         </tr>
	      </c:forEach>
	  </table>
	  <br>
 <h3> Get ${operation} Count  :: ${counter} </h3>
	</c:when>
	<c:otherwise>
	<h2 style="color:red;text-align:center;">No Records Found</h2>
   </c:otherwise>
	</c:choose>
	<h2> <a href="home">Home</a></h2>
	