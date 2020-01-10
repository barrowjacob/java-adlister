import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

//trying to figure out how to update contacts using servlet and contact's id
@WebServlet("/contacts/update")
public class ContactsUpdateServlet extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Contacts ContactListDao = DaoFactory.getContactsDao();
        List<Contact> contacts = ContactListDao.getContacts();
        request.getRequestDispatcher("/contactsUpdate.jsp").forward(request,response);
    }

//MIGHT BE THAT IT'S PULLING AN OLD CONTACT LIST, THE ONE WITHOUT ID'S.
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Contacts ContactListDao = DaoFactory.getContactsDao();
        List<Contact> contacts = ContactListDao.getContacts();
        Long id = (Long) request.getAttribute("id");
        Contact contact = ContactListDao.getContactById(id);
        String firstName = contact.getFirstName();
        String lastName = contact.getLastName();
        String phoneNumber = contact.getPhoneNumber();
        request.setAttribute("contacts",contacts);
        request.getRequestDispatcher("/contactsUpdate.jsp").forward(request,response);

    }



}
