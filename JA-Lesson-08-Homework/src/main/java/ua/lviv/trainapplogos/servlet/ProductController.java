package ua.lviv.trainapplogos.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.lviv.trainapplogos.domain.Product;
import ua.lviv.trainapplogos.service.ProductService;
import ua.lviv.trainapplogos.service.impl.ProductServiceImpl;


@WebServlet("/product")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ProductService productService = ProductServiceImpl.getProductService();
    
	
	//to create resource(product): data from client -> object
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String description = request.getParameter("description");
		String price = request.getParameter("price");
		
		Product product = new Product(name, description, getValidatedPrice(price));

		productService.create(product);
		
		response.setContentType("text");
	    response.setCharacterEncoding("UTF-8");
	    response.getWriter().write("Success");
	}
	
	private double getValidatedPrice(String price) {
		if (price == null || price.isEmpty()) {
			return 0;
		}
		return Double.parseDouble(price);
	}
	
	//to get resource(product)
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}
	
	//to update resource(product)
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPut(req, resp);
	}

	//to delete resource(product)
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doDelete(req, resp);
	}

}
