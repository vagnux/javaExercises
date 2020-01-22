package arrayObject;

import java.util.ArrayList;
import java.util.List;

public class program {

	public static void main(String[] args) {
	
		myObj pessoa = new myObj();
		pessoa.name = "Jose";
		pessoa.age = 40;
		
		System.out.println("Nome criado " + pessoa.name);
		
		List<Object> people = new ArrayList<Object>();
		
		people.add(pessoa);
		
		pessoa.name = "Maria";
		pessoa.age = 41;
		people.add(pessoa);
		
		System.out.println("Quantidade de elementos na lista: " + people.size());
		
		Integer i = 0;
		
		for ( i=0;i<people.size();i++) {
			myObj p = (myObj) people.get(i);
			System.out.println("Nome do elemento " + i + " = " + p.name);
		}
		
	}

}
