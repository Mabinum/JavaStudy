package reference;

public class sample1 {

	public static void main(String[] args) {

		Employee 부서장 = new Employee("김석준", 50, 400, 3);
		Employee 수석연구원 = new Employee("김석준", 50, 400, 3);
		Employee 책임연구원 = new Employee("김석준", 50, 400, 3);

		Department department = new Department(부서장, 수석연구원, 책임연구원);

		department.showDepartmentInfo();
	}

}

class Employee {
	String 이름;
	int 나이;
	int 월급;
	int 근속년수;

	public Employee(String 이름, int 나이, int 월급, int 근속년수) {
		super();
		this.이름 = 이름;
		this.나이 = 나이;
		this.월급 = 월급;
		this.근속년수 = 근속년수;
	}
}

class Department {
	Employee 부서장;
	Employee 수석연구원;
	Employee 책임연구원;

	public Department(Employee 부서장, Employee 수석연구원, Employee 책임연구원) {
		super();
		this.부서장 = 부서장;
		this.수석연구원 = 수석연구원;
		this.책임연구원 = 책임연구원;
	}
	
	public void showDepartmentInfo() {
		System.out.println("부서장의 정보는 : " + 부서장.이름);
		System.out.println("수석연구원의 정보는 : " + 수석연구원.월급);
		System.out.println("책임연구원의 정보는 : " + 책임연구원.);
		
	}
}
