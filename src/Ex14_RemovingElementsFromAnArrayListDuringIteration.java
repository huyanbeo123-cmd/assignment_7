import java.util.*;
import java.util.Arrays;

public class Ex14_RemovingElementsFromAnArrayListDuringIteration {
    public static void main(String[]args ){
        Scanner scanner=new Scanner(System.in);
        ArrayList <Integer> numbers= new ArrayList<>();
        System.out.println("Input your length of array: ");
        int n=Integer.parseInt(scanner.nextLine());
        for(int i=0;i<n;i++){
            numbers.add(Integer.parseInt(scanner.nextLine()));
        }
        System.out.println(Arrays.toString(numbers.toArray()));
        for(int i = numbers.size()-1 ; i>=0;i--){
            if(numbers.get(i)>50)
                numbers.remove(i);
        }
        System.out.println(Arrays.toString(numbers.toArray()));
    }
}
