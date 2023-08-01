import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Issues issueOne = new Issues("Составить план дел на сегодня");
        System.out.println("Сколько часов планируете потратить на него?");
        int hoursPlanned = new Scanner(System.in).nextInt();
        issueOne.setHoursPlanned(hoursPlanned);
        System.out.println("Когда планируете начать (dd.MM.YYYY)?");
        String issueStartPlanned = new Scanner(System.in).nextLine();
        issueOne.setIssueStartPlan(issueStartPlanned);
        System.out.println("Какие расходы заложены в бюджет на выполнение данного дела (руб.)?");
        double expansesPlanned = new Scanner(System.in).nextDouble();
        issueOne.setExpansesPlanned(expansesPlanned);

        issueOne.setIssueToDo();


        Issues issueTwo = new Issues("Составить бюджет расходов на ближайший месяц", 2, "24.04.2023",0);

        System.out.println();
        System.out.println(issueOne.getIssueToDo() + "\n" + issueTwo.getIssueToDo() + "\n" + issueOne.getIssueCompleted() + "\n" + issueTwo.getIssueCompleted());
    }
}
