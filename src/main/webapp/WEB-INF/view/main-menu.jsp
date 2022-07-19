<!DOCTYPE html>
<html>
<body>
<h2>
    Welcome to Airplane Service:)
</h2>

1) Count specific airplanes
<form action="/airplanes/count" method="GET">
    <input type="text" name="companyName"
           placeholder="Type airplane company"/>
    <input type="submit" value="Count">
</form>
<br><br>
2) Find all airplanes
<form action="/airplanes" method="GET">
    <input type="submit" value="Find all airplanes">
</form>

<br><br>
3) Find airplane
<form action="/airplanes/find" method="GET">
    <input type="text" name="airplaneName"
           placeholder="Type airplane name"/>
    <input type="submit" value="Find airplane">
</form>




</body>
</html>