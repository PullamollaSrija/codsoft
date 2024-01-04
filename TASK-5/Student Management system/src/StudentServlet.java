

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sd.StudentObj;

/**
 * Servlet implementation class StudentServlet
 */@WebServlet("/")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 RequestDispatcher dispatcher = null;
		 String fName = request.getParameter("fName");
		 String rno = request.getParameter("rno");
		 String action = request.getParameter("action");
		 String id = request.getParameter("id");
		 
		 if("search".equals(action)){
			 StudentDAO u =new StudentDAO();
			 try {
				 ArrayList<StudentObj> list=u.getStudentSearchList(fName,rno);
				 request.setAttribute("list", list);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		 dispatcher = request.getRequestDispatcher("showAllStudents.jsp");
		 }else if(fName!=null && !fName.isEmpty()){
			 StudentDAO u =new StudentDAO();
			 try {
				 ArrayList<StudentObj> list=u.getStudentList();
				 request.setAttribute("list", list);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		 dispatcher = request.getRequestDispatcher("showAllStudents.jsp");
		 }else if("remove".equals(action)){
			  
			 StudentDAO u =new StudentDAO();
			 try {
				 u.removeStudent(Integer.parseInt(id));
				 ArrayList<StudentObj> list=u.getStudentList();
				 request.setAttribute("list", list);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		 dispatcher = request.getRequestDispatcher("showAllStudents.jsp");
		 }else if("edit".equals(action)){
			  
			 StudentDAO u =new StudentDAO();
			 try { 
				 StudentObj list=u.getStudentById(Integer.parseInt(id));
				 request.setAttribute("list", list);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		 dispatcher = request.getRequestDispatcher("editStudent.jsp");
		 }else{
			 dispatcher = request.getRequestDispatcher("student.jsp");	
		 }
		 
		 dispatcher.forward(request, response);
		 }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			
		 StudentObj std=new StudentObj();
		 std.setFirstName(request.getParameter("fName"));
		 std.setLastName(request.getParameter("lName"));
		 std.setRno(request.getParameter("rno"));
		 std.setEmail(request.getParameter("email"));
		 std.setGrade(request.getParameter("grade"));
		String action =request.getParameter("action");
		 StudentDAO u =new StudentDAO();
		 
		 try {
			 if(request.getParameter("id")!=null &&   !request.getParameter("id").isEmpty()){
				 std.setStdId(Integer.parseInt(request.getParameter("id")));
				 u.updateStudent(std);
			 }else if("search".equals(action)){
				 request.setAttribute("action", "search");
			 }else{
				 u.insertStudent(std); 
			 }
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 request.setAttribute("fName", request.getParameter("fName"));
		 request.setAttribute("rno", request.getParameter("rno"));
		 // TODO Auto-generated method stub
		doGet(request, response);
	}

}
