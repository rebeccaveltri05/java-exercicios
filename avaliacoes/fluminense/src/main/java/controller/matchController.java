package controller;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Match;
import model.Team;

/**
 * Servlet implementation class cadastrarProdutoController
 */
@WebServlet("/match")
public class matchController extends HttpServlet {

    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

    /**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
                
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

        String home = request.getParameter("home");
        String homeScore = request.getParameter("homeresult");
        String visitor = request.getParameter("visitor");
        String visitorScore = request.getParameter("visitorresult");

        Team teamOne = new Team(){};
        teamOne.setName(home);
        Team teamTwo = new Team(){};
        teamTwo.setName(visitor);

        Match match = new Match();
        match.setHome(teamOne);
        match.setHomeScore(Integer.parseInt(homeScore));
        match.setVisitor(teamTwo);
        match.setVisitorScore(Integer.parseInt(visitorScore));

        System.out.printf("Placar: %s x %s", home, visitor);
        System.out.println(" ");
        System.out.printf("             %s             %s", homeScore, visitorScore);
        System.out.println(" ");
        System.out.printf("Vencedor: %s", match.getResult().getName());
        System.out.println(" ");
        System.out.printf("Pontuação do %s: %d", home, match.getResult(teamOne));
        System.out.println(" ");
        System.out.printf("Pontuação do %s: %d", visitor, match.getResult(teamTwo));

    }       
    
}
