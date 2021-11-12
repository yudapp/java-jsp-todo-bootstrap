<%@ include file="../common/header.jspf" %>
<%@ include file="../common/navigation.jspf"%>
<title>Your Todo List</title>
</head>
<body>
<div class="container">
<h1> Welcome ${username}</h1>
 <h3>These are your todos</h3>

	<table class="table table-striped">
 
		<thead>
		<th>Description</th>
		<th>Category</th>
		<th>Action</th>
		</thead>
		<tbody>
		<c:forEach items="${todos}" var="eachTodo">
			<tr>
			<td>${eachTodo.todoName} </td>
			<td> ${eachTodo.description}</td>
			<td><a class="btn btn-delete" href="delete-todo?todo=${eachTodo.todoName}&category=${eachTodo.description}">Delete</a></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div>
	<a class="btn btn-add" href="/app/add-todo">Add a new Todo</a>
	</div>

 
</div>
</body>
</html>