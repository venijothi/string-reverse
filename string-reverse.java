public class Strings {

	public static void main(String[] args) {
		String s="hello";  
		char ch[]=s.toCharArray();  
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
}
}

OUTPUT:
Olleh
