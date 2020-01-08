import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="SandboxOderSummary", urlPatterns="/order-summary")
public class SandboxOrderSummary extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String product = req.getParameter("product-name");
        String count = req.getParameter("count");
        out.println("<h2>Order Form</h2>" +
                "<br>" +
                "<p> Product: " +
                 product + "</p>" +
                "<p> How many: " + count + "</p>");
    }
}
