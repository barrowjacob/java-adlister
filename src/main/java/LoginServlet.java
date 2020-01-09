import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="LoginServlet", urlPatterns="/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        request.setAttribute("isLoggedIn", true);
        request.getRequestDispatcher("/login.jsp").forward(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String username= request.getParameter("username");
        String password=request.getParameter("password");
        if (username.equalsIgnoreCase("admin") && password.equals("password")) {

//        String isLoggedIn = request.getParameter("isLoggedIn");
//        if (isLoggedIn) {
            response.sendRedirect("/profile.jsp");
        } else {
            request.setAttribute("isLoggedIn", true);
            response.sendRedirect("/login.jsp");

        }
    }





}
