public class Main {
    public static void main(String[] args) {
        Advisor advisor = new WeeklyAdvisor();
        for (Day day : Day.values()) {
            System.out.print(day + ": ");
            advisor.advise(day);
        }
    }
}
