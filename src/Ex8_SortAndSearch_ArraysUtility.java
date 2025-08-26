import java.util.*;
import java.util.Arrays;

public class Ex8_SortAndSearch_ArraysUtility {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int [] numbers=new int[5];
        System.out.println("Enter 5 integer: ");
        for(int i=0;i<numbers.length;i++){
            numbers[i]=Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }
}
