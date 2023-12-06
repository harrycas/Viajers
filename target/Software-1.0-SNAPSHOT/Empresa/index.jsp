<%-- 
    Document   : index
    Created on : 5 dic. 2023, 17:16:13
    Author     : harryjosecastrorodriguez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;700;800&display=swap" rel="stylesheet">
        <link href="css/styles.css" rel="stylesheet" type="text/css"/>
        <script src="js/script.js" type="text/javascript"></script>
        <title>Viajers Enterprise</title>
    </head>
    <body>
        
        <div class="container-fluid divstyle">
            <form class="container-fluid fstyle" action="AdministradorController" method="POST" onsubmit="return checkLogin()">
                <label>User</label><br><br>
                <input class="inpstyle" id="username" type="text" name="username" placeholder="&nbsp;user" required><br><br>
                <label>Password</label><br><br>
                <input class="inpstyle" id="password" type="password" name="password" placeholder="&nbsp;contraseña" required><br>
                <small id="password-error" style="color: red;"></small><br><br>
                <div class="substyle">
                    <button type="submit" class="bstyle">Log in</button>
                </div>
            </form>
        </div>
        
    </body>
</html>
