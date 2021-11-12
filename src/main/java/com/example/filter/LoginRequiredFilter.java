package com.example.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/app/*")
public class LoginRequiredFilter implements Filter {

	public void destroy() {

	}

	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		if (request.getSession().getAttribute("username") != null) {
			// continue the request, password checked and exist
			chain.doFilter(servletRequest, servletResponse);
		} else {
			request.getRequestDispatcher("/login").forward(servletRequest, servletResponse);
		}

	}

	public void init(FilterConfig arg0) throws ServletException {

	}

}