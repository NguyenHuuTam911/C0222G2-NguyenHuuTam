import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CustomerServlet", urlPatterns ="/customers")
public class CustomerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Customer[] customers = new Customer[3];
        customers[0] = new Customer("Nguyen Van An ", "29/09/1994", "Da Nang",
                "https://vcdn1-vnexpress.vnecdn.net/2019/09/29/2-1569755302.jpg?w=1200&h=0&q=100&dpr=1&fit=crop&s=eIlnCLgSWVtioKgU4I4VzA");
        customers[1] = new Customer("Nguyen Son Tung","16/08/1995","Quang Nam","https://cdn-www.vinid.net/2019/06/31167447-h%C3%A3y-trao-cho-anh-s%C6%A1n-t%C3%B9ng-mtp.jpg");
        customers[2] = new Customer("Nguyen Bich Phuong","29/09/1989","Hai Phong","https://ss-images.saostar.vn/w800/pc/1606620471992/duoc-cdm-han-quoc-truy-lung-vi-sac-voc-hut-hon-hoa-ra-bich-phuong-chi-dep-nho-phan-son-batch-dsc06413-1574926508-952-width1280height1920(1).jpg");
        request.setAttribute("listCustomer",customers);
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
