public class Main {
    public static void main(String[] args) {
        Printer printer = new ConsolePrinter();
        ConsolePrinter.Message msg1 = new ConsolePrinter.Message("Привіт усім!", "Олександр");
        printer.print(msg1);
        ConsolePrinter.Message msg2 = new ConsolePrinter.Message("Секретне повідомлення", null);
        printer.print(msg2);
        ConsolePrinter.Message msg3 = new ConsolePrinter.Message(null, "");
        printer.print(msg3);
    }
}
