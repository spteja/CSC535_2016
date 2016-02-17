
public class Java3_1 {
	public static void main(String[] args)
{
	String s = "Sai Pani Theja Avadhanam";
	for(int i=0; i<= s.length()-1; i++)
	{
		char vowel = s.charAt(i);
		if((vowel == 'a')||(vowel == 'e')||(vowel == 'i')||(vowel == 'o')||(vowel == 'u')||
				(vowel == 'A')||(vowel == 'E')||(vowel == 'I')||(vowel == 'O')||(vowel == 'U'))
			System.out.println(s.charAt(i));
	}
	
	}


}
