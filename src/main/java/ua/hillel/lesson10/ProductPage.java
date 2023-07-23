package ua.hillel.lesson10;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductPage {
    private final static Logger LOGGER = Logger.getLogger(ProductPage.class.getName());

    public void setProductStatus(String status) {
        LOGGER.log(Level.INFO, "Setting status" + status);

    }

    public void setProductStatus(ProductStatus status) {
        System.out.println(status.getStatus());

    }
}
