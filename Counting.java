import java.util.Scanner;

public class Counting {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int size;
	int ecount=0;
	int ocount=0;
	int pcount=0;
	int palcount=0;
	
	System.out.println("Enter the size of the array :");
	int n=s.nextInt();
	
	int[] arr=new int[n];
	System.out.println("enter the elements of the array :");
	for (int i = 0; i < n; i++) {
		arr[i]=s.nextInt();
	}
	
	for (int i = 0; i < n; i++) {
		if (arr[i]%2==0) {
			ecount++;
		}else {
			ocount++;
		}
	
	
	boolean isprime=true;
	if (arr[i]==1||arr[i]==0) {
		isprime=false;
	}else {
		for (int j = 2; j <= arr[i]/2; j++) {
			if (arr[i]%j==0) {
				isprime=false;
				break;
			}
		}
	}
	if (isprime) {
		pcount++;
	}
	
	int num=arr[i];
	int rnum=0;
	int rem;
	if (num>9) {
		while(num!=0) {
			rem=num%10;
			rnum=rnum*10+rem;
			num/=10;
			
		}
		if (arr[i]==rnum) {
			palcount++;
		}
	}
	}
	
	System.out.println("Number of Even count or elements  : "+ecount);
	System.out.println("Number of Odd count or elements  :"+ocount);
	System.out.println("Number of prime Elements  :"+pcount);
	System.out.println("Number of Palindrome elements  :"+palcount);
}
}