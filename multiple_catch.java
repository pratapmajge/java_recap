public class multiple_catch {
    public static void main(String[] args) {
        try {
            int[] arr_name = new int[5];
            arr_name[7] = 10;
            int res = 10 / 0;
            System.out.println("Division is " + res);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero" + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index limit excceded " + e.getMessage());
        } finally {
            System.out.println("Exceptions executed");
        }
    }
}
