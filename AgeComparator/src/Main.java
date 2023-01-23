public class Main {
    public static void main(String[] args) {
        int vasyaAge = 29;
        int katyaAge = 14;
        int mishaAge = 36;

        int min = -1; // minimal age
        int max = -1; // maximum age
        int middle = -1; // middle age

        if (vasyaAge < 0 || vasyaAge > 120 || katyaAge < 0 || katyaAge > 120 || mishaAge < 0 || mishaAge > 120) {
            System.out.println("Возраст не может быть меньше 0 или больше 120!");
        } else {
            if (vasyaAge >= katyaAge && katyaAge >= mishaAge) {
                max = vasyaAge;
                middle = katyaAge;
                min = mishaAge;
            } else if (vasyaAge >= mishaAge && mishaAge >= katyaAge){
                max = vasyaAge;
                middle = mishaAge;
                min = katyaAge;
            } else if (katyaAge >= vasyaAge && vasyaAge >= mishaAge) {
                max = katyaAge;
                middle = vasyaAge;
                min = mishaAge;
            } else if (katyaAge >= mishaAge && mishaAge >= vasyaAge) {
                max = katyaAge;
                middle = mishaAge;
                min = vasyaAge;
            } else if (mishaAge >= vasyaAge && vasyaAge >= katyaAge) {
                max = mishaAge;
                middle = vasyaAge;
                min = katyaAge;
            } else {
                max = mishaAge;
                middle = katyaAge;
                min = vasyaAge;
            }
        System.out.println("Minimal age: " + min);
        System.out.println("Middle age: " + middle);
        System.out.println("Maximal age: " + max);
        }
    }
}
