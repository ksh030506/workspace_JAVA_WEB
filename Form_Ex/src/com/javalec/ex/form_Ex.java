package com.javalec.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class form_Ex
 */
@WebServlet("/FormEx")
public class form_Ex extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public form_Ex() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void init() throws ServletException {
    	System.out.println("init");
    }
    
    @Override
    public void destroy() {
    	System.out.println("destroy");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet");
		
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		String[] hobbys = request.getParameterValues("hobby");
		String major = request.getParameter("major");
		String protocol = request.getParameter("protocol");
		
		response.setContentType("text/html; charset=EUC-KR");
		PrintWriter writer = response.getWriter();
		
		writer.println("<html><head></head><body>");
		writer.println("이름 : " + name + "<br />");
		writer.println("아이디 : " + id + "<br />");
		writer.println("비밀번호 : " + pw + "<br />" );
		writer.println("취미 : " + Arrays.toString(hobbys) + "<br />");
		writer.println("전공 : " + major + "<br />");
		writer.println("프로토콜 : " + protocol);
		writer.println("</body></html>");
		
		writer.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doPost");
		
		request.setCharacterEncoding("EUC-KR");
		
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		String[] hobbys = request.getParameterValues("hobby");
		String major = request.getParameter("major");
		String protocol = request.getParameter("protocol");
		
		response.setContentType("text/html; charset=EUC-KR");
		PrintWriter writer = response.getWriter();
		
		writer.println("<html><head></head><body>");
		writer.println("이름 : " +name);
		writer.println("아이디 : " + id + "<br />");
		writer.println("비밀번호 : " + pw + "<br />" );
		writer.println("취미 : " + Arrays.toString(hobbys) + "<br />");
		writer.println("전공 : " + major + "<br />");
		writer.println("프로토콜 : " + protocol);
		writer.println("</body></html>");
		
		writer.close();
	}

}
