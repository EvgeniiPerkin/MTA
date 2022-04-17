<#macro page>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>MTA</title>
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
	<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.6.0/dist/jquery.min.js"></script>
    </head>
<body>
	<#include "navbar.ftlh">
	<div class="container mt-5">
		<#nested>
	</div>
</body>
</html>
</#macro>