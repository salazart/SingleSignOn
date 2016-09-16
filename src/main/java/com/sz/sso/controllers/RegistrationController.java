package com.sz.sso.controllers;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Servlet implementation class RegistrationController
 */
@WebServlet("/reg")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private static final String ENCODING = "UTF-8";
	
	protected static final Logger log = LogManager.getRootLogger();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			request.setCharacterEncoding(ENCODING);
		} catch (UnsupportedEncodingException e) {
			log.error(e);
		}
		response.setCharacterEncoding(ENCODING);
		response.setContentType ("text/html; charset=UTF-8");

		

		try {
			request.getRequestDispatcher("signin.jsp").forward(request, response);
		} catch (ServletException | IOException e) {
			log.error(e);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
