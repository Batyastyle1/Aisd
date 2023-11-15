public class Test {
    public static void main(String[] args) {

        Employee employee = new Employee("Bait" , 2000,1);
        Employee employee1 = new Employee("Bait1" , 2000,2);
        Employee employee2 = new Employee("Bait2" , 2000,4);
        System.out.println(employee);
        System.out.println(employee1);
        System.out.println(employee2);

    }


}



class Employee{
    private String name;
    private int salary;
    private int experience;

    Employee(String name, int salary, int experience) {
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }
    public double getSalaryWithBonus(){
        double bonus;
        if (experience<1){
            bonus = 0.05;
        } else if (experience >= 1 && experience <= 3) {
            bonus= 0.1;
        } else {
            bonus = 0.15;
        }
        double bonusSum= salary*bonus;
        return salary+bonusSum;
    }
}
