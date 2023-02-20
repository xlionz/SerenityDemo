package co.com.choucair.serenitydemo.cer.utils;

import co.com.choucair.serenitydemo.cer.models.Account;
import co.com.choucair.serenitydemo.cer.models.Product;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReadFiles {

    private static final EnvironmentVariables CONF = SystemEnvironmentVariables.createEnvironmentVariables();
    private static final Logger LOGGER = LoggerFactory.getLogger(ReadFiles.class);
    private static final String CONFIG_ACCOUNTS = "accounts.";
    private static final String CONFIG_PRODUCTS = "products.";

    public static Account readAccount(String account){
        LOGGER.info("Se crea existosamente el objeto Account.");
        return new  Account(
                CONF.getProperty(CONFIG_ACCOUNTS + account + ".name"),
                CONF.getProperty(CONFIG_ACCOUNTS + account + ".password")
        );
    }

    public static Product readProduct(String product){
        LOGGER.info("Se crea existosamente el objeto Product.");
        return new Product(
                CONF.getProperty(CONFIG_PRODUCTS + product + ".productName"),
                CONF.getProperty(CONFIG_PRODUCTS + product + ".productImg"),
                CONF.getProperty(CONFIG_PRODUCTS + product + ".supplier"),
                CONF.getProperty(CONFIG_PRODUCTS + product + ".category"),
                CONF.getProperty(CONFIG_PRODUCTS + product + ".quantityPerUnit"),
                CONF.getProperty(CONFIG_PRODUCTS + product + ".unitPrice"),
                CONF.getProperty(CONFIG_PRODUCTS + product + ".unitsInStock"),
                CONF.getProperty(CONFIG_PRODUCTS + product + ".unitsOnOrder"),
                CONF.getProperty(CONFIG_PRODUCTS + product + ".reoderLevel")
        );
    }
}
