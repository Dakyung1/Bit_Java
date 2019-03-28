package javaLec.ExAbstract.ex02AbstractEmployee;

public class EmployeeMain {
	public static void viewPay(Employee[] emps) {
		for(Employee emp: emps) {
			System.out.print("***");
			System.out.print(emp); //���ο��� toStringȣ��
			System.out.println("***");
			System.out.println(emp.getMonthPay());
			System.out.println("------------------");
		}
	}
	
	public static void main(String[] args) {
		Employee[] emps = new Employee[4];
		emps[0] = new RegularEmployee("E001", "ȫ�浿", 3000,500);
		emps[1] = new TempEmployee("E002", "�Ӳ���", 4000,3);
		emps[2] = new PartTimeEmployee("E003", "Ȳ����", 7,15);
		emps[3] = new PartTimeEmployee("E004", "��쵿", 5,10);
		
		viewPay(emps);
	}
}