

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentGradeCalculationServlet
 */
@WebServlet("/")
public class StudentGradeCalculationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentGradeCalculationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String sname = request.getParameter("sname");
		 RequestDispatcher dispatcher = null;
		 if(sname!=null && !sname.isEmpty()){
			 dispatcher = request.getRequestDispatcher("studentResults.jsp"); 
          }else{
 dispatcher = request.getRequestDispatcher("studnetMarks.jsp");	 	
		 }
		 
		 
		 
		 dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String sname = request.getParameter("sname");
		 String rollNo = request.getParameter("rollNo");
		 double english = Integer.parseInt(request.getParameter("english"));
		 
		 double secondLanguage = Integer.parseInt(request.getParameter("secondLanguage"));
		 double mathematics = Integer.parseInt(request.getParameter("mathematics"));
		 double statistics = Integer.parseInt(request.getParameter("statistics"));
		 double computerScience = Integer.parseInt(request.getParameter("computerScience"));
		
		 double totalMrks=english+secondLanguage+mathematics+statistics+computerScience;
		 double marks=500;
		    double studentPercentage=(totalMrks / marks)*100;
		 
		    request.setAttribute("totalMrks", totalMrks);
		    request.setAttribute("studentPercentage", studentPercentage);
		    request.setAttribute("sname", sname);
		    request.setAttribute("rollNo", rollNo);
		    
		    if(totalMrks>450){
		    	request.setAttribute("grade", "A");	
		    	request.setAttribute("grade", "B");	

		    }else if(totalMrks>300){
		    	request.setAttribute("grade", "C");	
		    }else{
		    	request.setAttribute("grade", "F");	
		    }
		    
		    
		doGet(request, response);
	}

}
