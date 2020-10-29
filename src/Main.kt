import items.AutoPart;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args){
        AutoPart oilPan = new AutoPart(new BigDecimal(20), "Polish Karter z50", "Aluminium, highest quality materials used.");

        oilPan.addToCart();
        oilPan.getLocation();
        oilPan.printInvoice(oilPan);
        System.out.println(oilPan.returnItem());
    }
}
