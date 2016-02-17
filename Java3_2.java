
public class Java3_2 {
	public static void main(String[] args)
	 {
		String s = "Sai Pani Theja Avadhanam F00445316";
		for(int i=0; i<= s.length()-1; i++)
		{
			char consonant= s.charAt(i);
			if(!((consonant== 'a')||(consonant== 'e')||(consonant== 'i')||(consonant== 'o')||(consonant== 'u')||
					(consonant== 'A')||(consonant== 'E')||(consonant== 'I')||(consonant== 'O')||(consonant== 'U')||(consonant== ' ')||(consonant== '0')||(consonant== '1')||(consonant== '2')||(consonant== '3')||(consonant== '4')||
					(consonant== '5')||(consonant== '6')||(consonant== '7')||(consonant== '8')||(consonant== '9')))
				System.out.println(s.charAt(i));
		}
		
		}


}
