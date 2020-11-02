import invoicing.InvoiceImpl;
import items.AutoPartDeluxe;
import items.HealthCareDeluxe;
import returns.ReturnImpl;
import tracking.TrackingImpl;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        String oilPanName = "Polish Karter z50";
        String oilPanDesc = "Aluminium, highest quality materials used.";
        AutoPartDeluxe oilPan = new AutoPartDeluxe(new BigDecimal(20), oilPanName, oilPanDesc, new TrackingImpl(), new InvoiceImpl(), new ReturnImpl());

        oilPan.addToCart();
        oilPan.getLocation();
        oilPan.printInvoice(oilPan);
        System.out.println(oilPan.returnItem());

        String maskName = "Overpriced mask";
        String maskDesc = "Buy or die";
        HealthCareDeluxe mask = new HealthCareDeluxe(new BigDecimal(50), maskName, maskDesc, new InvoiceImpl(), new TrackingImpl());
        mask.checkSafetyStandards();
        mask.addToCart();
    }
}
