package Day3_Ass;


abstract class AbstractClass{

	public AbstractClass() {
		super();
		System.out.println("This is Constructor of Abstract class");
		// TODO Auto-generated constructor stub
	}
	abstract void a_Class();
	void non_Abstract() {
		System.out.println("This is normal method in Abstract class");
	}
	
}
class SubClass extends AbstractClass{

	@Override
	void a_Class() {
		// TODO Auto-generated method stub
		System.out.println("This is Abstract method");
		
	}
	
}

public class AbstractConsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClass s=new SubClass();
		s.a_Class();
		s.non_Abstract();
		
	}

}