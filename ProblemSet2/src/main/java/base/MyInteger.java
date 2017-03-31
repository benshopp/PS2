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
	
	public static boolean isEven(int i){
		return (i % 2 == 0)	? true : false;
	}
	
	public boolean isEven(){
		return isEven(getiValue());
		}
	
	public static boolean isOdd(int i){
		return (i % 2 != 0) ? true : false;
		}
	
	public boolean isOdd(){
		return isOdd(getiValue());
	}
	public static boolean isPrime(int i){
		    for(int i2 = 2; i2 < i; i2++) 
		    {
		        if(i%i2==0){
		            return false;
		        }
		    }
		    return true;
		}
	public boolean equals(int i){
			
		return i == this.getiValue();

	}
	public boolean isPrime(){
		return isPrime(getiValue());
	}
	}
