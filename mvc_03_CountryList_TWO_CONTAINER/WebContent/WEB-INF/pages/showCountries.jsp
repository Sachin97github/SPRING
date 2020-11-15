<%@ page import="java.util.Set" isELIgnored="false" %>


 <h2 style="color:red;text-align:center;"">WELCOME TO SPRING MVC</h2>
 
  <%  
  Set<String> countries=(Set<String>)request.getAttribute("countries");
          if(countries!=null)
          { 
             for(String country:countries)
        {        
  %>
       <% out.print("SACHIN"); %>
 <% }
 }
  else{
  %>
    No result Found
   <%} %> 
 