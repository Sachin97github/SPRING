<%@ page language="java" contentType="text/html;" isELIgnored="false" %>
<%@taglib  uri="http://www.springframework.org/tags/form" prefix="frm" %>
<center>
      <h2>Login Page</h2>
     <frm:form modelAttribute="user">
         <table>
        <tr> 
         <td>Username</td> <td> <frm:input path="uname"/></td>
        </tr>
          <tr> 
         <td>Password</td> <td> <frm:input path="pword"/></td>
        </tr>
        <tr> 
         <td colspan="2" align="center"><input type="submit" value="Login"/></td>
        </tr>
     </table>
     </frm:form>     
</center>
