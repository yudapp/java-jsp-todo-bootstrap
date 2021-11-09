<%@ include file="../common/header.jspf" %>
<%@ include file="../common/navigation.jspf"%>
<title>Your Todo List</title>
</head>
<body>
<div class="container">
<h1> Welcome ${username},</h1>
 

	<table class="table table-striped">
	<caption>Your Todos:</caption>
		<thead>
		<th>Description</th>
		<th>Category</th>
		<th>Actions</th>
		</thead>
		<tbody>
		<c:forEach items="${todos}" var="eachTodo">
			<tr>
			<td>${eachTodo.todoName} </td>
			<td> ${eachTodo.description}</td>
			<td><a class="btn btn-danger" href="delete-todo?todo=${eachTodo.todoName}&category=${eachTodo.description}">Delete</a></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>


 
</div>
</body>
</html>