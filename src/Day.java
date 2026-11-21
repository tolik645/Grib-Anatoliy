enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}
interface Advisor {
    void advise(Day day);
}
class WeeklyAdvisor implements Advisor {
    @Override
    public void advise(Day day) {
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("Порада для продуктивності: складіть список із 3 головних задач на день і працюйте над ними блоками по 25–50 хвилин без відволікань.");
                break;
            case FRIDAY:
                System.out.println("Happy Friday!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Ідеї для вихідних: прогуляйтеся міським парком, відвідайте місцеву кав'ярню, музей або виїжджайте на природу.");
                break;
        }
    }
}
