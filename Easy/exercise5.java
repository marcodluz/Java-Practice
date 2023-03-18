package Easy;

public class exercise5 {
    public static void main(String args[]) {
        int[] list1 = {1,2,3,4,5,6};
        find_largest_number(list1);

        int[] list2 = {10,20,30,40};
        find_largest_number(list2);

        int[] list3 = {-5,-3,-10,-1};
        find_largest_number(list3);
    }
    
    public static void find_largest_number(int[] numbers) {
        int largest = Integer.MIN_VALUE;
        
        for(int number: numbers) {
            if(number > largest) {
                largest = number;
            }
        }

        System.out.println(largest);
    }
}
