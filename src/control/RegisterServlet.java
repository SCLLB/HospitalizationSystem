package control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.User;
import daoFactory.DaoFactory;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String UserId = request.getParameter("UserId");
		String UserName = request.getParameter("UserName");
		String UserPassword = request.getParameter("UserPassword");
		
		response.setContentType( "text/html;charset=utf-8");
		PrintWriter pw=response.getWriter();
		
		User user = new User();
		user.setUserId(UserId);
		user.setUserName(UserName);
		user.setUserPassword(UserPassword);
		
		if(!(UserId==null||"".equals(UserId)||UserName==null||"".equals(UserName)||UserPassword==null||"".equals(UserPassword))) {
			try {
				if(DaoFactory.getUserDaoInstance().findRegister(user)) {
					pw.print("<script language='javascript'>alert('注册成功，请登录');window.location.href='Login.jsp'</script>");
				}else {
					pw.print("<script language='javascript'>alert('注册失败，请重新注册');window.location.href='Register.jsp'</script>");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			pw.print("<script language='javascript'>alert('用户名或密码或名字不能为空');window.location.href='Register.jsp'</script>");
		}
		
	}

}
