package Day2;

class Member{
	  String name;
	  int age;
	  String number;
	  String address;
	  int salary;

	  public void printSalary(){
	    System.out.println(salary);
	  }

	}

	class Employee extends Member{
	  String specialization;
	}

	class Manager extends Member{
	  String department;
	public String specialization;
	}

	class Qus2{
	  public static void main(String[] args){
	    Employee e = new Employee();
	    e.name = "KESHAV TYAGI";
	    e.age = 24;
	    e.number = "8755***";
	    e.address = "Meerut";
	    e.salary = 1089879;
	    e.specialization = "Cpp";

	    Manager m = new Manager();
	    m.name = "Rashi";
	    m.age = 23;
	    m.number = "986****";
	    m.address = "Gurugram";
	    m.salary = 1231099;
	    m.specialization = "Cpp";
	  }
	}	