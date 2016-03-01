package test;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.log4j.Logger;

public class MyFilter implements Filter {

	@Override
	public void destroy() {
		_log.error("DESTROY");
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {
		_log.error("doFilter start" + filterChain);
		filterChain.doFilter(servletRequest, servletResponse);
		_log.error("doFilter end" + filterChain);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		_log.error("INIT");
	}

	Logger _log = Logger.getLogger(MyFilter.class);

}
