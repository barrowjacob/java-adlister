package codeup.controller;

import codeup.model.DaoFactory;
import codeup.model.ProductsInterface;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/products/all")
public class ShowProductsServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    ProductsInterface pi = DaoFactory.getProductsDao();
    ArrayList prodList = (ArrayList) pi.listAllProducts();
    request.setAttribute("productList", prodList);
    request.getRequestDispatcher("webapp/index.jsp").forward(request, response);

    }

}
