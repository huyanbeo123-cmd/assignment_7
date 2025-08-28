import java.util.*;
import java.util.Arrays;

public class Ex11_FindTheSecondLargestElement_Array {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many numbers do you want for the array: ");
        int n=Integer.parseInt(scanner.nextLine());
        int[] numbers=new int[n];
        System.out.println("Enter your arrays: ");
        for(int i =0; i<n;i++){
            numbers[i]=Integer.parseInt(scanner.nextLine());
        }
        int largest=numbers[0];
        int secondLargest=numbers[1];
        for(int i=0;i<n;i++){
            if(largest<= numbers[i])
                largest=numbers[i];
        }
        for(int i=0;i<n;i++){
            if( secondLargest<=numbers[i] && largest!=numbers[i])
                secondLargest=numbers[i];
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("The second-largest element is: "+secondLargest);
        System.out.println("The largest element is: "+largest);


    }
}
