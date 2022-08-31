package _2_Kicho_servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class KichoServlet
 */
@WebServlet("/KichoServlet")
public class KichoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public KichoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		//int pwd = Integer.parseInt(request.getParameter("pwd"));
		System.out.println(id+"가 아이디고"+pwd+"가 비번");
		String DBid = "manager";
		String DBpwd = "manager";
		String DBname = "Seiko";
		if ((DBid.equals(id))&&(DBpwd.equals(pwd))) {
			System.out.println("로그인 성공"+DBname);
			response.sendRedirect("resultT.jsp?name="+DBname);
			
		}else {
			System.out.println("로그인 실패");			
			response.sendRedirect("2_Kicho_servlet.jsp");
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
