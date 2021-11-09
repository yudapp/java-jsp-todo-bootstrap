<%@ include file="../common/header.jspf"%>
<title>Login</title>
</head>
  <body>
    <form action="/login" method="post">
      <div class="login-container">
        <div class="login-elements">
        <h1>Log in...</h1>
        <p class="error-message">${errorMessage}</p>
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

          <button type="submit">Log In</button>
          <div class="create-account">
            Not a member?
            <a href="/register-user">Create an account</a>
          </div>
        </div>
      </div>
    </form>
  </body>
</html>