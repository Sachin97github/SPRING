<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>


<h2 style="color:red;text-align:center" >JobSeekerInfo</h2>
<center>
<frm:form modelAttribute="jobSeekerInfo" enctype="multipart/form-data">
   <table>
       <tr>   <td>Name</td>  <td> <frm:input path="name"/> </td>   </tr>
       <tr>   <td>Location</td>  <td><frm:input path="location"/> </td>   </tr>
       <tr> <td>Resume</td><td><input type="file" name="resume"></td>   </tr>
       <tr><td>Photo</td><td><input type="file" name="photo"></td>   </tr>
       <tr><td colspan="2" align="center"><input type="submit" value="Submit"></td></tr>
   </table>
</frm:form>
 <a href="showList.htm">All Files</a>
</center>