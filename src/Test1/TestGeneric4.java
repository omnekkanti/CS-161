package Test1;

import static java.lang.System.*;

class TestGeneric4<p,q>{

	public static void main(String x[])
	{
		// Generic<String,Integer> om1 = new Generic<>("String",24);
		//om1 = new Generic<>(24,24);
		Generic xyz = new Generic<>("om","nek");
		xyz = new Generic<>(34.5,56.5);
		Generic<String,Integer> pitter = (Generic<String,Integer>)xyz;
		out.println(pitter.om);
		out.println(pitter.prakash);
		out.println(pitter.om.getClass().getName());
		out.println(pitter.prakash.getClass().getName());
		// out.println(om1.om);
		// out.println(om1.prakash);
		// out.println(om1.om.getClass().getName());
		// out.println(om1.prakash.getClass().getName());
		//
		// Generic<String, Integer> om2 = new Generic<>("om",224);
		// //om2 = new Generic<>(22.4,"OM");
		// om2 = new Generic<>("prakash",255);
		//
		// Generic om3 = new Generic<>("om", "prakash");
		// om3 = new Generic<>(224,22.4);
	}
}
