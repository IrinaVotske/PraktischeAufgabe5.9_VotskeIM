public class Printer {
    private String queue = "";
    private static int pagesInQueue = 0;
    private static int printedPagesCount = 0;

    private String text = "";
    private String name = "Документ без имени";
    private int pagesCount = 1;

    public void append(String text, String name, int pagesCount) {
        if (text.length() == 0){
            System.out.println("Файл для печати не содержит текста.");
            return;
        }
        queue = queue + "\n" + name + ": " + text + " (" + pagesCount + " стр.).";
        pagesInQueue = pagesInQueue + pagesCount;
    }

    public void append(String text) {
        append(text, "Документ без имени", 1);
    }

    public void append(String text, String name) {
        append(text, name, 1);
    }

    public void append(String text, int pagesCount) {
        append(text, "Документ без имени", pagesCount);
    }

    public void clear() {
        queue = "";
        pagesInQueue = 0;
    }

    public void print() {
        System.out.println(queue);
        printedPagesCount = printedPagesCount + pagesInQueue;
        clear();
    }

    public int getPendingPagesCount() {
        return pagesInQueue;
    }

    public int getPrintedPagesCount() {
        return printedPagesCount;
    }
}
