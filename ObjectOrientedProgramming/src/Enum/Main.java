package Enum;

public class Main {

	public static void main(String[] args) {
		
		USCurrency coins[] = new USCurrency[3];
		
		coins[0] = USCurrency.DIME;
	    coins[1] = USCurrency.NICKLE;
	    coins[2] = USCurrency.QUARTER;
	    
	    float sum = 0;
	    
	    for(USCurrency coin: coins) {
	    	
	    	sum = sum + coin.value;
	    }
	   
	    System.out.println(sum);
	    
	}

}
