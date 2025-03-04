package com.javalec.ex;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JoinOk
 */
@WebServlet("/JoinOk")
public class JoinOk extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Connection connection;
	private Statement stmt;

	private String name, id, pw, phone1, phone2, phone3, gender;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public JoinOk() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Do Get");
		actionDo(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Do Post");
		actionDo(request, response);
	}

	private void actionDo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("actionDo Method");

		request.setCharacterEncoding("UTF-8");

		name = request.getParameter("name");
		id = request.getParameter("id");
		pw = request.getParameter("pw");
		phone1 = request.getParameter("phone1");
		phone2 = request.getParameter("phone2");
		phone3 = request.getParameter("phone3");
		gender = request.getParameter("gender");

		String query = "insert into member values ('" + name + "','" + id + "','" + pw + "', '" + phone1 + "','"
				+ phone2 + "','" + phone3 + "','" + gender + "')";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ksh030506", "000000");
			stmt = connection.createStatement();
			int i = stmt.executeUpdate(query);

			if (i == 1) {
				System.out.println("insert success");
				response.sendRedirect("joinResult.jsp");
			} else if(i == 0) {
				System.out.println("데이터베이스 오류입니다.");
			} else {
				System.out.println("insert fail");
				response.sendRedirect("join.html");
			}
		} catch (Exception e) {
			System.out.println("아이디가 중복됩니다.");
		} finally {

			try {
				if (stmt != null)
					stmt.close();
				if (connection != null)
					connection.close();

			} catch (Exception e2) {
				System.out.println(e2.getMessage());
			}

		}
	}

}
