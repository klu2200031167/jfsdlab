<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Customer</title>
</head>
<body>
    <h2>Add Customer</h2>

    <!-- Display success message if customer is added -->
    <c:if test="${not empty message}">
        <p style="color: green;">${message}</p>
    </c:if>

    <!-- Form to add a customer -->
    <form action="addcustomer" method="POST">
        <label for="id">Customer ID:</label>
        <input type="text" name="id" id="id" required>
        <br><br>
        <label for="name">Customer Name:</label>
        <input type="text" name="name" id="name" required>
        <br><br>
        <input type="submit" value="Add Customer">
    </form>
</body>
</html>
