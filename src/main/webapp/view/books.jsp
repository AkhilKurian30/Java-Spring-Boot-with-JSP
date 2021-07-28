<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/main.js"></script>
<html>
    <head>
        <title> Books</title>
    </head>
    <body>
        <div>
        
          <c:forEach items="${books}" var="book">  
                Book id : ${book.id}<br>
              
                Book name :  <a title="Click here to know author" href="/book/${book.id}"> ${book.name}</a>
                <!-- Book author : ${book.author}<br> -->
                <br>
                <br>
            </c:forEach>
      <button onclick="myFunction()">Click </button>
        </div>
    </body>
</html>