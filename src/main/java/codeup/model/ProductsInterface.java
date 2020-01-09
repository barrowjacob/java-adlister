package codeup.model;


import java.util.List;

public interface ProductsInterface{
        //define methods
        List<ProductBean> listAllProducts();
        void insert(ProductBean product);
        }
