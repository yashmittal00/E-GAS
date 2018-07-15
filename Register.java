import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Register extends HttpServlet 
{
public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException 
{

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String n=request.getParameter("first_name");
		String p=request.getParameter("last_name");
		String e=request.getParameter("email");
		String c=request.getParameter("address");
                                String d=request.getParameter("contact");
		String f=request.getParameter("password");
		try
               {
		
                Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","nazkani1110");
		PreparedStatement ps=con.prepareStatement("insert into Llogin values(?,?,?,?,?)");
		ps.setString(1,n);
		ps.setString(2,p);
		ps.setString(3,e);
		ps.setString(4,c);
		ps.setString(5,d);
                                ps.setString(6,f);
		int i=ps.executeUpdate();
		if(i>0)
		out.print("You are successfully registered...");
		RequestDispatcher rd=req.getRequestDispatcher("login2.html");
	rd.include(req,res);
			
		}
              catch (Exception e2) 
              {
               System.out.println(e2);
               }
		
		out.close();
	}

}
