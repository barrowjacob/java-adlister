import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/contacts")
public class ContactServlet extends HttpServlet {
        static private Contacts ContactListDao = DaoFactory.getContactsDao();
        static private List<Contact> contacts = ContactListDao.getContacts();
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("contacts", contacts);
        request.getRequestDispatcher("./contacts.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String firstName= request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String phoneNumber = request.getParameter("phoneNumber");
        Contact contactly = new Contact(firstName, lastName, phoneNumber);
        ContactListDao.saveContact(contactly);
        request.setAttribute("contacts", contacts);
        request.getRequestDispatcher("/contacts.jsp").forward(request,response);
    }
}



