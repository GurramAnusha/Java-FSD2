package phase1_practice_projects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*System.out.println("Hello World!");*/
        System.out.println("\n**************************************\n");
        System.out.println("\tWelcome to TheDesk \n");
        System.out.println("**************************************");
        
        //change-1:ArrayList creation code is need to be moved to the main method and also removed the ArrayList with name arrlist as it has no use in the program
        
        ArrayList<Integer> expenses = new ArrayList<Integer>();
        expenses.add(1000);
        expenses.add(2300);
        expenses.add(45000);
        expenses.add(32000);
        expenses.add(110);
        
        //change-2: Passing the arraylist named expenses to the optionsSelection method
        optionsSelection(expenses);

    }
    
    private static void optionsSelection(ArrayList<Integer> expenses) {
        String[] arr = {"1. I wish to review my expenditure",
                "2. I wish to add my expenditure",
                "3. I wish to delete my expenditure",
                "4. I wish to sort the expenditures",
                "5. I wish to search for a particular expenditure",
                "6. Close the application"
        };
        int[] arr1 = {1,2,3,4,5,6};
        int  slen = arr1.length;
        for(int i=0; i<slen;i++){
            System.out.println(arr[i]);
            // display the all the Strings mentioned in the String array
        }
        System.out.println("\nEnter your choice:\t");
        Scanner sc = new Scanner(System.in);
        int  options =  sc.nextInt();
        for(int j=1;j<=slen;j++){
            if(options==j){
                switch (options){
                    case 1:
                        System.out.println("Your saved expenses are listed below: \n");
                        System.out.println(expenses+"\n");
                        optionsSelection(expenses);
                        break;
                    case 2:
                        System.out.println("Enter the value to add your Expense: \n");
                        int value = sc.nextInt();
                        expenses.add(value);
                        System.out.println("Your value is updated\n");
                        System.out.println(expenses+"\n");
                        optionsSelection(expenses);

                        break;
                    case 3:
                        System.out.println("You are about the delete all your expenses! \nConfirm again by selecting the same option...\n");
                        int con_choice = sc.nextInt();
                        if(con_choice==options){
                               expenses.clear();
                            System.out.println(expenses+"\n");
                            System.out.println("All your expenses are erased!\n");
                        } else {
                            System.out.println("Oops... try again!");
                        }
                        optionsSelection(expenses);
                        break;
                    case 4:
                        sortExpenses(expenses);
                        optionsSelection(expenses);
                        break;
                    case 5:
                    	searchExpenses(expenses);
                        optionsSelection(expenses);
                        break;
                    case 6:
                        closeApp();
                        break;
                    default:
                        System.out.println("You have made an invalid choice!");
                        break;
                }
            }
        }

    }
    private static void closeApp() {
        System.out.println("Closing your application... \nThank you!");
            }
    
    
    private static void searchExpenses(ArrayList<Integer> arrayList) {
    	//change-3: commented the line-101 as it has not used in logic
    	//int leng = arrayList.size();
    	
        System.out.println("Enter the expense you need to search:\t");
        //Complete the method
        
        //Scanner class is used to take the input from the user to enter the expenditure he/she wants to search
        Scanner in=new Scanner(System.in);
        Integer e=in.nextInt();
        
        // default contains() method in ArrayList class is used to search for the object
        if(arrayList.contains(e))
        	System.out.println("\n"+e+ " is present in your saved expenditures \n");
        else
        	System.out.println("\n"+e+ " is not present in your saved expenditure \n");
        
    }
    
    
    private static void sortExpenses(ArrayList<Integer> arrayList) {
    	//change-4: commented the line-121 as it has not used in logic
        //int arrlength =  arrayList.size();
    	
       //Complete the method. The expenses should be sorted in ascending order.
    	
    	// default sort method from Collections is used to sort in ascending order
    	 Collections.sort(arrayList);
         System.out.println("All your expenditures after sorting in ascending order are: \n");
         System.out.println(arrayList+"\n");
        
    }
}

