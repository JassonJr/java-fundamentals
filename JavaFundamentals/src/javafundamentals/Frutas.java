package javafundamentals;

public class Frutas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "I eat apples";
		String s2 = "Bananas are my favorite fruit";
		
		System.out.println(s1.substring(6) + " " + s2.substring(8,s2.length() - 3));
		
		System.out.println(s1.indexOf("apples"));
		
		System.out.println(s2.charAt(4));
		
		String s="abcde";
		
		for (int i=0;i<5;i++) {
			s+="a";
			System.out.println(s);
		}
	}

}
