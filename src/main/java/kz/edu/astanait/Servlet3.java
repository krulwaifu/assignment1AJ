package kz.edu.astanait;

import kz.edu.astanait.Racing.AsettoCorsa;
import kz.edu.astanait.Racing.NFS;
import kz.edu.astanait.Racing.ProjectCars;
import kz.edu.astanait.Sport.Fifa;
import kz.edu.astanait.Sport.NBA;
import kz.edu.astanait.Sport.NFL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet3")
public class Servlet3 extends HttpServlet {
    public void racingCheck(HttpServletRequest request, HttpServletResponse response,String game) throws ServletException, IOException {
        AbstractFactory kek = FactoryProvider.getFactory("Racing");
        if (game.equals("Assetto Corsa")){
            AsettoCorsa assetoCorsa = (AsettoCorsa) kek.create("Assetto Corsa");
            response.sendRedirect(assetoCorsa.url());
        }if(game.equals("Need for Speed")){
            NFS nfs = (NFS) kek.create("Need for Speed");
            response.sendRedirect(nfs.url());
        } if(game.equals("Project Cars 2")){
            ProjectCars projectCars = (ProjectCars) kek.create("Project Cars 2");
            response.sendRedirect(projectCars.url());
        }
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String racing = request.getParameter("racing");
        racingCheck(request,response,racing);
    }
}
