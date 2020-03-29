package B_Open_close.right;

import static java.lang.Math.max;

public class Air implements Shipping {
    @Override
    public Integer getCost(Order order) {
        return max(20, order.getTotalWeight() * 3);
    }
}
