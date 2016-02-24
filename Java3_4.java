
public class Java3_4 {
	public static void main(String[] args) {
        String s = "125+89";
        char ch = '_';
        int x = s.indexOf('+');
        int y = s.indexOf('-');
        int p = s.indexOf('*');
        int q = s.indexOf('/');

        if (x > 0) {
            String first = s.substring(0, x);
            int a = Integer.parseInt(first);
            String second = s.substring(x + 1);
            int b = Integer.parseInt(second);
            System.out.print(a+b);
        }
        if (y > 0) {
            String first = s.substring(0, x);
            int a = Integer.parseInt(first);
            String second = s.substring(x + 1);
            int b = Integer.parseInt(second);
            System.out.print(a-b);
        }
        if (p > 0) {
            String first = s.substring(0, x);
            int a = Integer.parseInt(first);
            String second = s.substring(x + 1);
            int b = Integer.parseInt(second);
            System.out.print(a*b);
        }
        if (q > 0) {
            String first = s.substring(0, x);
            int a = Integer.parseInt(first);
            String second = s.substring(x + 1);
            int b = Integer.parseInt(second);
            System.out.print(a/b);
        }

    }


}
        

