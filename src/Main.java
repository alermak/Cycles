public class Main {
    public static void main(String[] args) {
        int i = 1;
        while (i < 11) {
            System.out.print(i + " ");
            i++;
        }
        System.out.print("\n");
        for (int y = 10; y > 0; y--) {
            System.out.print(y + " ");
        }
        System.out.print("\n");
        int friday = 6;
        while (friday < 32) {
            System.out.println("Today is Friday, the " + friday + "th. You need to prepare a report.");
            friday += 7;
        }
        int year = 0;
        while (year < 2022) {
            year += 79;
            if (year > 1822) {
                System.out.println(year);
            }
        }
    }
}