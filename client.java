import java.util.Scanner;

public class client {

	String name,surname;
	
	Scanner scan = new Scanner(System.in);
	int pay,ans;
	
	void entering()
	{
	System.out.println("Введите имя");
	name = scan.nextLine();
	System.out.println("Введите фамилию");
	surname = scan.nextLine();
	System.out.println("Введите з/п ");
	pay = scan.nextInt();
	
	
}
	void check()
	{
		System.out.println("Вы правильно ввели данные? (1 - yes or 0 - no)");
		ans = scan.nextInt();
		if (ans==0) {this.entering();}	
	}
	
	void printInBD()
	{
		System.out.println("-----------------------------");
		System.out.println("Мы сохранили в базу данных следующую информацию:");
		System.out.println("name: " + name);
		System.out.println("surname: " + surname);
		System.out.println("зп: " + pay);
		
		
	}

	
}