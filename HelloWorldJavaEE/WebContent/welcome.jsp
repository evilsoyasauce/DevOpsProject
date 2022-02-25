<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
.footer {
	position: fixed;
	left: 0;
	bottom: 0;
	width: 100%;
	background-color: grey;
	color: white;
	text-align: center;
}
</style>
<title>Welcome Page</title>
</head>
<body>
	<div
		style="background: url(https://imagesvc.meredithcorp.io/v3/mm/image?q=85&c=sc&poi=face&w=2000&h=1000&url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F43%2F2020%2F01%2FFresh-Salmon-Fillets-by-FudioGetty-Images-2000.jpg); background-size: cover;"
		style="background-repeat: no-repeat"
		class="jumbotron bg-cover text-white">
		<div class="container py-5 text-center">
			<h1 class="display-4 font-weight-bold">Welcome</h1>
			<p class="font-italic mb-0">We sell cheap salmon fish here.
				Please log in to purchase</p>
			<br> <a href="<%=request.getContextPath()%>/register.jsp" class="registerButton" role="button" class="btn btn-primary px-5">Register</a>
			<a href="<%=request.getContextPath()%>/login.jsp" class="loginButton" role="button" class="btn btn-warning px-5">Login</a>
		</div>
	</div>

	<div id="content" role="contentinfo" class="container py-5">
		<h2 class="h3 font-weight-bold">Salmon benefits</h2>
		<div class="row">
			<div class="col-lg-10 mb-4">
				<p class="font-italic text-muted">A 3.5-ounce (100-gram) portion
					of farmed salmon has 2.3 grams of long-chain omega-3 fatty acids,
					while the same portion of wild salmon contains 2.2 grams.</p>
				<p class="font-italic text-muted">Unlike most other fats,
					omega-3 fats are considered "essential," meaning you must get them
					from your diet since your body cannot create them.</p>
				<p class="font-italic text-muted">Generally, most health
					organizations recommend that healthy adults get a minimum of
					250-1,000 mg of combined EPA and DHA per day.</p>
				<p class="font-italic text-muted">EPA and DHA have been credited
					with several impressive health benefits, such as decreasing
					inflammation, lowering blood pressure, reducing the risk of cancer,
					and improving the function of the cells that line your arteries.</p>
			</div>
		</div>
	</div>
	<div class="footer">
		<div class="container">
                <p class="copyright">Sellfish © 2022</p>
            </div>
	</div>

</body>
</html>