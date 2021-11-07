<%@ include file="../common/header.jspf"%>
<title>Login</title>
</head>
<body>
  <body>
    <form action="/login" method="post">
      <div class="container">
        <div class="login-elements">
        <p style="color: red">${errorMessage}</p>
          <input
            type="text"
            placeholder="Enter Username"
            name="username"
            required
          />

          <input
            type="password"
            placeholder="Enter Password"
            name="password"
            required
          />

          <button type="submit">Login</button>
          <div class="create-account">
            Not a member?
            <a href="/register-user">Create an account</a>
          </div>
        </div>
      </div>
    </form>
  </body>
</html>