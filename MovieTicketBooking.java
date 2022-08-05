package phase1_practice_projects;
import java.util.*;

public class MovieTicketBooking {
	static int count=0; 
	static int times=1;
	static int timecount=0;
	static int daycount=0;
	//creating the rows A to E (Five rows)
	static LinkedList<Integer> A=new LinkedList<Integer>();
	static LinkedList<Integer> B=new LinkedList<Integer>();
	static LinkedList<Integer> C=new LinkedList<Integer>();
	static LinkedList<Integer> D=new LinkedList<Integer>();
	static LinkedList<Integer> E=new LinkedList<Integer>();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**********************************************\n");
		System.out.println("\tHello, welcome to the Front Desk\n");
		System.out.println("**********************************************\n");
		
		
		// checking the user is an admin or the customer
				System.out.println("Are you the customer or an Admin of the Front Desk ");
				System.out.println("If you are Admin then type Y otherwise type N:");
				//Taking character input from the user
				Scanner sc=new Scanner(System.in);
				char i=sc.next().charAt(0);
				if(i=='y' || i=='Y')
				{
					System.out.println("Do you want to change the password if yes then type Y otherwise type N");
					char c= sc.next().charAt(0);
					if(c=='y' || c=='Y'){
						System.out.println("Please enter new password:");
						String pass=sc.next();
						System.out.println("The password has been changed successfully..");
					}
					if(c=='n' || c=='N')
						System.out.println("Exited..");
				}
				for(int c=0;c<10;c++)
				{
					A.add(0);
					B.add(0);
					C.add(0);
					D.add(0);
					E.add(0);
				}
				bookingProcess();
			
	}
	
	private static void bookingProcess(){
				String[] opt={"1. Select the date",
                "2. select the show time",
                "3. select the row and seat number",
                "4. Exit  "}; 
			//displaying all the available options 
			for(int j=0;j<4;j++)
				System.out.println(opt[j]);
			 Scanner in =new Scanner(System.in);
			 System.out.println("\nEnter your choice:\t");
		     int option=in.nextInt();
		     switch (option){
		     case 1:
		           System.out.println("Enter the date from the below list of options: \n");
		           System.out.println("1. 5-8-22\n2. 6-8-22\n3. 7-8-22");
		           String d=in.next();
		           System.out.println("The selected date is : "+d);
		           daycount++;
		           if(daycount>1){
		        	   for(int c=0;c<10;c++)
						{
		        		   A.set(c,0);
		        		   B.set(c,0);
		        		   C.set(c,0);
		        		   C.set(c,0);
		        		   C.set(c,0);
						}
		        	   count=1;
		           }
		           
		           bookingProcess();
		           break;
		     case 2:
		           System.out.println("Enter the show time from the below list of options: \n");
		           System.out.println("1. 9AM-12PM\n2. 1PM-4PM\n3. 5PM-8PM");
		           String t=in.next();		           
		           System.out.println("The selected show time is: "+t);
		           timecount++;
		           if(timecount>1){
		        	   for(int c=0;c<10;c++)
						{
		        		   A.set(c,0);
		        		   B.set(c,0);
		        		   C.set(c,0);
		        		   C.set(c,0);
		        		   C.set(c,0);
						}
		        	   count=1;
		           }
		           
		           
		           bookingProcess();
		           break;
		     case 3:
		    	   
		           System.out.println("choose the rows from A to E");
		           char r=in.next().charAt(0);
		           System.out.println("The selected row is: "+ r);
		    	   System.out.println("choose the seat number from 1 to 10");
		    	   int s=in.nextInt();
		    	   System.out.println("The selected seat number is: "+s);
		    	   rowFilling(r,s);
		    	   if(times==1){
		    		   System.out.println("Closing your booking process... \nThank you!");
		    	   }
		    	   break;
		     case 4:
		    	   System.out.println("Closing your booking process... \nThank you!");
		    	   break;
		     default:
		           System.out.println("You have made an invalid choice!");
		           break;
		     }
		    
	 }
		     
		           
	 
	 private static void rowFilling(char row,int seat){
		 
		 char t1;
		 int c=0;
		 do{
			 
			 c++;
			 if(c>1){
			 bookingProcess();
			 times++;
			 break;
			 }
		 if(row=='A'){
			 if(A.get(seat-1)==0){
			 System.out.println("Available..");
			 A.set(seat-1, 1);
			 System.out.println("Seats information of row A: "+A);
			 count++;
			 System.out.println("*****************************");
			 System.out.println("Total Payment: "+count*200);
			 System.out.println("Your seat is booked...");
			 System.out.println("*****************************");
			 
			 }
			 else
				 System.out.println("Already filled: Choose another seat in A row");
		 }
		 if(row=='B'){
			 if(B.get(seat-1)==0){
			 System.out.println("Available..");
			 B.set(seat-1, 1);
			 System.out.println("Seats information of row B: "+B);
			 count++;
			 System.out.println("*****************************");
			 System.out.println("Total Payment: "+count*200);
			 System.out.println("Your seat is booked...");
			 System.out.println("*****************************");
			 
			 }
			 else
				 System.out.println("Already filled: Choose another seat in B row");
		 }
		 if(row=='C'){
			 if(C.get(seat-1)==0){
			 System.out.println("Available..");
			 C.set(seat-1, 1);
			 System.out.println("Seats information of row C: "+C);
			 count++;
			 System.out.println("*****************************");
			 System.out.println("Total Payment: "+count*200);
			 System.out.println("Your seat is booked...");
			 System.out.println("*****************************");
			 
			 }
			 else
				 System.out.println("Already filled: Choose another seat in C row");
		 }
		 if(row=='D'){
			 if(D.get(seat-1)==0){
			 System.out.println("Available..");
			 D.set(seat-1, 1);
			 System.out.println("Seats information of row D: "+D);
			 count++;
			 System.out.println("*****************************");
			 System.out.println("Total Payment: "+count*200);
			 System.out.println("Your seat is booked...");
			 System.out.println("*****************************");
			 
			 }
			 else
				 System.out.println("Already filled: Choose another seat in D row");
		 }
		 if(row=='E'){
			 if(E.get(seat-1)==0){
			 System.out.println("Available..");
			 E.set(seat-1, 1);
			 System.out.println("Seats information of row E: "+E);
			 count++;
			 System.out.println("*****************************");
			 System.out.println("Total Payment: "+count*200);
			 System.out.println("Your seat is booked...");
			 System.out.println("*****************************");
			 
			 }
			 else
				 System.out.println("Already filled: Choose another seat in E row");
		 }
		 System.out.println("If you want to book another seat then type Y else N");
		 Scanner t=new Scanner(System.in);
		 t1=t.next().charAt(0);
	
		 }while(t1=='Y' || t1=='y');
		 
		 
	 }
	   

}
