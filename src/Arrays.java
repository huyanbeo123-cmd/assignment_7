import java.util.*;
public class Arrays {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many days temperatures? ");
        int days=Integer.parseInt(scanner.nextLine());
        float average=0;
        int days_above_average=0;
        float[] temperatures = new float[ days ];
        float sum = 0;
        for(int i=0; i<temperatures.length;i++){
            System.out.print("Day "+ (i+1)+ "'s high temp: ");
            temperatures[i] = Float.parseFloat(scanner.nextLine());
            sum += temperatures[i];
        }
        average = sum/temperatures.length;
        for(int j=0; j<temperatures.length;j++)
        {
            if(average < temperatures[j])
            {
                days_above_average++;
            }
        }

        System.out.printf("Average temp = %.1f",average);
        System.out.println();
        if(days_above_average>=2)
            System.out.println(days_above_average + " days were above average.");
        else
            System.out.println(days_above_average + "day was above averaege.");

        //TOI DA O DAY
        //TOI DA KHONG O DAY
    }
}
