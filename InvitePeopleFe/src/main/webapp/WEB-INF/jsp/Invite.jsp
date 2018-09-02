<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="footer.jsp"%>
<%@include file="header.jsp"%>
<html>
<head>
<title>Invite Page</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
input[type=text] {
	width: 100%;
	padding: 15px;
	margin: 5px 0 22px 0;
	display: inline-block;
	border: none;
	background: white;
}

input[type=text]:focus {
	background-color: #ddd;
	outline: none;
}

body {
	
	background-image : linear-gradient(#F5F5DC,#6495ED,#C0C0C0);
	height: 600px;
}

h2 {
	color: #069;
	font-size: 40px;
}


.btn {
    background-color: #008CBA; 
    border: none;
    color: white;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
}
.btn:hover {
	opacity: 1;
}
</style>
</head>


<body>

	<center>
		<h2>
			<font>Refer and Earn</font>
		</h2>
		<table>
			<tr>
				<td>Enter your email id:</td>
				<td><input type="text" id="txtId" name="txtName"></input></td>
			</tr>
			<tr align="center">
				<td colspan=2><input type="button" value="Get Referral Code" class="btn"
					onclick="location.href='/Invite/'+document.getElementById('txtId').value">
				</td>
			</tr>

		</table>
	</center>
<br>
<br>
	<center>
		<font color="Black">When your friend joins CapStore using your referral code then you will
		 get a discount of 20% on your next purchase</font>
	</center>
	<br>
	<form action="#">
	<center>
	<table>
	<tr>
	<td align="left">Email</td>
	<td align="left">Referral Code</td>
	</tr>
	<tr>
	<td align="left">${obj.customer_email}</td>
	<td align="center">${obj.customer_refcode}</td>
	</tr>
	<tr align="center">
	<td colspan=2><a href="Success">Send Invite</a></td>
	</tr>
	</table>
	</center>
	</form>
</body>
</html>