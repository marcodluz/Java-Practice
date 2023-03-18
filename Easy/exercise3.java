package Easy;
public class exercise3 {
    public static void main(String args[]) {
        reverse_string("hello");
        reverse_string("python");
        reverse_string("racecar");
    }

    public static void reverse_string(String word) {
        String new_string = "";

        for(int i = word.length() - 1; i >= 0; i--) {
            new_string += word.charAt(i);
        }

        System.out.println(new_string);
    }
}
