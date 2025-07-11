<%--
  Created by IntelliJ IDEA.
  User: 10264
  Date: 2025/7/3
  Time: 22:56
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
  <!-- Tweaks for older IEs--><!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script><![endif]-->
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
                <h1>Dashboard</h1>
              </div>
              <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</p>
            </div>
          </div>
        </div>
        <!-- Form Panel    -->
        <div class="col-lg-6 bg-white">
          <div class="form d-flex align-items-center">
            <div class="content">
              <form class="form-validate" name="registerform" action="/RegisterController">
                <div class="form-group">
                  <input id="register-username" type="text" name="registerUsername" required data-msg="Please enter your username" class="input-material">
                  <label for="register-username" class="label-material">User Name</label>
                </div>
                <div class="form-group">
                  <input id="register-email" type="email" name="registerEmail" required data-msg="Please enter a valid email address" class="input-material">
                  <label for="register-email" class="label-material">Email Address      </label>
                </div>
                <div class="form-group">
                  <input id="register-password" type="password" name="registerPassword" required data-msg="Please enter your password" class="input-material">
                  <label for="register-password" class="label-material">password        </label>
                </div>
                <div class="form-group terms-conditions">
                  <input id="register-agree" name="registerAgree" type="checkbox" required value="1" data-msg="Your agreement is required" class="checkbox-template">
                  <label for="register-agree">Agree the terms and policy</label>
                </div>
                <div class="form-group">
                  <button id="regidter" type="submit" name="registerSubmit" class="btn btn-primary">Register</button>
                </div>
              </form><small>Already have an account? </small><a href="index.jsp" class="signup">Login</a>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="copyrights text-center">
    <p>Copyright &copy; 2019.Company name All rights reserved.<a target="_blank" href="https://www.uimaker.com/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a></p>
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
