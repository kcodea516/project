<%--
  Created by IntelliJ IDEA.
  User: 10264
  Date: 2025/7/3
  Time: 17:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title></title>
  <meta name="description" content="">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="robots" content="all,follow">
  <!-- Bootstrap CSS-->
  <link rel="stylesheet" href="vendor/bootstrap/css/bootstrap.min.css">
  <!-- Font Awesome CSS-->
  <link rel="stylesheet" href="vendor/font-awesome/css/font-awesome.min.css">
  <!-- Fontastic Custom icon font-->
  <link rel="stylesheet" href="css/fontastic.css">
  <!-- Google fonts - Poppins -->
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Poppins:300,400,700">
  <!-- theme stylesheet-->
  <link rel="stylesheet" href="css/style.default.css" id="theme-stylesheet">
  <!-- Custom stylesheet - for your changes-->
  <link rel="stylesheet" href="css/custom.css">
  <!-- Favicon-->
  <link rel="shortcut icon" href="img/favicon.ico">
  <link rel="stylesheet" href="static/css/bootstrap.min.css">
  <!-- Tweaks for older IEs--><!--[if lt IE 9]>
  <script src="https://unpkg.com/html5shiv@3.7.3/dist/html5shiv.min.js"></script>
  <script src="https://unpkg.com/respond.js@1.4.2/dest/respond.min.js"></script><![endif]-->
  <script>
    function validatePassword() {
      var password=document.forms["loginForm"]["loginPassword"].value;
      var passwordlength=password.length;
      const regex = /^(?=.*[A-Za-z])(?=.*\d).{4,}$/;
      if(passwordlength<8){
        alert("密码长度至少8位!");
        return false;
      }
      else{
        if(regex.test(password)){
          return true;
        }
        else{
          alert("密码必须包括数字和字母！")
          return false;
        }
      }

    }
  </script>
</head>
<body>
<div class="page login-page">
  <div class="container d-flex align-items-center">
    <div class="form-holder has-shadow">
      <div class="row">
        <!-- Logo & Information Panel-->
        <div class="col-lg-6">
          <div class="info d-flex align-items-center">
            <div class="content">
              <div class="logo">
                <h1>个人健康管理系统</h1>
              </div>
              <p>2-14 康思源 王宏伟 高瑞卿</p>
            </div>
          </div>
        </div>
        <!-- Form Panel    -->
        <div class="col-lg-6 bg-white">
          <div class="form d-flex align-items-center">
            <div class="content">
              <form method="post" class="form-validate" name="loginForm" action="/LoginController" onsubmit=" return validatePassword()">
                <div class="form-group">
                  <input id="login-username" type="text" name="loginUsername" required data-msg="Please enter your username" class="input-material">
                  <label for="login-username" class="label-material">用户名</label>
                </div>
                <div class="form-group">
                  <input id="login-password" type="password" name="loginPassword" required data-msg="Please enter your password" class="input-material">
                  <label for="login-password" class="label-material">密码</label>
                </div>
                <input type="submit" class="btn btn-primary" value="登录">
                <!-- This should be submit button but I replaced it with <a> for demo purposes-->
              </form><a href="#" class="forgot-pass">忘记密码?</a><br><small>还没有注册? </small><a href="register.jsp" class="signup">注册</a>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="copyrights text-center">
    <p>Design by <a href="#" class="external">Bootstrapious</a>
      <!-- Please do not remove the backlink to us unless you support further theme's development at https://bootstrapious.com/donate. It is part of the license conditions. Thank you for understanding :)-->
    </p>
  </div>
</div>
<!-- JavaScript files-->
<script src="vendor/jquery/jquery.min.js"></script>
<script src="vendor/popper.js/umd/popper.min.js"> </script>
<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
<script src="vendor/jquery.cookie/jquery.cookie.js"> </script>
<script src="vendor/chart.js/Chart.min.js"></script>
<script src="vendor/jquery-validation/jquery.validate.min.js"></script>
<!-- Main File-->
<script src="js/front.js"></script>

</body>
</html>
