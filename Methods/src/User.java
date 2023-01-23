public class User {
    public static int number = 0;
    private static String name;
    private static int age;
    private static int numberUser = 0;


    public User(String name, int age){
        number = number + 1;
        this.numberUser = number;
//        System.out.println("Количество пользователей: " + numberUser);
        this.name = name;
        this.age = age;
    }


    public static void print(String titleUser){
        String ageMeasure= "";
        if (age % 10 == 1) {
            ageMeasure = "год";
        } else if ((age % 10 >= 5) || (age / 10 == 1)) {
            ageMeasure = "лет";
        }
        else{
            ageMeasure = "года";
        }
        System.out.println(titleUser + " " + name + ", " + age + " " + ageMeasure + ".");
    }


    public static int countUsers(){
        System.out.println("Number of users is: " + numberUser);
        return numberUser;
    }

    public static String getName(User user){
        return name;
    }
}
