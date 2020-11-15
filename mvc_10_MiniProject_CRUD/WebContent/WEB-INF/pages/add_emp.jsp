<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<center>
      <h2>Add Employee</h2>
     <frm:form modelAttribute="empFrm">
      Name - <frm:input path="eName"/> <br><br>
      Job - <frm:input path="job"/> <br><br>
      Sal - <frm:input path="sal"/> <br><br>
     
     <frm:select path="deptNo">
            <frm:options items="${deptNoFrm}" /> <br><br>
     </frm:select>    
  <input type="submit"  value="register"> 
     </frm:form>
</center>