package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.patient;
import bean.prescription;
import daoFactory.DaoFactory;

/**
 * Servlet implementation class PrescriptionServlet
 */
public class PrescriptionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrescriptionServlet() {
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
		int DoctorId = Integer.parseInt(request.getParameter("DoctorId"));
		int PatientId = Integer.parseInt(request.getParameter("PatientId"));
		int CheckId = Integer.parseInt(request.getParameter("CheckId"));
		String PrescriptionText = request.getParameter("PrescriptionText");
		
		prescription pres = new prescription();
		patient pat = new patient();
		
		pat.setPatientId(PatientId);
		pat.setPrescriptionText(PrescriptionText);
		
		pres.setDoctorId(DoctorId);
		pres.setPatientId(PatientId);
		pres.setCheckId(CheckId);
		pres.setPrescriptionText(PrescriptionText);
		
		if(!(DoctorId==0||PatientId==0||CheckId==0||PrescriptionText==null||"".equals(PrescriptionText))) {
			try {
				if((DaoFactory.getPrescriptionInstance().AddPrescription(pres))&&(DaoFactory.getPrescriptionInstance().UpdatePatient(pat))) {
					request.getRequestDispatcher("PatientInfo.jsp").forward(request,response);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
