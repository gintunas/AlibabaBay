import invoicing.InvoiceImpl;
import items.CoolAutoPart;
import items.CoolHealthCare;
import items.CoolJewelry;
import returns.ReturnImpl;
import tracking.TrackingImpl;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        String oilPanName = "Polish Karter z50";
        String oilPanDesc = "Aluminium, highest quality materials used.";
        CoolAutoPart oilPan = new CoolAutoPart(new BigDecimal(20), oilPanName, oilPanDesc, new TrackingImpl(), new InvoiceImpl(), new ReturnImpl());

        oilPan.addToCart();
        oilPan.getLocation();
        oilPan.printInvoice(oilPan);
        System.out.println(oilPan.returnItem());

        String maskName = "Overpriced mask";
        String maskDesc = "Buy or die";
        CoolHealthCare mask = new CoolHealthCare(new BigDecimal(50), maskName, maskDesc, new InvoiceImpl(), new TrackingImpl());
        mask.checkSafetyStandards();
        mask.addToCart();
    }
}
