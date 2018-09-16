import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class admin_LoginController extends HttpServlet {

    protected  void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

    }
    protected  void  doPost(HttpServletRequest request, HttpServletResponse response) throws  IOException, ServletException{
        HttpSession session1 = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if(username.equals("admin") && password.equals("admin")){
            session1.setAttribute("username", username);
            session1.setAttribute("password",password);
            //RequestDispatcher dispatcher =request.getRequestDispatcher("/admin_shoponline.jsp");
            //dispatcher.forward(request,response);
            response.sendRedirect( request.getContextPath()+"/admin_shoponline");
        }
        else{
            response.sendRedirect( request.getContextPath()+"/admin_login.jsp?error=0");
        }
    }
}
