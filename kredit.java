
public class kredit implements product{

	private float stavka=0.15f, money, pay, dolg;// money - ������ �������. pay - ��
	private int years;
	
	kredit(int i,int j)
	{
		money = i; // ������ �������
		pay = j;  // ��������
	}
	
	@Override
	public int schet() {
		
		dolg = money*1.02f;
		for(int a=0; a<8;a++)
		{
			dolg -=pay*12; 
			if (dolg<0) {years=a; break;}
			else years=-1;
		}
		// TODO Auto-generated method stub
		return years;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		if(years!=-1){
		System.out.println("-----------------------------");
		System.out.println("�� ������ ������ � ������� " + money);
		System.out.println("�� " + years +" ���");
		System.out.println("�� ������ " + stavka);
		System.out.println("C���������)");
		}
		else System.out.println("�� �� ��������!");
		
		}

	
}
