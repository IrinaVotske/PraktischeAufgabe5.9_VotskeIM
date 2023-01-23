public class Employee {

    private String name;
    private String email = "is not set";
    private int phone;
    public static int number = 0;
    private int codeEmployee = 0;

    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
        number = number + 1;
        this.codeEmployee = number;
        System.out.println(number + ". Employee " + name + "(" + codeEmployee + ")" + " was created.");
    }

    public Employee(String name, int phone) {
        this.name = name;
        this.phone = phone;
        number = number + 1;
        this.codeEmployee = number;
        System.out.println(number + ". Employee " + name + "(" + codeEmployee + ")" + " was created.");
    }

    public Employee(String name, String email, int phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        number = number + 1;
        this.codeEmployee = number;
        System.out.println(number + ". Employee " + name + "(" + codeEmployee + ")" + " was created.");
    }

    public void printInfo() {
        if (codeEmployee == 1) {
            System.out.println();
        }
        System.out.println("Employee " + codeEmployee + ":");
        System.out.println("Name: " + name);
        System.out.println("E-mail: " + email);
        System.out.println("Phone number: " + (phone > 0 ? phone : "is not set."));
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getPhone() {
        return phone;
    }

    public int getNumber() {
        return number;
    }
}
