package controle;



import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/FotoCarro")
public class FotoCarro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();
		String cor = null;
		
		for (Cookie c : cookies) {
			if(c.getName().compareTo("Cor") == 0)
				cor = c.getValue();
		}
		
		
		response.setContentType("image/png");
		
		OutputStream saida = response.getOutputStream();
		
		File arq = new File("C:/bin/Carros/carro" + cor + ".png");
		
		BufferedImage buffer = ImageIO.read(arq);
		ImageIO.write(buffer, "png", saida);
		
		saida.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
