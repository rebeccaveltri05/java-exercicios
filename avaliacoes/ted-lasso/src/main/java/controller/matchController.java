package controller;

import model.Match;
import model.Team;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;

@WebServlet("/matchController")
public class matchController extends HttpServlet {
    @Override protected void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException {
        this.doPost(request, response);
    }

    @Override protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        Match m1 = new Match();
        Team h1 = new Team();
        Team v1 = new Team();
        
        String home = request.getParameter("home");
        h1.setName(home);
        m1.setHome(h1);

        String x = request.getParameter("homeScore");
        int homeScore = Integer.parseInt(x);
        m1.setHomeScore(homeScore);

        String y = request.getParameter("visitorScore");
        int visitorScore = Integer.parseInt(y);
        m1.setVisitorScore(visitorScore);

        String visitor = request.getParameter("visitor");
        v1.setName(visitor);
        m1.setVisitor(v1);

        System.out.println(m1.getResult().getName());
        System.out.println(m1.getResult(m1.getVisitor())); 
    }
}