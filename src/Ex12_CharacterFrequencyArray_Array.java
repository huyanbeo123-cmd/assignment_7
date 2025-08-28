import java.util.*;
public class Ex12_CharacterFrequencyArray_Array {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String [] letter=  {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        System.out.println("Input your sentences: ");
        String sen=scanner.nextLine();
        int [] list=new int[26];
        String[] sen_2= new String[sen.length()];
        for(int i=0;i<sen.length();i++)
        {
            sen_2[i]=sen.substring(i,i+1);
        }
        for(int i=0; i<sen.length();i++){
            for(int j=0;j<26;j++){
                if(sen_2[i].equals(letter[j]))
                    list[j]++;
            }
        }
        for(int i=0; i<26; i++){
            if(list[i]>=1)
            System.out.println(letter[i] + ": " + list[i]);
        }


    }
}
