import java.util.Scanner;

public class client {

	String name,surname;
	
	Scanner scan = new Scanner(System.in);
	int pay,ans;
	
	void entering()
	{
	System.out.println("������� ���");
	name = scan.nextLine();
	System.out.println("������� �������");
	surname = scan.nextLine();
	System.out.println("������� �/� ");
	pay = scan.nextInt();
	
	
}
	void check()
	{
		System.out.println("�� ��������� ����� ������? (1 - yes or 0 - no)");
		ans = scan.nextInt();
		if (ans==0) {this.entering();}	
	}
	
	void printInBD()
	{
		System.out.println("-----------------------------");
		System.out.println("�� ��������� � ���� ������ ��������� ����������:");
		System.out.println("name: " + name);
		System.out.println("surname: " + surname);
		System.out.println("��: " + pay);
		
		
	}

	
}