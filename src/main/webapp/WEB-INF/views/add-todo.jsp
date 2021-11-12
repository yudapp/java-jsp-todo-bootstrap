<%@ include file="../common/header.jspf"%>
<title>Add a new Todo</title>
</head>
<body>

	<div class="container screen-width">
		<h2>Add a new todo</h2>
		<form method="post" action="/add-todo">
			Description <input type="text" name="description" required />
			Category<input type="text" name="category" required />
			<button type="submit">Add</button>

		</form>

	</div>
</body>
</html>