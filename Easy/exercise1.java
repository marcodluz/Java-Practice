package Easy;
public class exercise1 {
    public static void main(String args[]) {
        calculator(5,3,"addiction");
        calculator(10,2,"subtraction");
        calculator(4,7,"multiplication");
        calculator(10,5,"division");
        calculator(7,2,"exponentiation");
    }

    public static void calculator(int num1, int num2, String operation) {
        int result;

        switch (operation) {
        case "addiction":
            result = num1 + num2;
            System.out.println(result);
            break;
        case "subtraction":
            result = num1 - num2;
            System.out.println(result);
            break;
        case "multiplication":
            result = num1 * num2;
            System.out.println(result);
            break;
        case "division":
            float result_division = num1 / num2;
            System.out.println(result_division);
            break;
        default:
            System.out.println("None");
        }
    }
}