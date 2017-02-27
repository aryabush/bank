import java.util.Scanner;

public class main {
	// у мен€ домен - банковское дело
    // 1. принцип SRP - € разбил на сущности: кредит, клиент 
	// 2. принцип ISP - в классе клиента, € разбил на максимально мелкие методы(print, check, entering)
    // 3. DIP - € создал интерфейс продукта, от которого наследуетс€ и вклад, и кредит.  
	//  ¬клад - это второй сценарий
    // ¬ классе кредита € объ€вил все переменные как private, потому что кроме этого класса, они нигде не нужны
	
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
	System.out.println("¬ведите: kredit or vklad");
	vvod = scan.nextLine();
		
	kredit MyKredit = new kredit(2000000,MyClient.pay);
	
	if (vvod.equals("kredit")){
	
	MyKredit.schet();
	MyKredit.print();
	}
	
	if(vvod=="vklad")
	{
		int i,j;
		System.out.println("¬ведите: размер вклада и кол-во лет");
		i=scan.nextInt();  //размер
		j=scan.nextInt();  //лет
		Vklad MyVklad = new Vklad(i,j); 
	}

	}
	
}
