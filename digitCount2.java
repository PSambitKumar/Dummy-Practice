import java.util.*;
class digitCount2{
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter the number"); 
        int n = scanner.nextInt(); 
        //int len=String.valueOf(n).length();

        //System.out.println("length of the number is: "+len+".");
        int[] arr = new int[10]; 
        int rem = 0; 
        while (n > 0) { 
            rem = n % 10;
            //System.out.println(arr[rem] + " " + rem);
            arr[rem]++; 
            n = n / 10; 
        } 
            
        for (int i=0; i<arr.length; i++) { 
            int count = arr[i]; 
            if (count != 0) { 
                System.out.println(i + " is present " + count + " times."); 
            } 
        } 
    }
}