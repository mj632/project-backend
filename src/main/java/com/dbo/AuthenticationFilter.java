package com.dbo;

import java.io.IOException;
import java.util.Objects;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dbo.repo.UserDetailsRepository;

@Component
public class AuthenticationFilter implements Filter {

	@Autowired
	UserDetailsRepository userDetailsRepo;

	private static final Logger logger = Logger.getLogger(AuthenticationFilter.class);
	
	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {

		HttpServletResponse res = (HttpServletResponse) arg1;
		HttpServletRequest req = (HttpServletRequest) arg0;
	
		if (!req.getRequestURL().toString().contains("sign-up")) {
			if (Objects.nonNull(userDetailsRepo.findByUname(req.getHeader("user-name")))) {
				arg2.doFilter(req, res);
			} else {
				try {
					res.setStatus(401);
					logger.error("Unauthorized access to application");
					throw new Exception("UnAuthorized");
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} else {
			logger.info("Sign up API call");
			arg2.doFilter(req, res);
		}

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
