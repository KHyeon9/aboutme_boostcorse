package aboutme;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/today")
public class aboutme extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public aboutme() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		LocalTime time = LocalTime.now();
		LocalDate today = LocalDate.now();
		
		int ho = time.getHour();
		int mi = time.getMinute();
		int se = time.getSecond();
		String now = today + " " + ho + ":" + mi + ":" + se;
		out.println("<html>\r\n"
				+ "  <head>\r\n"
				+ "    <meta charset=\"utf-8\" />\r\n"
				+ "    <link rel=\"stylesheet\" href=\"style.css\" />\r\n"
				+ "    <title>aboutme</title>\r\n"
				+ "  </head>\r\n"
				+ "  <body>");
		out.println("<body>");
		out.println("<a href=\"http://localhost:8080/aboutme/index.html\">메인화면</a><br>");
		out.println("<h1>" + now + "</h1>");
		out.println("</body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
