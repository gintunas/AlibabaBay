package items;

import java.math.BigDecimal;

public class AutoPart extends Item{
    public AutoPart(BigDecimal price, String name, String description) {
        super(price, name, description);
    }

    public void showSupportedModels(){
        System.out.println("\nHonda Civic V,\nHonda Accord VI");
    }

    public void printWarrantySeal(){
        System.out.println("ACBXMKJLLI142428AGHSD");
    }
}
