package qwerty;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class asd extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        String title = "Using GET Method to Read Form Data";
        String docType=
                "<!doctype html>\n";

        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n"+
                "<body bgcolor = \"#f0f0f0\">\n" +
                "<hl align = \"center\">" + title + "</h1>\n" +
                "<ul>\n" +
                " <li><b>First Name</b>: "
                + request.getParameter( "first_name") + "\n" +
                "<li><b>Last Name</b>: "
                +request.getParameter( "last_name") + "\n" +
                "</ul>\n" +
                "</body>\n" +
                "</html>");
    }

}