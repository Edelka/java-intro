package PACKAGE_NAME;

public class BoolStartsWith {
    public static void main(String args[]) {
        String str1 = "No pain, no gain";

        System.out.println("The returned string is  - " + str1.startsWith("No "));
        System.out.println("The returned string is  - " + str1.startsWith("No test "));
        System.out.println("The returned string is  - " + str1.startsWith("gain", 12));

    }
}

