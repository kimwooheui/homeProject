package _2_Kicho_servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class PostForm
 */
@WebServlet("/postForm")
public class PostForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PostForm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		//String name = "Seiko";
		request.setAttribute("name", "maria");
		if (id.equals("manager") && pwd.equals("manager")) {
			System.out.println("로그인 성공");
			RequestDispatcher rd = 
					request.getRequestDispatcher("postResult.jsp");
			rd.forward(request,response);			
		}else {
			System.out.println("로그인에 실패해서 초기로 돌아감");
			RequestDispatcher rd = 
					request.getRequestDispatcher("postForm.jsp");
			rd.forward(request,response);			
			
		}
	}

}
