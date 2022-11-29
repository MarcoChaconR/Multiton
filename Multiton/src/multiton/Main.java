package multiton;

import entidades.Multiton;
import entidades.MultitonType;

public class Main {

	public static void main(String[] args) {
        var m0 = Multiton.GetInstance(MultitonType.uno);
        var m1 = Multiton.GetInstance(MultitonType.dos);
        var m2 = Multiton.GetInstance(MultitonType.tres);
        
        System.out.println(m0.toString());
        System.out.println(m1.toString());
        System.out.println(m2.toString());
	}

}
