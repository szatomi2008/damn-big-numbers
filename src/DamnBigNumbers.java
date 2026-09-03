public class DamnBigNumbers {

    public static DamnBigNumber add(DamnBigNumber a, DamnBigNumber b) {
        String num1 = a.getNumber();
        String num2 = b.getNumber();
        // Actual addition logic (simplified)

        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        return new DamnBigNumber(String.valueOf(n1 + n2));
    }
}