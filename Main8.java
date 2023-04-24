import java.util.*;
class account{
  public String getAnum() {
		return anum;
	}
	public void setAnum(String anum) {
		this.anum = anum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
private String anum,name;
  private double balance;
}
public class Main8{
  Scanner sc=new Scanner(System.in);
  int n=1;
  String name,anum;
  double balance;
  account arr[];
  public void set(){
    arr= new account[n];
    for(int i=0;i<n;i++){
      account acc=new account();
     // System.out.println("Enter account number :");
      acc.setAnum("0");
    // System.out.println("Enter Name :");
      acc.setName("0");
     // System.out.println("Diposite money");
      acc.setBalance(0);
      arr[i]=acc;
    }
  
  }
  public void add(){
    account acc=new account();
      System.out.println("Enter account number :");
      acc.setAnum(sc.next());
     System.out.println("Enter Name :");
      acc.setName(sc.next());
      System.out.println("Diposite money");
      acc.setBalance(sc.nextDouble());
      arr=Arrays.copyOf(arr, arr.length+1);
      arr[arr.length-1]=acc;
      n++;
    System.out.println("Account Successfully Added");
    options();
  }
  public void dep(){
    System.out.println("Enter account number :");
    String a=sc.next();
    for(int i=0;i<n;i++){
      account acc=arr[i];
      if(a.equals(arr[i].getAnum())){
        System.out.println("Enter amount to deposit");
        Double m=sc.nextDouble();
        acc.setBalance(arr[i].getBalance()+(m));
         System.out.println(arr[i].getBalance());
        break;
      }
    }
    System.out.println("Amount Successfully Deposited");
    options();
  }
  public void wit(){
    System.out.println("Enter account number :");
    String a=sc.next();
    for(int i=0;i<n;i++){
      account acc=arr[i];
      if(a.equals(arr[i].getAnum())){
        System.out.println("Enter amount to deposit");
        Double m=sc.nextDouble();
        acc.setBalance(arr[i].getBalance()-(m));
         System.out.println(arr[i].getBalance());
        break;
      }
    }
    System.out.println("Amount Successfully Withdraw");
    options();
  }
  public void bal(){
    System.out.println("Enter account number");
    String a=sc.next();
    for(int i=0;i<n;i++){
      if(a.equals(arr[i].getAnum())){
      System.out.println("Balance : "+arr[i].getBalance());
        break;
      }
    }
    options();
  }
  public void view(){
    System.out.println("Enter account number");
    String a=sc.next();
    for(int i=0;i<n;i++){
      if(a.equals(arr[i].getAnum())){
      System.out.println("Account Number :"+arr[i].getAnum());
      System.out.println("Name : "+arr[i].getName());
      System.out.println("Balance : "+arr[i].getBalance());
        break;
      }
    }
    options();
  }
  public void options(){
    System.out.println("Select option");
    System.out.println("1 . Creat new account");
    System.out.println("2 . Deposite money");
    System.out.println("3 . Withdraw money");
    System.out.println("4 . Check Balance");
    System.out.println("5 . View Account details");
    System.out.println("6 . Exit");
    int o=sc.nextInt();
    
    switch(o){
      case 1 :
        add();
        break;
      case 2 :
        dep();
        break;
      case 3 :
        wit();
        break ;
      case 4 :
        bal();
        break ;
      case 5 :
        view();
        break;
      case 6 :
        break;
      default:
        System.out.println("Invalid option");
        
    }
  }
  public static void main(String [] args){
    Main8 obj=new Main8();
    obj.set();
    obj.options();
  }
  
}
