<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<%@ taglib  uri="http://www.springframework.org/tags/form"  prefix="frm" %>
 <center>
<frm:form modelAttribute="empFrm">
       <table>
                      <tr><td>Id</td> <td> <frm:input path="eNo" readonly="true"/></td> </tr>    
                      <tr><td>Name</td> <td> <frm:input path="eName"/> </td></tr> 
                      <tr><td>Job</td> <td><frm:input path="job"/> </td></tr> 
                      <tr><td>Salary</td>  <td><frm:input path="sal"/></td> </tr> 
                      <tr><td>Department no</td>
                               <td><frm:select path="deptNo">
                                    <frm:options items="${deptNoFrm}"></frm:options>
                               </frm:select></td>
                       </tr> 
                       <tr><td colspan="2" align="center" ><input type="submit" value="Update Student"></td></tr>
       </table>
   </frm:form>
<center>
