<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="Soren" class="com.blog.beans.Article" scope="request" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>Vous êtes sur un article</p>
	<p>
		<% 
            String attribut = (String) request.getAttribute("test");
            out.println( attribut );

            String parametre = request.getParameter( "auteur" );
            out.println( parametre );
            %>
	</p>
	
	<p>
		<jsp:setProperty name="Soren" property="prenom" value="Soren Einarsson" />
		${Soren.prenom}
	</p>
</body>
</html>