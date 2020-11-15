<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

  <center><h2>Result</h2>
 
 
    <table>
           <c:forEach var="name" items="${nameInfo}">
                   <tr> 
                        <td> ${name} </td>
                   </tr>
           </c:forEach>
         <hr>
         <c:forEach var="addr" items="${addrInfo }">
                <tr> 
                       <!-- It will print Value as well as Key -->
                        <td> ${addr} </td>
                        <!-- IT will print Only Value -->
                        <td> ${addr.key} </td>
                   </tr>
         </c:forEach>
         <hr>
         <c:forEach var="contact" items="${contactInfo}">
                <tr> 
                        <td> ${contact} </td>
                   </tr>
         </c:forEach>
  </table>
  </center>
  
  