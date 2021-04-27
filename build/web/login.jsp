<%-- 
    Document   : login
    Created on : Apr 21, 2021, 5:51:11 PM
    Author     : jayzz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title> R&D Login</title>

   <style>

@import "https://use.fontawesome.com/releases/v5.5.0/css/all.css";
body{
  margin: 0;
  padding: 0;
  font-family: sans-serif;
  background: url(https://images.unsplash.com/photo-1617286647344-95c86d56748a?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=889&q=80) no-repeat;
  background-size: cover;
}
.login-box{
  width: 280px;
  height: 400px;
  /* border: 2px solid black; */
  padding: 20px;
  border-radius: 20px;
  position: absolute;
  top: 50%;
  left: 50%;
  background-color: rgba(14, 13, 13, 0.541);
  transform: translate(-50%,-50%);
  color: white;
}
h2,h5{
  text-align: center;
}
.login-box h1{
  float: left;
  font-size: 40px;
  border-bottom: 6px solid #4caf50;
  margin-bottom: 50px;
  /* padding: 13px 0; */
}
.textbox{
  width: 100%;
  overflow: hidden;
  font-size: 20px;
  padding: 8px 0;
  margin: 8px 0;
  border-bottom: 1px solid #4caf50;
}
.textbox i{
  width: 26px;
  float: left;
  text-align: center;
}
.textbox input{
  border: none;
  outline: none;
  background: none;
  color: white;
  font-size: 18px;
  width: 80%;
  float: left;
  margin: 0 10px;
}
.btn{
  width: 100%;
  background: none;
  border: 2px solid #4caf50;
  color: white;
  padding: 5px;
  font-size: 18px;
  cursor: pointer;
  margin: 12px 0;
}
#opac{
  width: 100vw;
  height: 100vh;
  background-color: rgba(0, 0, 0, 0.514);
}






    </style>




</head>
  <body>

  <div id="opac"></div>
<div class="login-box">
  <h2>Recent & Decent</h2>
  <h1>Admin Login</h1>
  <div class="textbox">
    <i class="fas fa-user"></i>
    <input type="text" placeholder="Admin ID">
  </div>

  <div class="textbox">
    <i class="fas fa-lock"></i>
    <input type="password" placeholder="Password">
  </div>

  <input type="button" class="btn" value="Sign in" onclick="window.location.href='home.jsp';">
  <h5>Not a user? <a href="#" style="text-decoration: none; color: yellow">Register here!</a></h5>
</div>
   
  </body>
</html>
