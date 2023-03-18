package Easy;

public class exercise6 {
    public static void main(String args[]) {
        System.out.println(concatenate_strings("hello","world"));
        System.out.println(concatenate_strings("python","is fun"));
        System.out.println(concatenate_strings("racecar","driver"));
    }

    public static String concatenate_strings(String string1, String string2) {
        return string1 + " " + string2;
    }
}
