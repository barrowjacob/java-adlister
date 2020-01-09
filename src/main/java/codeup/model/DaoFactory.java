package codeup.model;

public class DaoFactory {
    private static ProductImpl daoProductImpl = new ProductImpl();

    public static ProductsInterface getProductsDao() {
        if (daoProductImpl == null) {
            daoProductImpl = new ProductImpl();
        }
        return daoProductImpl;
    }

}
