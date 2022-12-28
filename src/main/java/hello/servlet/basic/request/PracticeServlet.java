package hello.servlet.basic.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "practiceServlet", urlPatterns = "/practice-param")
public class PracticeServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html; charset=euc-kr");

        String positive1 = request.getParameter("positive1");
        String positive2 = request.getParameter("positive2");
        int a = Integer.parseInt(positive1);
        int b = Integer.parseInt(positive2);
        String result1 = String.valueOf(a + b);
        String result2 = String.valueOf(a - b);
        String result3 = String.valueOf(a * b);
        String result4 = String.valueOf(a / b);



        PrintWriter out = response.getWriter();
        if (result1.equals("resul")) {
            out.println("값 :: " + result1);
        } else if (result2.equals("계산2")) {
            out.println("값 :: " + result2);
        } else if (result3.equals("계산3")) {
            out.println("값 :: " + result3);
        } else if (result4.equals("계산4")) {
            out.println("값 :: " + result4);
        }
    }
}
