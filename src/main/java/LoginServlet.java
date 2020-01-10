import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

@WebServlet(urlPatterns="/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String username= request.getParameter("username");
        String password = request.getParameter("password");
        boolean isLoggedIn = false;
        if (username.equals("admin") && password.equals("password")) {
            isLoggedIn = true;
            response.sendRedirect("/profile?isLoggedIn");
        } else {
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }
    }



}
