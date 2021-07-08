package hw5;

public class MainClass {
    public static void main(String[] args) {
        Employee[] superGood = new Employee[5];
        superGood[0] = new Employee("Strekalovsky Ruslan", "CEO", "strekalovsky@mailbox.com", "89241234565", 100000, 50);
        superGood[1] = new Employee("Malyshev Alexander", "Director или Vice President", "malyshev@mailbox.com", "89241236545", 90000, 45);
        superGood[2] = new Employee("Logachev Alexander", "Supervisors", "logachev@mailbox.com", "89241237898", 80000, 35);
        superGood[3] = new Employee("Izakson Mikhail", "Specialists", "izakson@mailbox.com", "89241239878", 70000, 30);
        superGood[4] = new Employee("Prokopchuk Alexander", "Clerks", "prokopchuk@mailbox.com", "89241237595", 60000, 18);
        for (Employee employee : superGood)
            if (employee.getAge() > 40)
                System.out.println(employee);
    }
}

class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return (name + "\n-"
                + position + "\n-"
                + email + "\n-"
                + phone + "\n-"
                + salary + "\n-"
                + age + "\n");
    }
}
