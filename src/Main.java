public class Main {

    public static void main(String[] args) {
        DamnBigNumber num1 = new DamnBigNumber("123");
        DamnBigNumber num2 = new DamnBigNumber("456");
        DamnBigNumber result = DamnBigNumbers.add(num1, num2);
        System.out.println("Result: " + result.getNumber());
    }
}