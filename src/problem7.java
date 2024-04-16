public class problem7 {
    public static void printStaircase(int n) {
        for (int i = 1; i <= n; i++) {
            String spaces = " ".repeat(n - i);
            String hashes = "#".repeat(i);
            System.out.println(spaces + hashes);
        }
    }

    public static void main(String[] args) {
        printStaircase(4);
    }
}
