package model;

public class UserBean {
	// DB의 Contacts 테이블과 열의 이름이 같음
	private int customer_id;
	private String id;
	private String password;
	private String name;
	private String email;
	private String phone;
	private String address;
	
	public UserBean() {} // 기본 생성자는 자바 bean용으로 필요
	
	public UserBean(String id, String password, String name, String email, String phone, String address) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [customer_id=" + customer_id + ", id=" + id + ", password=" + password + ", name=" + name
				+ ", email=" + email + ", phone=" + phone + ", address=" + address + "]";
	}
}
