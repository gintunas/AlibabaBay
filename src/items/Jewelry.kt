package items;

import java.math.BigDecimal;

public class Jewelry extends Item{
    public Jewelry(BigDecimal price, String name, String description) {
        super(price, name, description);
    }

    public void printGoldQtInAlloy(){
        System.out.println("1 kg");
    }

    public void printWhereGoldIsFrom(){
        System.out.println("Java Island");
    }
}
