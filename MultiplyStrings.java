public class MultiplyStrings {

    public String multiply(String num1, String num2) {

        return String.valueOf(Integer.valueOf((int) (Double.parseDouble(num1) * Double.parseDouble(num2))));
    }
}
