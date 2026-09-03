public class DamnBigNumbers {
    public static DamnBigNumber add(DamnBigNumber a, DamnBigNumber b) {
        String num1 = a.getNumber();
        String num2 = b.getNumber();
// Simple concatenation for demonstration (not actual addition)
        return new DamnBigNumber(num1 + num2);
    }
}