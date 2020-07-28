package com.microservice.employees.filter;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EmployeeServiceFilter implements Filter {
    private Logger logger = LoggerFactory.getLogger(EmployeeServiceFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;

        logger.info("Logging Request {} : {}", httpServletRequest.getMethod(), httpServletRequest.getRequestURI());
        httpServletResponse.addHeader("new header", "filtered");
        filterChain.doFilter(httpServletRequest, httpServletResponse);
        logger.info("Logging response: {}, ", httpServletResponse.getContentType());
    }

    @Override
    public void destroy() {

    }
}
