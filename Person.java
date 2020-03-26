package Person;



public class Person {

    private String name;
    private int age;
    private String favoriteSport;
    private String occupation;
    private double salary;


    public Person(String name, int age, String favoriteSport, String occupation, double salary) {
        this.name = name;
        this.age = age;
        this.favoriteSport = favoriteSport;
        this.occupation = occupation;
        this.salary = salary;

    }

    public Person(int i) {
    }

    public String status() {
        return "My name is " + this.name + " and I am " + this.age + " years old. My Favorite sport is " + this.favoriteSport + " and by this time next year my occupation will be " + this.occupation + " meaning I could be making up to " + this.salary + " yearly!";
    }


    public int yearlyBonus() {
        int i = 0;
        return (int) (i + salary);
        }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFavoriteSport() {
        return favoriteSport;
    }

    public void setFavoriteSport(String favoriteSport) {
        this.favoriteSport = favoriteSport;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    }



