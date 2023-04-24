import java.util.Scanner;

public class App4 {

	static Scanner s = new Scanner(System.in);

	public void Seting(Student3[] stds, int n) {

		for (int i = 0; i < n; i++) {
			Student3 std = new Student3();

			do {
				System.out.println("Enter the Student id :");
				int q = s.nextInt();
				if (q >= 10000 && q <= 99999) {

					std.setSid(q);
					break;
				} else {
					System.out.println("Enter a valid valid ID");
				}
			} while (true);

			do {
				System.out.println("Enter the Student name:");
				String str = s.next();

				if (str.length() >= 2 && str.length() <= 30) { // Check length of the name
					std.setName(str);
					break;
				} else {
					System.out.println("Enter a valid name (minimum 2 characters and max 30).");
				}
			} while (true);

			do {
				System.out.println("Enter the Student rollno :");
				int r = s.nextInt();
				if (r >= 1) {
					std.setSroll(r);
					break;
				} else {
					System.out.println("rollNo should be a positive integer");
				}

			} while (true);

			System.out.println("Enter the Student mobile num :");
			do {

				String str2 = s.nextLine().trim();

				if (str2.matches("[6-9]\\d{9}")) {
					std.setMobile(str2);
					break;
				} else {
					System.out.println("Mobile should contains only 10 digits and should starts with 9 or 8 or 7 or 6");
				}
			} while (true);

			do {
				System.out.println("Enter the Marks :");

				int w = s.nextInt();

				if (w <= 99) {
					std.setMarks(w);
					break;
				} else {
					System.out.println("Marks should be a positive integer, and should a two digits number");
				}
			} while (true);

			do {
				System.out.println("Enter the Student Adress without space :");
				String str5 = s.next();

				if (str5.length() >= 5 && str5.length() <= 100) { // Check length of the college name
					std.setAdress(str5);
					break;
				} else {
					System.out.println("Address should be between 5 and 100 characters long");
				}
			} while (true);

			stds[i] = std;

		}

	}

	public void geting(Student3[] stds) {

		for (int i = 0; i < stds.length; i++) {

			System.out.println("Student ID :" + stds[i].getSid());
			System.out.println("Student Name :" + stds[i].getName());
			System.out.println("Student Rollnumber :" + stds[i].getSroll());
			System.out.println("Student Mobile :" + stds[i].getMobile());
			System.out.println("Student Marks :" + stds[i].getMarks());
			System.out.println("Student Adress :" + stds[i].getAdress());
		}
		System.out.println("***************************************************");
	}

	public static void main(String[] args) {

		App4 a = new App4();

		System.out.println("Enter how many student you want to add : ");
		int n = s.nextInt();
		Student3[] stds = new Student3[n];
		a.Seting(stds, n);
		a.geting(stds);

	}

}