<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inventory Management System</title>
</head>
<script type="text/javascript">
    jQuery(function ($) {
        function check_values() {
            if ($("#username").val().length != 0 && $("#password").val().length != 0) {
                $("#button1").removeClass("hidden").animate({ left: '250px' });
                $("#lock1").addClass("hidden").animate({ left: '250px' });
            }
        }
    });
</script>
<style>
    .redborder {
        border: 2px solid #f96145;
        border-radius: 2px;
    }

    .hidden {
        display: none;
    }

    .visible {
        display: normal;
    }

    .colored {
        background-color: #F0EEEE;
    }

    .row {
        padding: 20px 0px;
    }

    .bigicon {
        font-size: 97px;
        color: #f96145;
    }

    .contcustom {
        text-align: center;
        width: 300px;
        border-radius: 0.5rem;
        top: 0;
        bottom: 0;
        left: 0;
        right: 0;
        margin: 10px auto;
        background-color: white;
        padding: 20px;
    }

    input {
        width: 100%;
        margin-bottom: 17px;
        padding: 15px;
        background-color: #ECF4F4;
        border-radius: 2px;
        border: none;
    }

    h2 {
        margin-bottom: 20px;
        font-weight: bold;
        color: #ABABAB;
    }

    .btn {
        border-radius: 2px;
        padding: 10px;
    }

    .med {
        font-size: 27px;
        color: white;
    }

    .medhidden {
        font-size: 27px;
        color: #f96145;
        padding: 10px;
        width: 100%;
    }

    .wide {
        background-color: #8EB7E4;
        width: 100%;
        -webkit-border-top-right-radius: 0;
        -webkit-border-bottom-right-radius: 0;
        -moz-border-radius-topright: 0;
        -moz-border-radius-bottomright: 0;
        border-top-right-radius: 0;
        border-bottom-right-radius: 0;
    }
</style>
<body>
	<form action="login" method="post">

       <div class="container">
    <div class="row colored">
        <div id="contentdiv" class="contcustom">
            <span class="fa fa-spinner bigicon"></span>
            <h2>Login</h2>
			 <div>
                <input id="username" type="text" name="username" placeholder="username" onkeypress="check_values();">
                <input id="password" type="password"  name="password"  placeholder="password" onkeypress="check_values();">
<!--                 <button id="button1" class="btn btn-default wide hidden"><span class="fa fa-check med"></span></button> -->
<!--                 <span id="lock1" class="fa fa-lock medhidden redborder"></span> -->
      		<input type="submit"  value="Login" />
       
            </div>
        </div>
    </div>
</div>
	</form>
</body>
</html>