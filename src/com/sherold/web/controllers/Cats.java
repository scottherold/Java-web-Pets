package com.sherold.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sherold.web.models.Cat;

/**
 * Servlet implementation class Cats
 */
@WebServlet("/Cats")
public class Cats extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Parse submission data and cast to for object creation
		String name = request.getParameter("name");
		String breed = request.getParameter("breed");
		double weight = Double.parseDouble(request.getParameter("weight"));
		
		// Instantiate model
		Cat cat = new Cat(name, breed, weight);
		
		// Set model for view (to be accessed)
		request.setAttribute("cat",  cat);
		
		// Let the view handle the request
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/cat.jsp");
		view.forward(request,  response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
