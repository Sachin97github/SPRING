<%@ page  isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
 <head>
   <script language="JavaScript" src="js/validation.js">
</script>
 </head>

<div>
   <script language="JavaScript" src="js/validation.js">
</script>
<center>
       <h2> EMPLOYEE FORM</h2>
    <frm:form modelAttribute="employee"  onsubmit="return validate(this)" >
        
           Eno___<frm:input path="eno"/> <br>
           Ename <frm:input path="ename"/>  <frm:errors path="ename"/>    <span id="enameError"> </span> <br>
           Salary_<frm:input path="sal"/>   <frm:errors path="sal" />     <span id="salError"> </span><br>
           Dept no <frm:select path="deptno">
                             <frm:options items="${deptNumbers}"/>  
                        </frm:select>
                        <frm:hidden path="scriptStatus"/>
                        
                  <input type="submit" value="Submit">    
    </frm:form>
</center>
  
</div>