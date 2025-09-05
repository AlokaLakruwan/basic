public class MyApp {
    public static void main(String[] args) {
        // ANSI escape codes for color
        String ANSI_RESET = "\u001B[0m";
        String ANSI_CYAN = "\u001B[36m";
        String ANSI_PURPLE = "\u001B[35m";
        System.out.println(ANSI_CYAN + "========================" + ANSI_RESET);
        System.out.println(ANSI_PURPLE + "      Hello, World!      " + ANSI_RESET);
        System.out.println(ANSI_CYAN + "========================" + ANSI_RESET);
    }
}