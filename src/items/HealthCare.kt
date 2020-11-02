package items;

import java.math.BigDecimal;

public class HealthCare extends Item {
    public HealthCare(BigDecimal price, String name, String description) {
        super(price, name, description);
    }

    public void checkSafetyStandards(){
        System.out.println("Highest Klass 1");
    }

    public int checkMinimalUsersAge(){
        return 11;
    }
}
