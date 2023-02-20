package co.com.choucair.serenitydemo.cer.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Product {
    private String productName;
    private String productImg;
    private String supplier;
    private String category;
    private String quantityPerUnit;
    private String unitPrice;
    private String unitsInStock;
    private String unitsOnOrder;
    private String reoderLevel;


}
