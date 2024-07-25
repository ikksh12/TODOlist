public class TodoList {
    public static void main(String[] args) {
        printNumbersUpTo(5);
    }

    private static void printNumbersUpTo(int limit) {
        for (int i = 1; i <= limit; i++) {
            System.out.println("i = " + i);
        }
    }
}