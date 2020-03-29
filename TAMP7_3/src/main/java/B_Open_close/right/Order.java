package B_Open_close.right;

import java.util.List;

public class Order {
    List<String> lineItems;

    Shipping shipping;

    public Integer getTotal() {
        return lineItems.size();
    }

    public Integer getTotalWeight() {
        return lineItems.size() * 2;
    }

    public void setShippingType(Shipping shipping) {
        this.shipping = shipping;
    }

    public Integer getShippingCost() {
       return shipping.getCost(this);
    }
}
