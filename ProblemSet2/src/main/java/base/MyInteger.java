package base;

public class MyInteger {
	private int iValue;

	public MyInteger(int iValue) {
		super();
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}

	public void setiValue(int iValue) {
		this.iValue = iValue;
	}
	public static void isEven(int iValue){
		if (iValue % 2 == 0){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
	}
	public static void isOdd(int iValue){
		if (iValue % 2 != 0){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
	}
	public static void isPrime(int iValue){
		    for(int i=2;i<iValue;i++) 
		    {
		        if(iValue%i==0)
		            System.out.println("false");;
		    }
		    System.out.println("true");;
		}
	public void equals(int MyInteger){
			
		if (iValue == MyInteger){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}

	}
	}
