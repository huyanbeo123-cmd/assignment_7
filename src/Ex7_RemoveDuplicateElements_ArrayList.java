import java.util.ArrayList;
import java.util.*;
public class Ex7_RemoveDuplicateElements_ArrayList {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        ArrayList <Integer> arrL= new ArrayList<>();
        System.out.print("Enter an array: ");
        while(true){
            int number=Integer.parseInt(scanner.nextLine());
            if(number!=-1 )
                arrL.add(number);
            else {
                break;
            }
        }
        int duplicate=arrL.get(0);
        System.out.println(arrL + " is the arrayList before scan");
        for(int i=0;i<arrL.size();i++){
            for(int j=i+1; j<arrL.size()-1;j++)
                if(arrL.get(i)== arrL.get(j)) {
                    arrL.remove(j);
                    j--;
                }
        }
        System.out.println(arrL + " is the arrayList after scan");


    }
}
