import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello-world")
public class HelloWorldServlet extends HttpServlet {



        int hitCount = 0;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String reset = req.getParameter("reset");
        String name = req.getParameter("name");
                res.setContentType("text/html");
                PrintWriter out = res.getWriter();
            if (name == null || name.isEmpty()) {
                out.println("<h1>Hey, world!</h1>");
                hitCount++;
                out.println("<h4>Page Views: " + hitCount);
            }else {
                out.println("<h1>Hey, " + name + " </h1>");
                hitCount++;
                out.println("<h4>Page Views: " + hitCount);
            }
            if (reset != null && !reset.isEmpty()) {
                hitCount = 0;
                out.println("<h1>Reset Page.");
                out.println("<h4>Page Views: " + hitCount);
            } else {

            }
        }
    }


