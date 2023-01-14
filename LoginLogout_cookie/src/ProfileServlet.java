
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/serv3")
public class ProfileServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		   response.setContentType("text/html");
		   PrintWriter out = response.getWriter();
		   
			out.print("<body style = 'background-image:url(Imges/Backg2.png); background-attachment: fixed;  background-size: 100%;  font-family:calibri;'>");

	       request.getRequestDispatcher("link.html").include(request, response);

	       Cookie c[] = request.getCookies();
	       
	       if(c!=null){
	    	   
	    	   String uname = c[0].getValue();
	    	   if(!uname.equals("") || uname!=null){
	    		   
	    		   out.print("<div style = 'background-color:khaki; width:12pc; text-align:center; margin-left:30pc; padding:6px; border-radius:6px; border:1px, solid,black; margin-top:8pc;'>");
	    		   out.print("<h2 style = 'color: darkgreen;'>User Data</h2>");
	    		   out.print("<hr>");
	    		   out.print("<h3 style = 'color:navy;'>UserProfile : "+uname+"</h3>");
	    		   out.print("</div>");
	    	   }
	       }
	       else{
	    	   out.print("<center>");
	    	   out.print("<div style = 'background-color:maroon; height:2pc; width:10pc; text-align:center; border-radius:5px; margin-top:5pc;'>");
	    	   out.print("<h4 style = 'color:white;padding-top:4px;'>Please login first!</h4>");
	    	   out.print("</div>");
	    	   out.print("</center>");
	           out.print("</body>");
		       request.getRequestDispatcher("login.html").include(request, response);
		       
	       }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
