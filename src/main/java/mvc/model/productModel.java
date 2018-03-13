/**
 * 
 */
package mvc.model;

import java.io.IOException;

import javax.annotation.Resource;
import javax.enterprise.inject.Model;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.UserTransaction;

import org.slf4j.LoggerFactory;

import entity.Product;

/**
 * @author MENAD
 *
 */
@Model
public class productModel {
	
	private static final long serialVersionUID = 1L;
	private org.slf4j.Logger logger = LoggerFactory.getLogger(getClass());
	
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Resource
    private UserTransaction transaction;

       

	public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try{
		logger.info("Enter handle");
		transaction.begin();
		final String name  = "test-1";
		final String code = "test-1";
		Product product = new Product();
		product.setName(name);
		product.setCode(code);
		
		entityManager.persist(product);
		transaction.commit();
		logger.info("Exit handle");
			
		} catch (final Exception ex) {
			ex.getMessage();
		}
	}

}