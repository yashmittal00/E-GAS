import javax.servlet.*;
import java.io.*;
import java.sql.*;
public class login implements Servlet
{
	public void init(ServletConfig h)
	{
	
	}
	public void service(ServletRequest req,ServletResponse res)throws IOException,ServletException	
		{
		res.setContentType("text/html");
	PrintWriter pw=res.getWriter();
	String name=req.getParameter("form-username");
	String pass=req.getParameter("form-password");
	try{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection	("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","nazkani1110");
	PreparedStatement ps=con.prepareStatement("select LID,LPASSWORD from Llogin where LID=? and LPASSWORD=?");
	ps.setString(1,name);	
	ps.setString(2,pass);
	ResultSet rs=ps.executeQuery();
	if(rs.next()){
	RequestDispatcher rd=req.getRequestDispatcher("portal.html");
	rd.include(req,res);}
	else{
	pw.println("Invalid User/Pass");
	RequestDispatcher rd=req.getRequestDispatcher("login2.html");
	rd.include(req,res);
	
}

		}
	catch(Exception e2){
pw.println(e2);
}

	pw.close();
	}
        public void destroy()
	{ 
	}
	public ServletConfig getServletConfig()	
	{
	return null;	  
	}
	public String getServletInfo(){return null;}
	}