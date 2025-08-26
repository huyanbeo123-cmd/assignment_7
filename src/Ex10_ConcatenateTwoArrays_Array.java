import java.util.*;
import java.util.Arrays;

public class Ex10_ConcatenateTwoArrays_Array {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input the length of array 1: ");
        int arr1_length=Integer.parseInt(scanner.nextLine());
        System.out.print("Input the length of array 2: ");
        int arr2_length=Integer.parseInt(scanner.nextLine());
        int[] arr1= new int[arr1_length];
        int[] arr2=new int[arr2_length];
        int[] arr_sum=new int[arr1_length+arr2_length];
        System.out.print("Input the first array:");
        for(int i =0; i< arr1.length;i++){
            arr1[i]=Integer.parseInt(scanner.nextLine());
            arr_sum[i]=arr1[i];
        }
        System.out.print("Input the second array:");
        for(int i =0; i< arr2.length;i++){
            arr2[i]=Integer.parseInt(scanner.nextLine());
            arr_sum[arr1_length+i]=arr2[i];
        }
        System.out.println(Arrays.toString(arr1) + Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr_sum));

    }
}
