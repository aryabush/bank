import java.util.Scanner;

public class main {
	// � ���� ����� - ���������� ����
    // 1. ������� SRP - � ������ �� ��������: ������, ������ 
	// 2. ������� ISP - � ������ �������, � ������ �� ����������� ������ ������(print, check, entering)
    // 3. DIP - � ������ ��������� ��������, �� �������� ����������� � �����, � ������.  
	//  ����� - ��� ������ ��������
    // � ������ ������� � ������� ��� ���������� ��� private, ������ ��� ����� ����� ������, ��� ����� �� �����
	
	public static void main(String[] args) {
	client MyClient = new client();
	Scanner scan = new Scanner(System.in);
	String vvod;
	
	MyClient.entering();
	while(true)
	{
		if(MyClient.ans==1) break; else MyClient.check();
	}
	MyClient.printInBD();
	System.out.println("�������: kredit or vklad");
	vvod = scan.nextLine();
		
	kredit MyKredit = new kredit(2000000,MyClient.pay);
	
	if (vvod.equals("kredit")){
	
	MyKredit.schet();
	MyKredit.print();
	}
	
	if(vvod=="vklad")
	{
		int i,j;
		System.out.println("�������: ������ ������ � ���-�� ���");
		i=scan.nextInt();  //������
		j=scan.nextInt();  //���
		Vklad MyVklad = new Vklad(i,j); 
	}

	}
	
}
