package kz.edu.astanait;

import kz.edu.astanait.Sport.Fifa;
import kz.edu.astanait.Sport.NBA;
import kz.edu.astanait.Sport.NFL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet2")
public class Servlet2 extends HttpServlet {
    public void sportCheck(HttpServletRequest request, HttpServletResponse response,String sport) throws ServletException, IOException {
        AbstractFactory kek = FactoryProvider.getFactory("Sport");
        if (sport.equals("Fifa")) {
            Fifa fifa = (Fifa) kek.create("Fifa");
            response.sendRedirect(fifa.url());
        } else if (sport.equals("NFL")) {
            NFL nfl = (NFL) kek.create("NFL");
            response.sendRedirect(nfl.url());
        } else if (sport.equals("NBA")) {
            NBA nba = (NBA) kek.create("Sportage");
            nba.url();
        }
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sport = request.getParameter("sport");
        sportCheck(request,response,sport);
    }
}
