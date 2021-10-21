//Revese the string
package basicProgram;

public class Revestr {
	public static void main(String[] args) {
		String str="Divyanshu",nstr="";
		char ch;
		System.out.println("Divyanshu");
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			nstr=ch+nstr;
		}
		System.out.println(nstr);
	}
}
