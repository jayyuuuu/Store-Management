<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>

<% 
    if(request.getParameter("submit")!=null)
    {
        String id = request.getParameter("id");
        String name = request.getParameter("cus_name");
        String contact = request.getParameter("con_no");
        String  address= request.getParameter("address");
       
        
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/shop","root","jayzz");
        pst = con.prepareStatement("update customer set cus_name = ?,con_no =?,address= ? where id = ?");
        pst.setString(1, name);
        pst.setString(2, contact);
        pst.setString(3, address);
        pst.setString(4, id);
        pst.executeUpdate();  
        
        %>
        
        <script>   
            alert("Record Updated");           
       </script>
 
                
    <%             
    }
 
%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>R & D</title>
        <style>
            
            *{
                margin:0;
                padding:0;
            }
            
            body{
                background-color: rgba(0, 0, 0, 0.418);
            }
           input[type=text], select {
            width: 40%; 
            color: #000;
            padding: 12px; 
            text-align: left;
            font-size: 15px;
            border: 1px solid #ccc;
            border-radius: 10px;
            box-sizing: border-box; 
            margin-top: 6px;
            margin-bottom: 10px;
            margin-left: 10px;
            resize: vertical; 
            background-color: rgb(197, 183, 183);
          }
            input:focus {
           outline:none;
            }

      input[type=submit] {
            background-color: #4caf4fe0;
            color: white;
            padding: 8px 35px;
            border: 2px solid orange;
            border-radius: 10px;
            cursor: pointer;
            margin-top: 20px;
            margin-right: 260px;
            }

        
          input[type=submit]:hover {
            background-color: #45a049;
            border: 2px solid yellow;
          }


          .container {
            border-radius: 5px;
            padding: 15px;
          }
          form{
               text-align: center;
          }
        
               h1{
                   font-size: 45px;
                   text-align: center;
                   color:  #000000c4;
                   margin-top: 40px;
                   margin-bottom: 20px;
               }
  nav h1{
   color: white;
   font-size: 30px;
  display: flex;
  position: absolute;
  top: -20px;
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
        <h1> Update Customer Details </h1>
        <div class="container">
       <form method="POST" action="#">
            
           <%    
                        Connection con;
                        PreparedStatement pst;
                        ResultSet rs;
        
                         Class.forName("com.mysql.jdbc.Driver");
                         con = DriverManager.getConnection("jdbc:mysql://localhost/shop","root","jayzz");
                           
                        String id = request.getParameter("id");
                          
                        pst = con.prepareStatement("select * from customer where id = ?");
                        pst.setString(1, id);
                        rs = pst.executeQuery();
                        
                while(rs.next())
                {
                    
                    %>
               <label for="cus_name">Customer Name :</label>
               <input type="text" id="cus_name" name="cus_name"><br>

               <label for="con_no">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Mobile No :</label>
               <input type="text" id="con_no" name="con_no" ><br>

               <label for="address">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Address :</label>
               <input type="text" id="address" name="address" ><br>
               
               <% } %>
               
               <input  type="submit" value="Submit" id="submit" name="submit">
<!--               <p><a href="index.jsp">Click Back</a></p>-->
        
         
          
       </form>
</div>
</body>
</html>