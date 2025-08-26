import java.util.*;
import java.util.Arrays;

public class Ex9_SwapTwoElementsInAnArray_ArrayAsParameter {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("How many numbers do you want");
        int length=Integer.parseInt(scanner.nextLine());
        int [] numbers=new int[length];
        System.out.println("Enter the array: ");
        for (int i=0;i<length;i++){
            numbers[i]=Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Choose two number you want to swap: ");
        System.out.print("Index 1: ");
        int index1=Integer.parseInt(scanner.nextLine());
        System.out.print("Index 2: ");
        int index2=Integer.parseInt(scanner.nextLine());
        System.out.println( Arrays.toString(numbers)+ " is the array before swap");

        int temp= numbers[index1];
        numbers[index1]=numbers[index2];
        numbers[index2]=temp;
        System.out.println( Arrays.toString(numbers)+ " is the array after swap");

    }
}
