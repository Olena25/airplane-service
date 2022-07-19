<!Doctype html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<body>
<h2>Airplanes list</h2>
<ul>
    <c:forEach items="${airplanes}" var="airplane">
        <li>Airplane name: ${airplane}</li>
    </c:forEach>
</ul>
<br><br>
<form action="/" method="GET">

    <input type="submit" value="Back">
</form>

</body>
</html>
