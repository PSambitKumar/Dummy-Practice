import java.util.*;
import java.lang.*;
class Armstrong{
    public static void main(String args[]){
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int num9=sc.nextInt();
        int sum5=0, rem5;
        int temp5=num9;
        int temp6=num9;

        int count5=0;
        while(temp6!=0){
            temp6=temp6/10;
            ++count5;
        }

        while(temp5!=0){
            rem5=temp5%10;
            sum5=sum5+Integer.parseInt(Math.pow(rem5 , count5));
            temp5=temp5/10;
        }

        if(num9==sum5){
            System.out.println("Is an Armstrong Number");
        }

        else{
            System.out.println("Is not an Armstrong Number");
        }
    }
}