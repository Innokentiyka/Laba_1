public class ArabicCalcs extends Calculations {

    @Override
    public String addition(String a, String b) {
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);

        Operation op = new Addition();

        int result = op.execute(x, y);

        return String.valueOf(result);
    }

    @Override
    public String multiplication(String a, String b) {
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);

        Operation op = new Multiplication();

        int result = op.execute(x, y);

        return String.valueOf(result);
    }

    @Override
    public String division(String a, String b) {
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);

        Operation op = new Division();

        int result = op.execute(x, y);

        return String.valueOf(result);
    }

    @Override
    public String subtraction(String a, String b) {
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);

        Operation op = new Subtraction();

        int result = op.execute(x, y);

        return String.valueOf(result);
    }
}
