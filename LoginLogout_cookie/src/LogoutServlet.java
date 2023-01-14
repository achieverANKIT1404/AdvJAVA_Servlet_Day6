
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/serv2")
public class LogoutServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		out.print("<body style = 'background-image:url(Imges/Backg2.png); background-attachment: fixed;  background-size: 100%;  font-family:calibri;'>");
	   request.getRequestDispatcher("link.html").include(request, response);
	   
	   Cookie c = new Cookie("uname", "");
	   c.setMaxAge(0);
	   
	   response.addCookie(c);
	   out.print("<div style = 'background-color:palegoldenrod; width:20pc; text-align:center; margin-left:30pc; padding:5px; border-radius:6px; margin-top:13pc;'>");
	   out.print("<h2 style = 'color:navy;'>Notify You</h2>");
	   out.print("<hr>");
	   out.print("<h3 style = 'color:maroon;'>Logout  Succesfull</h3>");
	   out.print("</div>");
	   out.print("</body>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
