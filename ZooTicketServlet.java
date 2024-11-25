import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ZooTicketServlet")
public class ZooTicketServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Retrieve form data
        String fullName = request.getParameter("fullName");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String visitDate = request.getParameter("visitDate");
        String numAdults = request.getParameter("numAdults");
        String numChildren = request.getParameter("numChildren");
        String specialRequests = request.getParameter("specialRequests");
        String ticketType = request.getParameter("ticketType");
        String paymentMethod = request.getParameter("paymentMethod");

        // Set response content type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Display confirmation
        out.println("<html><body>");
        out.println("<h1>Zoo Ticket Booking Confirmation</h1>");
        out.println("<p>Thank you for your booking, " + fullName + "!</p>");
        out.println("<p>Email: " + email + "</p>");
        out.println("<p>Phone: " + phone + "</p>");
        out.println("<p>Visit Date: " + visitDate + "</p>");
        out.println("<p>Number of Adults: " + numAdults + "</p>");
        out.println("<p>Number of Children: " + numChildren + "</p>");
        out.println("<p>Special Requests: " + specialRequests + "</p>");
        out.println("<p>Ticket Type: " + ticketType + "</p>");
        out.println("<p>Payment Method: " + paymentMethod + "</p>");
        out.println("</body></html>");

        out.close();
    }
}
