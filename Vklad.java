
public class Vklad implements product {

	float money, stavka=0.05f;
	int years;
	Vklad(int i,int j)
	{ 
		money = i; //размер вклада
		years=j; // сколько лет держим вклад
	}
	
	@Override
	public int schet() {
		if (years>5) years=5;
		for(int a=0;a<years;a++)
		{
           money*=(1+stavka);
		}
		
		// TODO Auto-generated method stub
		return (int)money;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		//дописать здесь!!
	}
	
	
	

}
