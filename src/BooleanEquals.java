package PACKAGE_NAME;

public class BoolEquals {
    public static void main(String args[]) {
        String str1 = "No pain, no gain";
        String str2 = "Cool wheather";
        String str3 = str1;
        boolean value;

        value=str1.equals(str2);
        System.out.println("Are the strings equal? - " + value);

        value=str3.equals(str2);
        System.out.println("Are the strings equal? - " + value);

        value=str3.equals(str1);
        System.out.println("Are the strings equal? - " + value);
    }
}
