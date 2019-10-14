package kr.ac.hansung.cse;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Read form data
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		// Process : 데이터베이스 접근, 로직 처리
		
		// Build HTML code : 클라이언트에 처리한 값 전달
		PrintWriter out = response.getWriter();

		String htmlResponse = "<html>";
		htmlResponse += "<h2> Your username is "+ username+"</br>";
		htmlResponse += "<h2> Your password is "+ password+"<h2/>";
		htmlResponse += "</html>";
		
		out.println(htmlResponse);
		
	}

}
