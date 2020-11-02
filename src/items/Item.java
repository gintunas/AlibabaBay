package items;

import java.math.BigDecimal;

public abstract class Item {
    public String name;
    public String description;
    public BigDecimal price;

    public Item(BigDecimal price, String name, String description) {
        this.price = price;
        this.name = name;
        this.description = description;
    }

    public void addToCart(){
        System.out.println("Item " + this.name + " added to cart.");
    }
}
