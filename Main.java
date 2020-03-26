package Person;



public class Main {
    public static void main(String[] args) {
        Person person = new Person(0);

        Person p1 = new Person("Garry", 26, "Basketball", "Car Salesman", 40000);
        System.out.println(p1.status());
        Person p2 = new Person("Genesis", 28, "Hockey", "Mailman", 55000);
        System.out.println(p2.status());
        Person p3 = new Person("Jack", 24, "Soccer", "Waiter", 21000);
        System.out.println(p3.status());


        p2.setSalary(63000);
        System.out.println(p2.status());


        int yearlyBonus = 100;
        p3.setSalary(21000 + yearlyBonus);
        System.out.println(p3.status());
    }
}
