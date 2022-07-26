package phase1_practice_projects;
import java.util.Scanner;
public class AirthmeticCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reading input from the user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two values: ");
		int v1=sc.nextInt();
		int v2=sc.nextInt();
		System.out.println("1 will perform addition operation"+'\n'+"2 will perform subtraction operation"+'\n'+"3 will perform multiplication operation"+'\n'+"4 will perform divison operation"+'\n'+"To Exit press any number otherthan 1,2,3,4");
		
		while(true){
			
			System.out.println("Enter your choice:");

			int choice=sc.nextInt();
			
			if(choice==1 || choice==2||choice==3||choice==4){
			switch(choice){
			case 1:
				//Addition operation
				System.out.println("The addition of the entered two numbers is: "+(v1+v2));
				break;
			case 2:
				//Subtraction operation
				System.out.println("The subtraction of the entered two numbers is: "+(v1-v2));
				break;
			case 3:
				//Multiplication operation
				System.out.println("The multiplication of the entered two numbers is: "+(v1*v2));
				break;
			case 4:
				//Division operation
				System.out.println("The division of the entered two numbers is: "+ (v1/v2));
				break;
			}
			
			}
			else
				break;
			
			
	}
	}
}
