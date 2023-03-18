package Easy;
public class exercise2 {
    public static void main(String args[]) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        sum_even_number(numbers);

        int[] numbers2 = {10, 20, 30, 40};
        sum_even_number(numbers2);

        int[] numbers3 = {1, 3, 5};
        sum_even_number(numbers3);
    }

    public static void sum_even_number(int[] numbers) {
        int addiction = 0;

        for(int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                addiction += numbers[i];
            }
        } 
        System.out.println(addiction);
    }
}
