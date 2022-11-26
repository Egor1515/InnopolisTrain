
public class Main {
    public static void main(String[] args) {

        try {
            int x = 10;
            int y = 10;
            int result = x / y;
            System.out.println(result);
        } catch (Exception exception) {
            System.out.println("делить на ноль нельзя");
        }
        finally
        {
            System.out.println("Попробуйте заново");
        }
    }
}
