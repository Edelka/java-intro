package lesson2;

public class BoolEqualsIgnoreCase {
    public static void main(String args[]) {
        String str1 = "No pain, no gain";
        String str2 = "Cool wheather";
        String str3 = "cOOL WheaTher";
        boolean value;

        value = str1.equalsIgnoreCase(str2);
        System.out.println("Are the strings equal? - " + value);

        value = str3.equalsIgnoreCase(str2);
        System.out.println("Are the strings equal? - " + value);

        value = str3.equalsIgnoreCase(str1);
        System.out.println("Are the strings equal? - " + value);
    }
}
