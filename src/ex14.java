public class ex14 {
    static int product(int... numbers) {
        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        return product;
    }
    public static void main(String[] args) {
        System.out.printf("The product of 2 numbers is: %d%n", product(1, 2));
        System.out.printf("The product of 3 numbers is: %d%n", product(3, 4, 5));
        System.out.printf("The product of 4 numbers is: %d%n", product(6, 7, 8, 9));
        System.out.printf("The product of 5 numbers is: %d%n", product(10, 11, 12, 13, 14));
    }
}