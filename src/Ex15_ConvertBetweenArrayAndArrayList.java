import java.util.*;
public class Ex15_ConvertBetweenArrayAndArrayList {
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number of elements in array: ");
        int x= Integer.parseInt(scanner.nextLine());
        String [] arr=new String[x];

        System.out.println("Enter your arrays: ");
        for(int i=0; i<x;i++){
            arr[i] = scanner.nextLine();
        }

        ArrayList<String> list_1 = new ArrayList<>();
        for (int i=0; i<arr.length;i++){
            list_1.add(arr[i]);
        }
        System.out.println("Changing from array to array list: "+ list_1);

        System.out.print("Enter number of elements in array: ");
        int y = Integer.parseInt(scanner.nextLine());
        ArrayList<String> list_2 = new ArrayList<>();

        System.out.println("Enter ArrayList elements:");
        for (int i = 0; i < y; i++) {
            list_2.add(scanner.nextLine());
        }

        String[] arr2 = new String[list_2.size()];
        for (int i = 0; i < list_2.size(); i++) {
            arr2[i] = list_2.get(i);
        }
        System.out.println("Changing from array list to array: "+ list_2);
    }
}
