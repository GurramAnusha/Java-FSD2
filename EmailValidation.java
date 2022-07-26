package phase1_practice_projects;
import java.util.Scanner;
public class EmailValidation {
	int count;
	
	public void search(String str,String arr[]){
		for(int i=0;i<arr.length;i++){
			if(str.equals(arr[i]))
				count++;		
		}
		if(count==1)
			System.out.println("The email_id is present in the array");
		else
			System.out.println("The email_id is not present in the array");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]=new String[5];
		arr[0]="emp_1@gmail.com";
		arr[1]="emp_2@gmail.com";
		arr[2]="emp_3@gmail.com";
		arr[3]="emp_4@gmail.com";
		arr[4]="emp_5@gmail.com";
		//System.out.println("The employee ids present in the array are: ");
		//for(String s:arr)
		//	System.out.println(s);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the email-id you want to search in the available array: ");
		String s;
		s=sc.next();
		EmailValidation ev=new EmailValidation();
		ev.search(s,arr);
		

	}

}
