 <%@ include file="../common/header.jspf"%>
<title>Create an account</title>
</head>
  <body>
    <form action="/register-user" method="post">
      <div class="login-container">
    
        <div class="login-elements">
          <h1>Sign up</h1>
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

          <button class="margin-bottom" type="submit">Create Account</button>
 		
 		
          </div>
        </div>
      </div>
    </form>
  </body>
</html>