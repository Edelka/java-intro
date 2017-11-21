package PACKAGE_NAME;

public class StringSplit {
    public static void main(String args[]) {
        String str1 = "No pain, no gain";
        String split[] = str1.split(" ");

        System.out.println("The new string is  - " );
        for (String value:split) {
            System.out.println(value);
        }
    }
}

