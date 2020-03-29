package A_Single_responsibility.wrong;

public class Employee {
    String name;

    public String getName() {
        return name;
    }

    public void printTimeSheetReport() {
        System.out.println(name);
    }
}
