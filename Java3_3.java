
public class Java3_3 
{
	public static void main(String[] args)
	 {
		String s = "Sai Pani Theja Avadhanam 04111992 F00445316 ";
		for(int i=0; i<= s.length()-1; i++)
		{
			char digit = s.charAt(i);
			if((digit == '0')||(digit == '1')||(digit == '2')||(digit == '3')||(digit == '4')||
					(digit == '5')||(digit == '6')||(digit == '7')||(digit == '8')||(digit == '9'))
				System.out.println(s.charAt(i));
		}
		
		}

}
