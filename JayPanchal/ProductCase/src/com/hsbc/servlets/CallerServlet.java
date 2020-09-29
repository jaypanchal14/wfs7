package com.hsbc.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hsbc.dao.ProductDaoImpl;
import com.hsbc.model.Product;

/**
 * Servlet implementation class CallerServlet
 */
@WebServlet("/CallerServlet")
public class CallerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProductDaoImpl productObj;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CallerServlet() {
        super();
         productObj = new ProductDaoImpl();
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Product> products=productObj.getProducts();
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html><body><table border=1>");
		out.println("<tr><th>ProductId</th><th>ProductName</th><th>Category</th>");
		out.println("<th>Price</th><th>Quantity</th><th>ROL</th></tr>");
		for(Product p:products){
			out.println("<tr><td>"+p.getProductId()+"</td><td>"+p.getProductName()+"</td><td>"+p.getCategory()+
					"</td><td>"+p.getPrice()+"</td><td>"+p.getQuantity()+"</td><td>"+p.getRol()+"</td></tr>");
		}
		out.println("</table></body></html>");
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String productId=request.getParameter("productId");
		String productName=request.getParameter("productName");
		String category=request.getParameter("category");
		int price=Integer.parseInt(request.getParameter("price"));
		int quantity=Integer.parseInt(request.getParameter("quantity"));
		int rol=Integer.parseInt(request.getParameter("rol"));
		Product product=new Product(productId, productName, category, price, quantity, rol);
		productObj.saveProduct(product);
	}
	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String productId=request.getParameter("productId");
		productObj.updateProduct(productId);
		response.setContentType("text/html");
		response.getWriter().println("<h2>Record Updated</h2>");
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String productId=request.getParameter("productId");
		productObj.deleteProduct(productId);
		response.setContentType("text/html");
		response.getWriter().println("<h2>Record Deleted</h2>");
	}
}