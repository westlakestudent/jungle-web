package com.jungle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.ModelAndView;

public class JungleDispatcher extends DispatcherServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doDispatch(HttpServletRequest request, HttpServletResponse response) throws Exception {
		super.doDispatch(request, response);
	}

	@Override
	protected void initStrategies(ApplicationContext context) {
		super.initStrategies(context);
	}

	@Override
	protected ModelAndView processHandlerException(HttpServletRequest request, HttpServletResponse response,
			Object handler, Exception ex) throws Exception {
		return super.processHandlerException(request, response, handler, ex);
	}

}
