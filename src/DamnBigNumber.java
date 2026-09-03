public class DamnBigNumber {
    private String number;
    public DamnBigNumber(String number) {
        this.number = number;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    @Override
    public String toString() {
        return "DamnBigNumber: " + number;

    }
}