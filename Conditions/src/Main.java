public class Main {
    public static void main(String[] args) {
        int paperReserve = 600000;
        int inkReserve = 600000;
        int coverReserve = 2000;
        double printRollerMinTemp = 80.5;
        double printRollerMaxTemp = 120.75;

        int pagesInBook = 530;
        int booksCount = 2000;
        boolean coldPrintingMode = false;
        double printRollerTemp = 200;

        int papersCount = booksCount * pagesInBook / 2;
        int inkedPapersCount = papersCount + booksCount;

        boolean paperIsEnough = papersCount <= paperReserve;
        boolean inkIsEnough = inkedPapersCount <= inkReserve;
        boolean coversAreEnough = booksCount <= coverReserve;
        boolean rollerTempIsNormal =
                printRollerTemp >= printRollerMinTemp &&
                        printRollerTemp <= printRollerMaxTemp;

        boolean errors = false;
        if (!paperIsEnough) {
            errors = true;
            System.out.println("Бумаги недостаточно");
        }
        if (!inkIsEnough) {
            errors = true;
            System.out.println("Чернил недостаточно");
        }
        if (!coversAreEnough) {
            errors = true;
            System.out.println("Обложек недостаточно");
        }
        if (!coldPrintingMode && !rollerTempIsNormal) {
            errors = true;
            System.out.println("Неверный режим печати или температура печатающего ролла недопустимая");
        }
        String message = errors ? "Печать запрещена" : "Печать разрешена";
        System.out.println(message);
        /*if (errors) {
            System.out.println("Печать запрещена");
        } else {
           System.out.println("Печать разрешена");
        }*/
    }
}
