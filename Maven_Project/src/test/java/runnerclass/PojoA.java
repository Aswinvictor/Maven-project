package runnerclass;

import com.baseclass.Pojo;

public class PojoA {

	public static void main(String[] args) {

		Pojo p = new Pojo(); // Creating object for Pojo class

		System.out.println(p.getName()); // getting the name

		p.setName("jasen"); // Setting or Updating the name
		System.out.println(p.getName()); // getting the updated name

	}

}
