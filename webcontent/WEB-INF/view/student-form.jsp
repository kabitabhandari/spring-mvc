<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
	<title>Student Registration Form</title>

</head>
<body>
	<form:form action ="processForm" modelAttribute ="student">
	First name: <form:input path ="firstName" />
	<br><br>

	Last name: <form:input path ="lastName" />
	<br><br>
	
	Country: 
	<form:select path ="country">
			<form:option value ="Np " label =" Nepal" />   <!--Nepal displayed to screen, Nepal is stored as np internally. Np can be same as nepal too  -->
			<form:option value =" In" label =" India" />
			<form:option value =" Am" label =" America" />
			<form:option value =" Au" label =" Australia" />
			<form:option value =" Bz" label ="Brazil " />
			<form:option value =" Pk" label =" pakistan" />	
	</form:select>
	<br><br>
	
	Vacation:
		<form:select path ="vacationOptions">
			<form:options items ="${ student.vacationOptions}" />   <!--Nepal displayed to screen, Nepal is stored as np internally. Np can be same as nepal too  -->

	</form:select>
	
	<br><br>
	Favorite Language:
		Java <form:radiobutton path ="favoriteLanguage" value ="java" />
		c <form:radiobutton path ="favoriteLanguage" value ="c" />
		c#<form:radiobutton path ="favoriteLanguage" value ="c#" />
		PHP<form:radiobutton path ="favoriteLanguage" value ="PHP" />
		RUBY <form:radiobutton path ="favoriteLanguage" value ="Ruby" />
			<br><br>
		
	Operating Systems:
	 Linux <form:checkbox path ="operatingSystems" value = "linux" />
	 Mac OS <form:checkbox path ="operatingSystems" value = "Mac OS" />
	 MS Windows <form:checkbox path ="operatingSystems" value = " MS Windows"/>
	 Unix <form:checkbox path ="operatingSystems" value = "Unix" />
		
			<br><br>
	<input type ="submit" value="submit">

	</form:form>
</body>
</html>