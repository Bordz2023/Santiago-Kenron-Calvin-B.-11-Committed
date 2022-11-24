package Enum;

public enum USCurrency {

	PENNY(0.01f, "Penny"),
	NICKLE(0.05f, "Nickle"),
	DIME(0.1f, "Dime"),
	QUARTER(0.25f, "Quarter");
	
	float value;
	String name;
	
	USCurrency(float value){
		this.value = value;
	}
	
	USCurrency(Float value, String name){
		this.value = value;
		this.name = name;
	}

}
