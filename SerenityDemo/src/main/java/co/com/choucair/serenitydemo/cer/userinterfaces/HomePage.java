package co.com.choucair.serenitydemo.cer.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static final Target LBL_NORTHWIND = Target.the("Label of northwind section.")
            .locatedBy("//span[text() = 'Northwind']");
    public static final Target LBL_PRODUCTS = Target.the("Label of products section.")
            .locatedBy("//span[text() = 'Products']");
    public static final Target INPUT_SEARCH = Target.the("Input to search a product.")
            .locatedBy("//input[contains(@class, 's-Serenity-QuickSearchInput')]");
    public static final Target BTN_SEARCH = Target.the("Button to search a product.")
            .locatedBy("//span[@class = 'quick-search-icon']");
    public static final Target BTN_ADD_PRODUCT = Target.the("Button to create a new product.")
            .locatedBy("//span[contains(text(), 'Nuevo Product')]");
    public static final Target LBL_TITLE_PRODUCT = Target.the("Label of title of product.")
            .locatedBy("//a[text() = '{0}']");
    public static final Target INPUT_PRODUCT_NAME = Target.the("Input of product name.")
            .locatedBy("//input[@name = 'ProductName']");
    public static final Target BTN_UPLOAD_FILE = Target.the("Button to upload product img.")
            .locatedBy("//input[@type = 'file']");
    public static final Target OPT_SUPPLIER = Target.the("List of suppliers.")
            .locatedBy("//span[text() = '--seleccionar--']");
    public static final Target OPT_CATEGORY = Target.the("List of categories.")
            .locatedBy("//span[text() = '--seleccionar--']");
    public static final Target OPT_OPTIONS = Target.the("Option of the list.")
            .locatedBy("//div[text() = '{0}']");
    public static final Target INPUT_QUANTITY_UNIT = Target.the("Input of quantity per unit.")
            .locatedBy("//input[@name = 'QuantityPerUnit']");
    public static final Target INPUT_UNIT_PRICE = Target.the("Input of price per unit.")
            .locatedBy("//input[@name = 'UnitPrice']");
    public static final Target INPUT_UNITS_STOCK = Target.the("Input of unit in stock.")
            .locatedBy("//input[@name = 'UnitsInStock']");
    public static final Target INPUT_UNITS_ODER = Target.the("Input of units in order")
            .locatedBy("//input[@name = 'UnitsOnOrder']");
    public static final Target INPUT_REODER_LVL = Target.the("Input of reorder level.")
            .locatedBy("//input[@name = 'ReorderLevel']");
    public static final Target BTN_SAVE_PRODUCT = Target.the("Button to save product.")
            .locatedBy("//span[contains(text(), 'Guardar')]");
}
