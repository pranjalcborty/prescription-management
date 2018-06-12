package com.prescription.proj.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import static com.prescription.proj.helper.Constants.*;
import static java.util.Objects.isNull;

public class LoggedInFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpSession session = ((HttpServletRequest) request).getSession();
        String path = ((HttpServletRequest) request).getRequestURI();

        if (isLoggedIn(session) || path.contains(ASSETS_PATH)
                || path.endsWith(LOGIN_PATH) || path.endsWith(REG_PATH)) {
            chain.doFilter(request, response);
        } else {
            ((HttpServletResponse) response).sendRedirect(PROJECT_PATH + LOGIN_PATH);
        }
    }

    @Override
    public void destroy() {

    }

    private boolean isLoggedIn(HttpSession session) {
        return !isNull(session.getAttribute(USER));
    }
}
