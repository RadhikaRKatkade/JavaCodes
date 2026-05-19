class Employee {
    private int empid;

    public void setEmpid(int empid1) {
        empid = empid1;
    }

    public int getEmpid() {
        return empid;
    }
}

class encapsulation {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmpid(101);
        System.out.println(e.getEmpid());

    }
}