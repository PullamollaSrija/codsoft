import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import sd.StudentObj; 

public class StudentDAO {
	 public int insertStudent(StudentObj std) throws ClassNotFoundException{
	    	Connection con=null;
			Statement st=null;
			int rs=0;
			 Class.forName("com.mysql.jdbc.Driver");
			 try {
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement?useSSL=false","root","admin");
				 st=con.createStatement();
				 rs=st.executeUpdate("INSERT INTO student (firstname, lastname, r_no, email,grade) VALUES ('"+std.getFirstName()+"', '"+std.getLastName()+"', '"+std.getRno()+"', '"+std.getEmail()+"','"+std.getGrade()+"')");
				 
				 
				 st.close();
				 con.close();
			 
			 } catch (SQLException e) {
				e.printStackTrace();
			} 
	    	return 1;	
	    }
	 
	 public ArrayList<StudentObj> getStudentList() throws ClassNotFoundException{
	    	Connection con=null;
			Statement st=null;
			ResultSet rs=null;
			ArrayList<StudentObj> list =new ArrayList<>();
			StudentObj s=null;
			 Class.forName("com.mysql.jdbc.Driver");
			 try {
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement?useSSL=false","root","admin");
				 st=con.createStatement();
				 rs=st.executeQuery("SELECT * FROM student");
				 
				 while(rs.next()){
					 s=new StudentObj();
					 s.setStdId(Integer.parseInt(rs.getString("stdid")));
					 s.setFirstName(rs.getString("firstname"));
					 s.setEmail(rs.getString("email"));
					 s.setLastName(rs.getString("lastname"));
					 s.setRno(rs.getString("r_no"));
					 s.setGrade(rs.getString("grade"));
					// System.out.println(rs.getString(1) +" : " +rs.getString(2));
					 list.add(s);
				 }
				 st.close();
				 con.close();
			 
			 } catch (SQLException e) {
				e.printStackTrace();
			} 
	    	return list;	
	    }
	 
	 public int removeStudent(int id) throws ClassNotFoundException{
	    	Connection con=null;
			Statement st=null;
			int rs=0;
			 Class.forName("com.mysql.jdbc.Driver");
			 try {
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement?useSSL=false","root","admin");
				 st=con.createStatement();
				 rs=st.executeUpdate("DELETE FROM student WHERE stdid = "+id+"");
				 
				 
				 st.close();
				 con.close();
			 
			 } catch (SQLException e) {
				e.printStackTrace();
			} 
	    	return 1;	
	    }
	 
	 public StudentObj getStudentById(int id) throws ClassNotFoundException{
	    	Connection con=null;
			Statement st=null;
			ResultSet rs=null;
			 
			StudentObj s=null;
			 Class.forName("com.mysql.jdbc.Driver");
			 try {
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement?useSSL=false","root","admin");
				 st=con.createStatement();
				 rs=st.executeQuery("SELECT * FROM student where stdid="+id+"");
				 
				 while(rs.next()){
					 s=new StudentObj();
					 s.setStdId(Integer.parseInt(rs.getString("stdid")));
					 s.setFirstName(rs.getString("firstname"));
					 s.setEmail(rs.getString("email"));
					 s.setLastName(rs.getString("lastname"));
					 s.setRno(rs.getString("r_no"));
					 s.setGrade(rs.getString("grade"));
					// System.out.println(rs.getString(1) +" : " +rs.getString(2));
					  
				 }
				 st.close();
				 con.close();
			 
			 } catch (SQLException e) {
				e.printStackTrace();
			} 
	    	return s;	
	    }
	 
	 public int updateStudent(StudentObj std) throws ClassNotFoundException{
	    	Connection con=null;
			Statement st=null;
			int rs=0;
			 Class.forName("com.mysql.jdbc.Driver");
			 try {
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement?useSSL=false","root","admin");
				 st=con.createStatement();
				 rs=st.executeUpdate("UPDATE student SET firstname = '"+std.getFirstName()+"', lastname = '"+std.getLastName()+"', r_no = '"+std.getRno()+"', email = '"+std.getEmail()+"', grade = '"+std.getGrade()+"' WHERE stdid = "+std.getStdId()+" ");
				 
				 
				 st.close();
				 con.close();
			 
			 } catch (SQLException e) {
				e.printStackTrace();
			} 
	    	return 1;	
	    }
	 
	 
	 public ArrayList<StudentObj> getStudentSearchList(String fname ,String rno) throws ClassNotFoundException{
	    	Connection con=null;
			Statement st=null;
			ResultSet rs=null;
			ArrayList<StudentObj> list =new ArrayList<>();
			StudentObj s=null;
			 Class.forName("com.mysql.jdbc.Driver");
			 try {
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement?useSSL=false","root","admin");
				 st=con.createStatement();
				 rs=st.executeQuery("SELECT * FROM student where firstname='"+fname+"' or r_no='"+rno+"'");
				 
				 while(rs.next()){
					 s=new StudentObj();
					 s.setStdId(Integer.parseInt(rs.getString("stdid")));
					 s.setFirstName(rs.getString("firstname"));
					 s.setEmail(rs.getString("email"));
					 s.setLastName(rs.getString("lastname"));
					 s.setRno(rs.getString("r_no"));
					 s.setGrade(rs.getString("grade"));
					// System.out.println(rs.getString(1) +" : " +rs.getString(2));
					 list.add(s);
				 }
				 st.close();
				 con.close();
			 
			 } catch (SQLException e) {
				e.printStackTrace();
			} 
	    	return list;	
	    }
	 
}
