<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>
<title>Your Todo List</title>
</head>
<body>



	<c:choose>

		<c:when test="${empty todos}">
			<div class="login-container login-elements screen-centred">
				<h1>Hi ${username}</h1>
				<h3>Your list is empty!</h3>

				<a class="btn btn-add" href="/app/add-todo">Add a new Todo</a>
			</div>
		</c:when>


		<c:otherwise>
			<div class="container">
				<h1>Hi ${username}</h1>
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
								<td>${eachTodo.description}</td>
								<td>${eachTodo.category}</td>
								<td><a class="btn btn-delete"
									href="delete-todo?description=${eachTodo.description}&category=${eachTodo.category}">Delete</a></td>
							</tr>
						</c:forEach>

					</tbody>
				</table>
				<a class="btn btn-add" href="/app/add-todo">Add a new Todo</a>
			</div>

		</c:otherwise>
	</c:choose>

</body>
</html>