package main;

import jdk.nashorn.internal.runtime.arrays.IntElements;

public class mainclass implements InterfaceMain {



	public int Tritype(double a, double b, double c) {
		// TODO Auto-generated method stub
		int trityp= 0;
		if (a< 0.0 || b < 0.0 || c < 0.0)
		return 3;
		if (a + b <= c || b + c <= a || c + a <= b)
		return 3;
		if (a== b) trityp= trityp+ 1;
		if (a== c) trityp= trityp+ 1;
		if (b == c) trityp= trityp+ 1;
		if (trityp>= 2)
		trityp= 2;
		return trityp;
	}




}
