import javax.swing.*;
import java.util.*;
class digitCount{
    public static void main(String args[]){
        String s=JOptionPane.showInputDialog("Enter your number: ");
        int len=s.length();
        int x=Integer.parseInt(s);
        int temp=x;
        int[] arr=new int[len];
        int rem;

        // System.out.print(Arrays.toString(arr+"\n"));


//Store digits of an Integer in an Array
        while(temp!=0){
            for(int i=0; i<len; i++){
                rem=temp%10;
                temp/=10;
                arr[i]=rem;
            }
        }
        
// For Count Occurance of digits in an Array:
        for(int i=0; i<len; i++){
            int count=1;
            for(int j=1; j<len; j++){
                if ( arr[i]!=10){
                    if(arr[i]==arr[j]){
                        count++;
                        arr[j]=10;
                    }
                    
                }
            }
            if(count>0){
                System.out.println(arr[i]+" present "+count+" times.");
            }
        }


        // Arrays.sort(arr);
        // System.out.print(Arrays.toString(arr));

// Print Reversed Integer Array:
//         for(int i=0; i<len; i++){
//                 System.out.print(arr[i]);
//             }

    }
}