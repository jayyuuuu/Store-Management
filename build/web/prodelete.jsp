<%-- 
    Document   : prodelete
    Created on : Apr 22, 2021, 2:08:38 AM
    Author     : jayzz
--%>
<%@page import="java.sql.*" %> 
<% 
        String id = request.getParameter("id");
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/shop","root","jayzz");
        pst = con.prepareStatement("delete from product where pid = ?");
        pst.setString(1,id);
        pst.executeUpdate();  
        
        %>
        
        <script>
            
            alert("Product Deleted");
            location. href = "allproducts.jsp";   
         </script>


   