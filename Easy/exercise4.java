package Easy;
public class exercise4 {
    public static void main(String args[]) {
        is_substring("hello world", "world");
        is_substring("python is fun", "java");
        is_substring("racecar", "car");
    }
    
    public static void is_substring(String string1, String string2) {
        if(string1.contains(string2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
