class Employee {
    private Double salary;
    private Double bonus;

    public void setBonus(Double s) {
        System.out.println("salary before adding bonus: " + s);
        salary = s;
        if (salary > 30000) {
            bonus = salary + 5000;
        } else {
            System.out.println("not applicable for bonus");
        }
    }

    public Double getBonus() {
        return bonus;
    }
}

public class encapsulationProblem2 {
    public static void main(String[] args) {
        Employee e = new Employee();

        e.setBonus(40000.00);
        System.out.println(e.getBonus());

    }
}
