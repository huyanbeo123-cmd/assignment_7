import java.util.*;
import java.util.Arrays;

public class Ex13_MergeTwoSortedArrays {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Input the length of array 1: ");
        int x=Integer.parseInt(scanner.nextLine());

        System.out.println("Input the length of array 2: ");
        int y=Integer.parseInt(scanner.nextLine());

        int []arr1=new int[x];
        int []arr2=new int[y];
        int []arr3=new int[x+y];
        System.out.println("Input the array 1: ");
        for(int i=0;i<x;i++){
            arr3[i]=Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Input the length of array 2: ");

        for(int i=x;i<x+y;i++){
            arr3[i]=Integer.parseInt(scanner.nextLine());
        }
        for(int i=0;i<x+y;i++){
            for(int j=i+1;j<x+y;j++){
                if(arr3[i] > arr3[j]){
                    int temp = arr3[i];
                    arr3[i] = arr3[j];
                    arr3[j] = temp;
                }

            }
        }
        System.out.println(Arrays.toString(arr3));

    }
}
