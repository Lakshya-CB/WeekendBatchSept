package Lec_27;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		
//		case 1:
		P p = new P();
//		case 2:
		P obj2 = new C();
	
//		Compiler only looks at LHS
//		data members collision is resolved by the type of refference !!
		
		Object obj = new P();
		
		List<Integer> AL = new ArrayList<>();
		System.out.println(obj2.data1);
		System.out.println(((C)obj2).data1);
		
//		Functions!!
//		Using THS!! , new !! bo hi function chalega!!
		obj2.fun1();
		obj2.fun2();
		((P)obj2).fun1();
		
//		Case 3 never works!!
//		C obj3 = new P();
//		Case 4 :
		C c = new C();
		System.out.println(c.datatC);
	}
}
