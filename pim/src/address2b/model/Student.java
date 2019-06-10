package address2b.model;

public class Student extends Person { 
	// DTO : Data Transfer Object (������ ���� ��ü)
	// DB Table��  Record�� Mapping�� �� (Set of Fields)
	// MVC �𵨿��� Model�� ������ ����, ���� ����, �����Ͻ� ó���� ����ϰ�, 
	// DTO�� DAO(Data Access Object)�� ����
	private String hakbun; // ����Ű(primary key)
	private String email;
	private String dept;
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub		
		return super.name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.name = name;
	}

	public String getHakbun() {
		return hakbun;
	}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
}
