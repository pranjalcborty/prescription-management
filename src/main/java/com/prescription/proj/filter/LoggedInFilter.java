package com.prescription.proj.filter;

import com.prescription.proj.helper.Constants;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoggedInFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpSession session = ((HttpServletRequest) request).getSession();
        String path = ((HttpServletRequest) request).getRequestURI();

        if (isLoggedIn(session) || (path.contains(Constants.ASSETS_PATH)) || path.contains(Constants.REGISTER_PATH)) {
            chain.doFilter(request, response);
        } else {
            request.getRequestDispatcher(Constants.LOGIN_PATH).forward(request, response);
        }
    }

    @Override
    public void destroy() {

    }

    private boolean isLoggedIn(HttpSession session) {
        return session.getAttribute(Constants.USER) != null;
    }
}
