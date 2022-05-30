import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;


@WebServlet(name = "ListCustomer", urlPatterns = "/customer")
public class ListCustomer extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Customer[] customers = new Customer[2];
        customers[0]= new Customer("Jun Vũ","28-06-1995","Hà Nội","https://static2.yan.vn/YanNews/2167221/201906/tieu-su-su-nghiep-va-cuoc-doi-cua-jun-vu-9cfbf9ca.jpg");
        customers[1]= new Customer("Bích Phương","19-09-1992","Hải Phòng","https://media.thieunien.vn/upload/oldmedia/thumb//uploads/2021/11/12/den-vau-va-bich-phuong-tung-la-ban-cap-2-bich-phuong-noi-tieng-qua-nen-den-khong-dam-nhan-la-ban_46646.jpg");

        request.setAttribute("listCustomer",customers);
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
