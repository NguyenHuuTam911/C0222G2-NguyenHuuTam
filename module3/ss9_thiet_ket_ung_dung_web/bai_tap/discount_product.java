import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "discount_product", value = "/display-discount")
public class discount_product extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productDescription = request.getParameter("productDescription");
        float lastPrice = Float.parseFloat(request.getParameter("lastPrice"));
        int discountPercent = Integer.parseInt(request.getParameter("discountPercent"));

        double discountAmount = lastPrice * discountPercent * 0.01;

        PrintWriter printWriter = response.getWriter();
        printWriter.println("Product Description:" + productDescription);
        printWriter.println("List Price:" + lastPrice);
        printWriter.println("Discount Percent:" + discountPercent);
        printWriter.println("Discount Amount:" + discountAmount);

    }
}
