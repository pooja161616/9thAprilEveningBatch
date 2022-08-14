package Methods;

public class NonstaticwithPara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonstaticwithPara NP=new NonstaticwithPara();//created object for same class
		NP.studentmarks();//calling non static method without parameter
		NP.studentmarks(80, 90, 98);//With parameter
		Parameteranotherclass Pa=new Parameteranotherclass();//Created object for another class
		Pa.Result(92, 94);
		
		

	}
	
	public void studentmarks()//Non static method without parameter
	{
		int English=98;
		int Hindi=80;
		int Marathi=92;
		System.out.println("Result of English is "+English);
		System.out.println("Result of Hindi is "+Hindi);
		System.out.println("Result of Marathi is "+Marathi);
		
	}
    public void studentmarks(int English,int Hindi,int Marathi)//Non static method with Parameter
    
    {
    	System.out.println("==============================");
    	System.out.println("Result of english is "+English);
    	System.out.println("Result of Hindi is "+Hindi);
    	System.out.println("Result of Marathi is "+Marathi);
    	
    }
    
    
}

