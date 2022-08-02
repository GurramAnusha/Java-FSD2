package phase1_practice_projects;
import java.util.*;

public class LongestIncreasingSubsequence {
	int max_value=0;
	int ind=0;
	public void lis(int a[],int l[],int n){
		
		//basic conditions
		if(n<=1){
			System.out.println("The length of the longest increasing subsequence is: "+n);
			System.out.println("The longest increasing subsequence is: "+a[n-1]);
		}

		else{
		for(int i=1;i<n;i++){
			for(int j=0;j<i;j++){
				if((a[i]>a[j]) && (l[i]<=l[j]))
					l[i]=l[j]+1;
			}
		}
		
		//Finding the length of the lis by identifying maximum value in th l[] array
		max_value=l[0];
		
		for(int i=1;i<n;i++){
			if(max_value<l[i]){
				max_value=l[i];
				ind=i;
			}
		}
		System.out.println("The length of the longest Increasing subsequence is: "+max_value);
		
		//Finding the lis 
		System.out.println("The longest Increasing subsequence is:");
		int temp[]=new int[max_value];
		temp[max_value-1]=a[ind];
		int t1=max_value-2;
		for(int i=ind-1;i>=0;i--)
		{
			
			if((l[ind]-l[i])==1){
				temp[t1]=a[i];
				ind=i;
				t1--;
			
			}
		
		}
		
		//printing the lis
		for(int k=0;k<max_value;k++)
			System.out.print(temp[k]+" ");
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of random numbers u want to enter:");
		int n=sc.nextInt();
		System.out.println("Enter the random numbers:");
		int arr[]=new int[n];
		int lis[]=new int[n];
		if(n<100){
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
				lis[i]=1;
			}	
		}
				
		else
			System.out.println("Enter the length of list of random numbers lessthan 100");
		LongestIncreasingSubsequence l=new LongestIncreasingSubsequence();
		l.lis(arr,lis,n);
		
	}

}
