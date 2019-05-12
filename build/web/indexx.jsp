<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://jqueryvalidation.org/files/demo/site-demos.css">
	<link rel="stylesheet" type="text/css" href="stylee.css">
    </head>
 <body class="form" >
	<div class="page">
		<div class="form-content">
		<div class="form-left">
			<h2>INFORMATION</h2>
							<p class="text-1">Get the full-time part-time jobs , hundreds of people getting job everyday . sign up now and get you dream job and upload your resume after sign up you will notify if anyone want to hire you.</p>
				<p class="text-2"><span>Premium:</span> Get our premium account you will be listed on the top when recruiter will search job with your skills.</p>
				<div class="form-left-last">
                                    <a href="index.jsp"><input type="submit" name="account" class="account" value="Sign Up Now !" ></a>
				</div>
		</div>
		<form action="Login"  class="form-detail"  method="post" id="myform">
		<center><h2>SIGN-IN</h2></center>
			<div class="form-row">
				<label for="your_email">Your Email</label>
					<input type="text" name="ye" id="your_email" class="input-text"  required pattern="[^@]+@[^@]+.[a-zA-Z]{2,6}">
			</div>
				<div class="form-group">
					<div class="form-row form-row-1 ">
						<label for="password">Password</label>
						<input type="password" name="pw" id="password"  class="input-text" required>
					</div>
				</div>
				<div class="form-row-last">
					<input type="submit" name="register" class="register" value="Register" >
				</div>
                </form>
			</div>
	</div>

</body>
</html>
