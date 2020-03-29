package B_Open_close.wrong;

import java.util.List;

import static java.lang.Math.max;

public class Order {
    List<String> lineItems;
    String shipping;

    public Integer getTotal() {
        return lineItems.size();
    }

    public Integer getTotalWeight() {
        return lineItems.size();
    }

    public String getShippingType() {
        return shipping;
    }

    public Integer getShippingCost() {
        if (shipping.equals("ground")) {
            if (getTotal() > 100) {
                return 0;
            }
        } else if (shipping.equals("air")) {
            return max(20, getTotalWeight() * 3);
        }
        return 1000;
    }

}
