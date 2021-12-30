import java.util.Scanner;
public class ProperFormat
{
	public static void main(String[] args)
	{
		String input="";
		System.out.println("Enter name: ");
		Scanner sc=new Scanner(System.in);
		input=sc.nextLine();
		String ans="";
		String[] arr=input.split(" ");
		for(int i = 0; i < arr.length; i++) {
			ans = ans + arr[i].toUpperCase().charAt(0) + arr[i].substring(1) + " ";
		}
		System.out.println(ans);

	}	
}