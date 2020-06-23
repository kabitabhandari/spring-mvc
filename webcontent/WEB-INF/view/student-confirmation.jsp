<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Confirmation</title>
</head>
<body>
The confirmed student is: ${student.firstName } ${student.lastName }  	// calls student.getFirstName(), 		calls student.getLastName()
<br><br>
Confirmed student country is: ${student.country }	
<br><br>
favorite language  is: ${student.favoriteLanguage}
<br><br>
Operating Systems:
<ul>
	<c:forEach var= "temp" items ="${student.operatingSystems }">
		<li>${temp } </li>
	
	
	</c:forEach>
</ul>




</body>
</html>