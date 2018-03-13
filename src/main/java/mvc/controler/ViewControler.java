package mvc.controler;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.LoggerFactory;

import mvc.model.productModel;

/**
 * Servlet implementation class ViewControler
 */
@WebServlet("/ViewControler")



public class ViewControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private org.slf4j.Logger logger = LoggerFactory.getLogger(getClass());
	private RequestDispatcher requestDispatcher;
	

	@Inject
	private productModel model;
	
	@Override
	protected void service (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.info("Enter service");
		
		String barcode = request.getParameter("barcode");
		
		logger.info("barcode : {}",barcode);
		
		request.setAttribute("barcode", barcode);
		if(barcode==null || barcode.isEmpty()) {
		
		requestDispatcher = request.getRequestDispatcher("/WEB-INF/jsp/input.jsp");
        
		}else {
		requestDispatcher = request.getRequestDispatcher("/WEB-INF/jsp/output.jsp");
		model.handle(request, response);
		}
		requestDispatcher.forward(request, response);
		
		logger.info("Exit service");
		
	}
}