package address2b.model;

public class Professor extends Person { 
	// Person �߻�Ŭ������ ����� �߻� �޼ҵ带 �����ؾ߸� �ϱ� ������ 
	// ����(�������̽�)�� ��ġ�� �ʰ� ������ �� ����
	private String sabun;
	private String email;
	private String dept;
	
	@Override
	String getName() {
		// TODO Auto-generated method stub
		return super.name;
	}
	@Override
	void setName(String name) {
		// TODO Auto-generated method stub
		super.name = name;
	}
	public String getSabun() {
		return sabun;
	}
	public void setSabun(String sabun) {
		this.sabun = sabun;
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
