public class Issues {

    private String issue;
    private boolean isComplete = false;
    private int hoursPlanned;
    private int hoursFact;
    private double expansesPlanned;
    private double expansesFact;
    private String issueStartPlan; // The best way would be to use Date and to add here a command that returns today's date.
    private String issueStartFact;
    private String issueFinishPlan; // The best way would be to use Date and to add here a command that returns today's date.
    private String issueFinishFact; // The best way would be to use Date
    private String issueToDo;
    private String issueCompleted;


    public Issues() {
        this.issueToDo = "План: ";
        System.out.println();
        this.issueCompleted = "Выполнено: ";
    }

    public Issues(String issue, boolean isComplete, int hoursPlanned, int hoursFact, double expansesPlanned, double expansesFact, String issueStartPlan, String issueStartFact, String issueFinishPlan, String issueFinishFact) {
        this();
        this.issue = issue;
        this.isComplete = isComplete;
        this.hoursPlanned = hoursPlanned;
        this.hoursFact = hoursFact;
        this.expansesPlanned = expansesPlanned;
        this.expansesFact = expansesFact;
        this.issueStartPlan = issueStartPlan;
        this.issueStartFact = issueStartFact;
        this.issueFinishPlan = issueFinishPlan;
        this.issueFinishFact = issueFinishFact;
        if (isComplete) {
            this.issueCompleted = issueCompleted + "\n" + issue + " (" + hoursFact + "), начато: " + issueStartFact + ", завершено: " + issueFinishFact  + ", на дело израсходовано: " + expansesFact + " руб.";
        }
        else {
        this.issueToDo = issueToDo + "\n" + issue + " (плановая длительность: " + hoursPlanned + ", фактическая длительность: " + hoursFact + "), запланировано на: " + issueStartPlan + ", начато: " + issueStartFact + ", плановое окончание: " + issueFinishPlan + ", завершено: " + issueFinishFact  + ", на дело израсходовано: " + expansesFact + " руб." + ", на дело израсходовано: " + expansesFact + " руб.";
        }
    }

    public Issues(String issue, int hoursFact, String issueStartFact, String issueFinishFact, double expansesFact) {
        this();
        this.issue = issue;
        isComplete = true;
        this.hoursFact = hoursFact;
        this.issueStartFact = issueStartFact;
        this.issueFinishFact = issueFinishFact;
        this.expansesFact = expansesFact;
        this.issueCompleted = issue + " (" + hoursFact + "), начато: " + issueStartFact + ", завершено: " + issueFinishFact  + ", на дело израсходовано: " + expansesFact + " руб.";
    }

    public Issues(String issue) {
        this(issue, 1, "Today", 0);
    }

    public Issues(String issue, int hoursPlanned, String issueStartPlan, double expansesPlanned) {
        this();
        this.issue = issue;
        this.hoursPlanned = hoursPlanned;
        this.issueStartPlan = issueStartPlan;
//TODO        this.issueFinishPlan = issueStartPlan + hoursPlanned / 4; // Строку можно добавить, если поменять тип данных на даты, исходя из расчета, что на дело можно выделить не более 4 часов в сутки)
        this.expansesPlanned = expansesPlanned;
        this.issueToDo = issueToDo + "\n" + issue + " (" + hoursPlanned + "), запланировано на: " + issueStartPlan + ", плановые расходы: " + expansesPlanned;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    public void setHoursPlanned(int hoursPlanned) {
        this.hoursPlanned = hoursPlanned;
    }

    public void setHoursFact(int hoursFact) {
        this.hoursFact = hoursFact;
    }

    public void setExpansesPlanned(double expansesPlanned) {
        this.expansesPlanned = expansesPlanned;
    }

    public void setExpansesFact(double expansesFact) {
        this.expansesFact = expansesFact;
    }

    public void setIssueStartPlan(String issueStartPlan) {
        this.issueStartPlan = issueStartPlan;
    }

    public void setIssueStartFact(String issueStartFact) {
        this.issueStartFact = issueStartFact;
    }

    public void setIssueFinishPlan(String issueFinishPlan) {
        this.issueFinishPlan = issueFinishPlan;
    }

    public void setIssueFinishFact(String issueFinishFact) {
        this.issueFinishFact = issueFinishFact;
    }

    public String getIssue() {
        return issue;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public int getHoursPlanned() {
        return hoursPlanned;
    }

    public int getHoursFact() {
        return hoursFact;
    }

    public double getExpansesPlanned() {
        return expansesPlanned;
    }

    public double getExpansesFact() {
        return expansesFact;
    }

    public String getIssueStartPlan() {
        return issueStartPlan;
    }

    public String getIssueStartFact() {
        return issueStartFact;
    }

    public String getIssueFinishPlan() {
        return issueFinishPlan;
    }

    public String getIssueFinishFact() {
        return issueFinishFact;
    }

    public String getIssueToDo() {
        return issueToDo;
    }

    public String getIssueCompleted() {
        return issueCompleted;
    }

    public void setIssueToDo() {
        this.issueToDo = issueToDo + "\n" + issue + " (" + hoursPlanned + "), запланировано на: " + issueStartPlan + ", плановые расходы: " + expansesPlanned;;
    }
}
