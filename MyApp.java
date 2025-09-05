public class MyApp {
    public static void main(String[] args) {
        // ANSI escape codes for color
        String ANSI_RESET = "\u001B[0m";
        String ANSI_CYAN = "\u001B[36m";
        System.out.println(ANSI_CYAN + "========================" + ANSI_RESET);
        System.out.println("      \u001B[31mH\u001B[33me\u001B[32ml\u001B[36ml\u001B[34mo\u001B[35m,\u001B[31m W\u001B[33mo\u001B[32mr\u001B[36ml\u001B[34md\u001B[35m!\u001B[0m");
        System.out.println(ANSI_CYAN + "========================" + ANSI_RESET);
    }
}