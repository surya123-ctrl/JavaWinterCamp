public class TestThrows {
    public static int divideNum(int m, int n) throws ArithmeticException {
        int num = m / n;
        return num;
    }
    public static void main(String[] args) {
        TestThrows obj = new TestThrows();
        try {
            System.out.println(obj.divideNum(45, 0));
        }
        catch (ArithmeticException e) {
            System.out.println("Number cannot be divided by 0");
        }
        System.out.println("Rest Code");
    }
}
