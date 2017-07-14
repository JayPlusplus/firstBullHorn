

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
         }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String message = "Invalid User";
		String page = "/loginPage.jsp";
		
		User jay = new User("","");
		
		HttpSession session = request.getSession();
		
		session.setAttribute("username", email);
		
		if (email.equals("wu@gmail.com")){
			if(password.equals("12345")) {
				
				message = "you are a valid user";
				request.setAttribute("message1", "Your first name is " + jay.getFirstName());
				request.setAttribute("message2", "Your last name is "+ jay.getLastName());
				request.setAttribute("message3", "Your Personal Code is " + jay.getPersonCode() );
				request.setAttribute("message4", "Your email is "+ jay.getEmail());
				page = "/Output.jsp";
				//request.getServletContext().getRequestDispatcher(page).forward(request, response);
				
			}
		}
         request.setAttribute("message", message);
         request.getServletContext().getRequestDispatcher(page).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
