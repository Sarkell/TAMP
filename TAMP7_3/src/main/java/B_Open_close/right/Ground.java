package B_Open_close.right;

import static java.lang.Integer.max;

public class Ground implements Shipping {
    @Override
    public Integer getCost(Order order) {
        if (order.getTotal() > 100) {
            return 0;
        }
        return max(10, order.getTotalWeight() * 2);
    }
}
