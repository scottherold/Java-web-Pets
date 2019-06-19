package com.sherold.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sherold.web.models.Dog;

/**
 * Servlet implementation class Dogs
 */
@WebServlet("/Dogs")
public class Dogs extends HttpServlet {
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
		Dog dog = new Dog(name, breed, weight);
		
		// Set model for view (to be accessed)
		request.setAttribute("dog",  dog);
		
		// Let the view handle the request
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/dog.jsp");
		view.forward(request,  response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
