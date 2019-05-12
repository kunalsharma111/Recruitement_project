<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://jqueryvalidation.org/files/demo/site-demos.css">
	<link rel="stylesheet" type="text/css" href="style.css">
    </head>
 <body class="form" >
	<div class="page">
		<div class="form-content">
		<div class="form-left">
			<h2>INFORMATION</h2>
							<p class="text-1">Get the full-time part-time jobs , hundreds of people getting job everyday . sign up now and get you dream job and upload your resume after sign up you will notify if anyone want to hire you.</p>
				<p class="text-2"><span>Premium:</span> Get our premium account you will be listed on the top when recruiter will search job with your skills.</p>
				<div class="form-left-last">
                                    <a href="indexx.jsp"> <input type="submit" name="account" class="account" value="Have An Account" ></a>
				</div>
		</div>
		<form action="Savesign" method="post" class="form-detail"   id="myform">
		<center><h2>SIGN-UP</h2></center>
			<div class="form-group">
				<div class="form-row form-row-1">
					<label for="first_name">First Name</label>
					<input type="text" name="first_name" id="first_name" class="input-text" required >
				</div>
				<div class="form-row form-row-1">
					<label for="last_name">Last Name</label>
					<input type="text" name="last_name" id="last_name" class="input-text" required>
				</div>
			</div>
			<div class="form-row">
				<label for="your_email">Your Email</label>
					<input type="text" name="your_email" id="your_email" class="input-text"  required pattern="[^@]+@[^@]+.[a-zA-Z]{2,6}">
			</div>
				<div class="form-group">
					<div class="form-row form-row-1 ">
						<label for="password">Password</label>
						<input type="password" name="password" id="password"  class="input-text" required>
					</div>
					<div class="form-row form-row-1">
						<label for="comfirm-password">Comfirm Password</label>
						<input type="password" name="comfirm_password" id="comfirm_password"  class="input-text" required>
					</div>
				</div>
                		<div class="form-checkbox">
					<label class="container"><p>I agree to the <a href="#" class="text">Terms and Conditions</a></p>
					  	<input type="checkbox" name="checkbox">
					  	<span class="checkmark"></span>
					</label>
				</div>
				<div class="form-row-last">
					<input type="submit" name="register" class="register" value="Register" >
				</div>
                </form>
			</div>
	</div>

</body>
</html>
