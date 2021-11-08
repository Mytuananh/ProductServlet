import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductServlet", value = "/product")
public class ProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("description");
        double price = Double.parseDouble(request.getParameter("price"));
        double percent = Double.parseDouble(request.getParameter("percent"));

        double discountAmount = price * percent * 0.01;
        double discountPrice = price - discountAmount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        if (price > 0 && percent> 0 ) {
            writer.println("<h1>Description: " + description + "<h1>");
            writer.println("<h1>List Price: " + price + "</h1>");
            writer.println("<h1>Discount Percent: " + percent + "</h1>");
            writer.println("<h1>Discount Amount: " + discountAmount + "<h1>");
            writer.println("<h1>Discount Price: " + discountPrice + "<h1>");
        }
        else {
            writer.println("Nhap sai roi bo!");
        }
        writer.println("</html>");
    }
}
