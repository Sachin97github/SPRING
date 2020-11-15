<%@  page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"  %>

<h2 style="text-align:center;color:red;">Product Data</h2>
<frm:form modelAttribute="product">
      <table align="center">
            <tr>
                  <td>Product Id </td><td> <frm:input path="id"/> </td>
            </tr>
             <tr>
                  <td>Product Name </td><td> <frm:input path="name"/> </td>
            </tr>
             <tr>
                  <td>Product Quantity </td><td> <frm:input path="quantity"/> </td>
            </tr>
             <tr>
                  <td>Product Price </td><td> <frm:input path="price"/> </td>
            </tr>
             <tr>
                  <td colspan="2" text-align="center"> <input type="submit" , value="Register Student"/> </td>
            </tr>      
      </table>
</frm:form>