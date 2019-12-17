package ad_hoc;

import java.util.*;
public class Acarrear_o_no_Acarrear {

	public static void main(String[] args) {

	Scanner leer=new Scanner(System.in);
	while(leer.hasNext())
	{
		long n,m,d;
		long g,h,p;
		int i,f;
		long[] vec=new long[33];
		long[] v=new long[33];
		
		n=leer.nextLong();
		g=leer.nextLong();
		
		m=n;
		f=0;
		
		h=g;
		while(m!=0 || h!=0)
		{
		p=h%2;
		d=m%2;
		vec[f]=d;
		v[f]=p;
		
		h=h/2;
		m=m/2;
		f++;
		}

		int[] vt=new int[f];
		for (i=0;i<f;i++)
		{
			if(v[i]==vec[i])
			{
				vt[i]=0;
			}else
			{
				vt[i]=1;
			}
		}
		double fac=0;
		double sm=0;
		for (i=0;i<f;i++)
		{
			fac=Math.pow(2, i);
			fac=fac*vt[i];
			sm=sm+fac;
		}
		System.out.println(String.format("%.0f", sm));
	}
	leer.close();
	}}
