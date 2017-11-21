package PACKAGE_NAME;

public class StringSplit {
    public static void main(String args[]) {
        String str1 = "No pain, no gain";
        String split[] = str1.split(" ");

        System.out.println("The new string is  - ");
        for (String value : split) {
            System.out.println(value);
        }


        String str2 = "Life is wonderful!";

        System.out.println("The new string is  - " );
        for (String value2: str2.split(" ")) {
            System.out.println(value2);
        }


        String data = "004-034556-1212-232-232";
        int cnt = 1;
        for (String item : data.split("-")) {
            System.out.println("string " + cnt + " = " + item);
            cnt++;
        }
    }
}

