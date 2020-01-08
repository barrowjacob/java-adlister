import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="SandboxOrderForm", urlPatterns="/order-form")
public class SandboxOrderForm extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<form method='POST' action='/order-summary'>" +
                "<label for='product-name'>Product Name</label>" +
                "<input type='text' name='product-name' id='product-name'>" +
                "<label for='count'>How many?</label>" +
                "<input type='text' name='count' id='count'>" +
                "<button type='submit'>Submit Order!</button>");
    }
}
