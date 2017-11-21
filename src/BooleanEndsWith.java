package PACKAGE_NAME;

public class BoolEndsWith {
    public static void main(String args[]) {
        String str = "No pain, no gain";
        boolean value;

        value=str.endsWith("gain");
        System.out.println("The returned value is - " + value);

        value=str.endsWith("to gain information");
        System.out.println("The returned value is - " + value);
    }
}
