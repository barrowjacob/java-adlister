package codeup.model;

import java.util.ArrayList;
import java.util.List;

public class ProductImpl implements ProductsInterface{
    List<ProductBean> product_db = new ArrayList();


    @Override
    public void insert(ProductBean product) {

    }


    @Override
    public List<ProductBean> listAllProducts() {
        //mocking database using ArrayList
        product_db.add(ProductBean);


    }

}