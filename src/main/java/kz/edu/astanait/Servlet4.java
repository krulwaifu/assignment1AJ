package kz.edu.astanait;

import kz.edu.astanait.RPG.Cyberpunk;
import kz.edu.astanait.RPG.DarkSouls;
import kz.edu.astanait.RPG.Witcher;
import kz.edu.astanait.Sport.Fifa;
import kz.edu.astanait.Sport.NBA;
import kz.edu.astanait.Sport.NFL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet4")
public class Servlet4 extends HttpServlet {
    public void rpgCheck(HttpServletRequest request, HttpServletResponse response,String game) throws ServletException, IOException {
        AbstractFactory kek = FactoryProvider.getFactory("RPG");
        if (game.equals("Witcher")){
            Witcher witcher = (Witcher) kek.create("Witcher");
            response.sendRedirect(witcher.url());
        }if(game.equals("Cyberpunk")){
            Cyberpunk cyberpunk = (Cyberpunk) kek.create("Cyberpunk");
            response.sendRedirect(cyberpunk.url());
        } if(game.equals("Dark Souls")){
            DarkSouls dark_souls = (DarkSouls) kek.create("Dark Souls");
            response.sendRedirect(dark_souls.url());
        }
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String rpg = request.getParameter("rpg");
        rpgCheck(request,response,rpg);
    }
}
