import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ControllerDB extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        String name = request.getParameter("name");
        int type = Integer.valueOf(request.getParameter("type"));
        int number = Integer.parseInt(request.getParameter("number"));
        int price = Integer.parseInt(request.getParameter("price"));
        DataMysql data = new DataMysql();
        int temp = data.insertDataProduct(name,type,number,price);
        //RequestDispatcher rd = request.getRequestDispatcher("insert_success.jsp");
        //response.sendRedirect( request.getContextPath()+"/admin_shoponline.jsp?insert=1");
        request.setAttribute("inserted", true);
        doGet(request, response);
    }

    protected  void doGet(HttpServletRequest request,HttpServletResponse response)throws  ServletException,IOException{
        request.getRequestDispatcher("admin_shoponline.jsp").forward(request, response);
    }
}

