import java.util.regex.*;

class PinValidation{

    /** Validates pins. Pins must be 4 symbols or 6 symbols long, with a dash may or may not occurring in between!
     PINS CANNOT BE 5 SYMBOLS LONG. Pins must contain only digits 0-9
     Returns:
     
Pin is valid and it is 6 digits!123-455
Pin is valid and it is 4 digits!12-34
Pin is valid and it is 6 digits!123455
Pin is valid and it is 4 digits!1234
False pin! and the pin is:12345
False pin! and the pin is:1234sssa
False pin! and the pin is:dddddd
False pin! and the pin is:dd-dd
False pin! and the pin is:ddd-ddd
     
     
     **/

    public boolean validatePin(String pin){
        Pattern p= Pattern.compile("[0-9]{2}-{0,1}[0-9]{2}");
        Pattern p2= Pattern.compile("[0-9]{3}-{0,1}[0-9]{3}");

        Matcher m= p.matcher(pin);
        Matcher m2=p2.matcher(pin);

        if(m.matches()){
            System.out.println("Pin is valid and it is 4 digits!"+pin);
            return true;
        }
        if(m2.matches()){
            System.out.println("Pin is valid and it is 6 digits!"+pin);
            return true;
        }
	System.out.println("False pin! and the pin is:"+pin);
        return false;
    }


    public static void main(String[]args){

        PinValidation pp= new PinValidation();

//Valid pins:
        pp.validatePin("123-455");
	pp.validatePin("12-34");
    	pp.validatePin("123455");
	pp.validatePin("1234");
//Invalid pins:
    	pp.validatePin("12345");
	pp.validatePin("1234sssa");
	pp.validatePin("dddddd");
	pp.validatePin("dd-dd");
	pp.validatePin("ddd-ddd");
 

    }



}
