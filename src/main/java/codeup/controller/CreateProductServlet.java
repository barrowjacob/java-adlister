package codeup.controller;

import codeup.model.DaoFactory;
import codeup.model.ProductBean;
import codeup.model.ProductsInterface;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CreateProductServlet", urlPatterns = "index/create")
public class CreateProductServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("./createProducts.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        ProductsInterface pi = DaoFactory.getProductsDao();
        ProductBean productBean = new ProductBean();
        String Name = request.getAttribute("product_name");
        String Price = Double.parseDouble(request.getParameter("product_price"));
        productBean.setName();
        pi.insert(ProductBean);
    }

}
