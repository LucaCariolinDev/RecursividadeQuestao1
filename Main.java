public class Main {

	public static void main(String args[]) {
		int result = Main.soma_recursiva(8);
		System.out.println(result);
    }
	
	public static int soma_recursiva(int n)
	{
		if (n == 0) 
			return 0;
		
		return n + soma_recursiva(n-1);
	}
}
