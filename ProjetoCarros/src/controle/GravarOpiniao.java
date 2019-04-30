package controle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/GravarOpiniao")
public class GravarOpiniao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cor = request.getParameter("cor");
		
		Cookie cookieCor = new Cookie("Cor", cor);
		response.addCookie(cookieCor);
		
		PrintWriter saida = response.getWriter();
		
		saida.print("<script>window.alert('Obrigado pela sua opinião');</script>");
		saida.print("<script>window.location.replace('opiniao.jsp');</script>");
		
	}

}
