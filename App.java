package se.iths.Arabic2Roman;

/**
 * Hello world!
 *
 */
public class App{
	String romanStr;
    public String arabicConvertRoman1000( int a){
    	
   	 String romanStr = null;

   	 String[] romansTo10 = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
   	 String[] romansTo100 = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
   	 String[] romansTo1000 = {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
   	 
    	 if (a < 1)
            throw new NumberFormatException("Value of RomanNumeral must be positive.");
         if (a > 1000)
            throw new NumberFormatException("Value of RomanNumeral must be less than 1000.");
     
   	if(a < 10){
   		romanStr = romansTo10[a - 1];   
   	}
   	if(a < 100 && a >= 10){
   		if((Integer.toString(a).charAt(1) - 48) == 0){
   			romanStr = romansTo100[(Integer.toString(a).charAt(0) - 48) - 1]; 
   		}else{
   			romanStr = romansTo100[(Integer.toString(a).charAt(0) - 48) - 1] 
   					+ romansTo10[(Integer.toString(a).charAt(1) - 48) - 1];   
   		}
   	}
   	if(a >= 100 && a < 1000){
   		if((Integer.toString(a).charAt(1) - 48) == 0){
   			if((Integer.toString(a).charAt(2) - 48) == 0){
   				romanStr = romansTo1000[(Integer.toString(a).charAt(0) - 48) - 1] ;
   			}else{
   				romanStr = romansTo1000[(Integer.toString(a).charAt(0) - 48) - 1]
   						+ romansTo100[(Integer.toString(a).charAt(2) - 48) - 1]; 
   			}
   		}else{
   	   		romanStr = romansTo1000[(Integer.toString(a).charAt(0) - 48) - 1] 
    				   + romansTo100[(Integer.toString(a).charAt(1) - 48) - 1] 
    				   + romansTo10[(Integer.toString(a).charAt(2) - 48) - 1];      			
   		}
   			
   			
   			

   	}
   	return romanStr; 
   }
   
}
