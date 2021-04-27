<%-- 
    Document   : customerList
    Created on : Apr 20, 2021, 11:59:09 PM
    Author     : jayzz
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
              *{
            margin: 0;
            padding: 0;
              }
          body{
            background-color: rgba(0, 0, 0, 0.418);
        }
            h1{
                text-align: center;
                margin-top: 30px;
                margin-bottom: 20px;  
            }
            table {
             width: 80%;
             margin-left:80px;
              border-collapse: collapse;
            }
            
            table, th{
                 border: 4px solid black;
                 height: 50px;
                 background-color: lightsalmon;
            }
            
           table,td{
           border: 2px solid black;
           height: 30px;
          }
          tr{
              background-color: lightgoldenrodyellow;
          }
          tr:nth-of-type(odd){
              background-color: lightcyan;
          } 
          nav h1{
  font-size: 30px;
  display: flex;
  position: absolute;
  top: -10px;
  left: 20px;
}

nav{
  background-color: rgba(0, 0, 0, 0.685);
  width: 100%;
  height: 70px;
  color: white;
  text-align: right;
}

#menu{
  padding-top: 20px;
  margin-right: 20px;
  /* border: 2px solid red; */
}

nav div a{
  text-decoration: none;
  font-size: 20px;
  color: white;
  padding: 10px;
}
    nav div a:hover{
    color: orange;
}  
            
       
        </style>
    
    
    
    
    </head>
    
    
    
    
    
    <body>
         <nav>
             <div class="contain">
              <h1> R & D</h1>
             <div id="menu">
            <a href="home.jsp">Home</a>
          </div>
     </nav>
        <div class="table">
                

            <h1>List of Our Customers</h1>
            <table>
              <tr>
                <th>Customer Name</th>
                <th>Contact No.</th>
                <th>Address</th>
                <th>Edit</th>
                <th>Delete</th>
              </tr>
              

              
        <%  
                Connection con;
            
                java.sql.ResultSet rs;

                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/shop","root","jayzz");
                String query = "select * from customer";
                Statement st = con.createStatement();

                rs =  st.executeQuery(query);

                  while(rs.next())
                   {
                       String id=rs.getString("id");
              
              %>
              
              <tr>
                  <td><%=rs.getString("cus_name") %></td>
                  <td><%=rs.getString("con_no") %></td>
                  <td><%=rs.getString("address") %></td>
                  <td> <a href="update.jsp?id=<%=id%>"> Edit </a> </td>
                  <td> <a href="delete.jsp?id=<%=id%>"> Delete </a></td>
              </tr>
              
              <%
                } 
              %>
              
            </table>
                
            </div>
           
    </body>
</html>
