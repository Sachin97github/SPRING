<%@ page language="java" isELIgnored="false"%>
<h2 style="color:red;text-align:center;">Welcome ${username} </h2>

 <form method="post" action="studentpanel.htm">

    <table style="width:100%;">
       <tr> 
            <td colspan="3" style="text-align:center;">STUDENT PANEL</td>  
      </tr>
     
     <tr> 
              <td style="text-align:center;">  <input type="submit" value="Add" name="submitType">
              </td>
                <td style="text-align:center;">  <input type="submit" value="Remove" name="submitType">
              </td>
                <td style="text-align:center;">  <input type="submit" value="All Students" name="submitType">
              </td>
     </tr>
     
    </table>
        <h2 style="text-align:center;"><a href="logout.htm">logout</a></h2>
</form>
