import java.util.*;
import java.util.ArrayList;
public class Ex6_UnlimitedDataEntry_ArrayList {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter arrayList: ");
        ArrayList <Integer> arrL= new ArrayList<Integer>();
        int sum=0;

        while( true ){
            int number= Integer.parseInt(scanner.nextLine());
            if(number!=-1){
                arrL.add(number);
                sum+=number;
            } else {
                break;
            }
            System.out.print("Continue(press -1 to stop): ");
        }
        System.out.println(arrL);
        System.out.print("The sum is: "+ sum);

    }
}
