package E_Dependency_inversion.wrong;

import java.util.Date;

public class BudgetReport {
    MySQLDatabase sqlDatabase;

    public void open(Date date) {
        // Do smth
    }

    public void save() {
        // Do smth
    }
}
