package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.prescription;
import daoFactory.DaoFactory;

/**
 * Servlet implementation class UpdatePrescriptionServlet
 */
public class UpdatePrescriptionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdatePrescriptionServlet() {
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
		int PrescriptionId = Integer.parseInt(request.getParameter("PrescriptionId"));
		String PrescriptionText = request.getParameter("PrescriptionText");
		prescription pres = new prescription();
		pres.setPrescriptionId(PrescriptionId);
		pres.setPrescriptionText(PrescriptionText);
		try {
			if((DaoFactory.getPrescriptionInstance().UpdatePrescription(pres))) {
				request.getRequestDispatcher("PrescriptionInfo.jsp").forward(request,response);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
