
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/serv1")
public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
       request.getRequestDispatcher("link.html").include(request, response);
       
       out.print("<html>");
		out.print("<head>");
		out.print("<title>achieverANKIT | Login</title>");
		out.print("<style>");
		
		out.print("body{ background-image:url(Imges/Backg2.png); background-attachment: fixed;  background-size: 100%;  font-family:calibri;}");
 
       out.print(".data{background-color:palegoldenrod; width:20pc; padding:5px; border-radius:6px; margin-top:13pc;}");
 
		
		out.print("</style>");
		out.print("</head>");
		out.print("<body>");
		
       
       String username = request.getParameter("uname");
       String password = request.getParameter("upass");

       if(password.equals("admin123")){
    	   
    	   out.print("<center>");
   		   out.print("<div class = 'data'>");
   		   out.print("<h2 style = 'color:navy;'>Notify You</h2>");
   		   out.print("<hr>");
    	   out.print("<h3 style = 'color:green;'>Login Succesfully..</h3>");
    		out.print("</div>");
			out.print("</center>");
    	   
    	   Cookie c = new Cookie("uname", username);
    	   response.addCookie(c);
       }
       else{
    	   out.print("<center>");
    	   out.print("<div style = 'background-color:maroon; height:2pc; width:17pc; text-align:center; border-radius:5px; margin-top:5pc;'>");
    	   out.print("<h4 style = 'color:white; padding-top:4px;'>Invalid UserName OR Password!</h4>");
    	   out.print("</div>");
    	   out.print("</center>");
           request.getRequestDispatcher("login.html").include(request, response);
       }
       out.print("</body>");
		out.print("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
