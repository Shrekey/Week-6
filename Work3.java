import java.util.Scanner;

public class Work3 {
	static Scanner s = new Scanner(System.in);

	public void setDetails(Employee[] emps, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println();
			Employee emp = new Employee();
			System.out.println("Enter id :");
			emp.setEmpId(s.nextInt());
			System.out.print("Enter name : ");
			emp.setEmpName(s.next());
			System.out.print("Enter dept name :");
			emp.setDeptName(s.next());
			System.out.print("Enter Project name : ");
			emp.setProjectName(s.next());
			System.out.print("Enter Salary : ");
			emp.setSalary(s.nextInt());

			emps[i] = emp;
		}
	}

	public void GetEmpDept(Employee[] emps, String str, int n) {
		System.out.println();
		for (int i = 0; i < n; i++) {
			if (str.equals(emps[i].getDeptName())) {
				System.out.println(" Employee Name : " + emps[i].getEmpName());
				System.out.println("Employee ID : " + emps[i].getEmpId());
				System.out.println("Employee Dept name :" + emps[i].getDeptName());
				System.out.println("Employee Project name :" + emps[i].getProjectName());
				System.out.println("Employee Salary :" + emps[i].getSalary());
			}
		}
	}

	public void getDetails(Employee[] emps, int id1, int n) {

		for (int i = 0; i < n; i++) {
			if (id1 == emps[i].getEmpId()) {
				
				System.out.println(id1 + " Details");
				System.out.println(" Employee Name : " + emps[i].getEmpName());
				System.out.println("Employee ID : " + emps[i].getEmpId());
				System.out.println("Employee Dept name :" + emps[i].getDeptName());
				System.out.println("Employee Project name :" + emps[i].getProjectName());
				System.out.println("Employee Salary :" + emps[i].getSalary());
			}
		}
	}

	public void EmpRange(Employee[] emps) {
		for (int i = 0; i < emps.length; i++) {
			if (emps[i].getSalary() >= 20000 && emps[i].getSalary() <= 60000) {
				System.out.println(" Employee Name : " + emps[i].getEmpName());
				System.out.println("Employee ID : " + emps[i].getEmpId());
				System.out.println("Employee Dept name :" + emps[i].getDeptName());
				System.out.println("Employee Project name :" + emps[i].getProjectName());
				System.out.println("Employee Salary :" + emps[i].getSalary());
			}
		}
	}

	public void update(Employee[] emps, String str2, int n) {
		
		for (int j = 0; j < emps.length; j++) {
			Employee emp1=new Employee();
		
			if (str2.equals(emps[j].getEmpName())) {
				System.out.println();
				System.out.println("Employee " + (j + 1) + " Details");
				System.out.println("Enter new  id :");
				emp1.setEmpId(s.nextInt());
				System.out.print("Enter new  name : ");
				emp1.setEmpName(s.next());
				System.out.print("Enter new dept name :");
				emp1.setDeptName(s.next());
				System.out.print("Enter new Project name : ");
				emp1.setProjectName(s.next());
				System.out.print("Enter new Salary : ");
				emp1.setSalary(s.nextInt());

				emps[j] = emp1;
				
				break;
			}
		}
	}

	public void DeleteId(Employee[] emps, int id2) {
		
		int u = id2;
		for (int i = 0; i < emps.length; i++) {
			if (u == emps[i].getEmpId()) {
				for (int j = i; j < emps.length - 1; j++) {
					emps[j] = emps[j + 1];
				}
				break;
			}
		}
		for (int i = 0; i < emps.length-1; i++) {
			System.out.println(" Employee Name : " + emps[i].getEmpName());
			System.out.println("Employee ID : " + emps[i].getEmpId());
			System.out.println("Employee Dept name :" + emps[i].getDeptName());
			System.out.println("Employee Project name :" + emps[i].getProjectName());
			System.out.println("Employee Salary :" + emps[i].getSalary());

		}
	}

	public void viewoptions(Employee[] emps, int n) {
		int option = 0;
		do {
			System.out.println();
			System.out.println("1. Get Specific Employee Details");
			System.out.println("2. Get Specific Employee Details with Dept name ");
			System.out.println("3. Update employee details ");
			System.out.println("4. Delete Specific details  ");
			System.out.println("5. Range of the salary :");
			System.out.println("6. Exit");
			System.out.print("Please Select an Option : ");
			option = s.nextInt();
			switch (option) {
			case 1:
				System.out.print("Enter  Employee id whose details you want to see : ");
				int id1 = s.nextInt();
				getDetails(emps, id1, n);
				break;
			case 2:
				System.out.print("Enter Dept name :");
				String str = s.next();
				GetEmpDept(emps, str, n);
				break;
			case 3:
				System.out.print("Enter the name of employee :");
				String str2 = s.next();
				update(emps, str2, n);
				break;
			case 4:
				System.out.println(" Enter id you want to delete :");
				int id2 = s.nextInt();
				DeleteId(emps, id2);
				break;

			case 5:
				System.out.println("Range of the salary");
				EmpRange(emps);
				break;

			case 6:
				System.out.println("********************************");
				System.exit(0);
				break;

			default:
				System.out.println("Invalid Option");
				break;
			}
		} while (option != 6);
	}

	public static void main(String[] args) {

		System.out.println("Enter number Employee details you want to enter : ");
		int n = s.nextInt();
		Employee[] emps = new Employee[n];
		Work3 obj = new Work3();
		obj.setDetails(emps, n);
		obj.viewoptions(emps, n);
	}
}