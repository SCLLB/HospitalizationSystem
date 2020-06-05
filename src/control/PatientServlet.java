package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.bed;
import bean.patient;
import daoFactory.DaoFactory;

/**
 * Servlet implementation class PatientServlet
 */
public class PatientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PatientServlet() {
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
		
		String PatientName = request.getParameter("PatientName");
		String PatientSex = request.getParameter("PatientSex");
		int PatientAge = Integer.parseInt(request.getParameter("PatientAge"));
		String PatientAddress = request.getParameter("PatientAddress");
		String PatientPhone = request.getParameter("PatientPhone");
		int DoctorId = Integer.parseInt(request.getParameter("DoctorId"));
		int BedId = Integer.parseInt(request.getParameter("BedId"));
		String InHospitalTime = request.getParameter("InHospitalTime");
		
		patient pat = new patient();
		pat.setPatientName(PatientName);
		pat.setPatientSex(PatientSex);
		pat.setPatientAge(PatientAge);
		pat.setPatientAddress(PatientAddress);
		pat.setPatientPhone(PatientPhone);
		pat.setDoctorId(DoctorId);
		pat.setBedId(BedId);
		pat.setInHospitalTime(InHospitalTime);
		
		bed b = new bed();
		b.setBedId(BedId);
		b.setPatientName(PatientName);
		
		if(!(PatientName==null||"".equals(PatientName)||PatientSex==null||"".equals(PatientSex)
				||PatientAddress==null||"".equals(PatientAddress)||PatientPhone==null||"".equals(PatientPhone)||InHospitalTime==null||"".equals(InHospitalTime)
				)) {
			try {
				if((DaoFactory.getPatientInstance().AddPatient(pat))&&(DaoFactory.getPatientInstance().AddBed(b))) {
					request.getRequestDispatcher("PatientInfo.jsp").forward(request,response);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
