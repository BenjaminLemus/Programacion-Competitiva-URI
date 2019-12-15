package mate;

import java.util.*;

public class base_conversion_uno {
	public static void main(String[] args) {
	Scanner leer=new Scanner(System.in);
	
	int n=leer.nextInt();
	leer.nextLine();
	String p,a,b;
	int i,cn=1;
	int k,h;
	for(i=0;i<n;i++)
	{	
		a=leer.next();
		p=leer.next();
		if(p.equals("bin")) 
		{
			System.out.println("Case "+cn+":");
			k=Integer.parseInt(a, 2);
			System.out.println(k+" dec");
			a=Integer.toHexString(k);
			System.out.println(a+" hex");
			System.out.println();
			cn++;
			
		}
		else if(p.equals("dec"))
		{
			System.out.println("Case "+cn+":");
			k=Integer.parseInt(a);
			a=Integer.toHexString(k);
			b=Integer.toBinaryString(k);
			System.out.println(a+" hex");
			System.out.println(b+" bin");
			System.out.println();
			cn++;
		}
		else if(p.equals("hex"))
		{
			System.out.println("Case "+cn+":");
			k=Integer.parseInt(a, 16);
			System.out.println(k+" dec");
			a=Integer.toBinaryString(k);
			System.out.println(a+" bin");
			System.out.println();
			cn++;
			
		}
		
	}
	
}}
