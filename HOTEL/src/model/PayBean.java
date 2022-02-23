package model;

public class PayBean {
	// DB의 Contacts 테이블과 열의 이름이 같음
	private int pay_id;
	private int order_pay_id;
	private int pay;
	private String pay_kind;
	private String pay_bank;
	private String pay_cardnumber;
	
	public int getPay_id() {
		return pay_id;
	}
	public void setPay_id(int pay_id) {
		this.pay_id = pay_id;
	}
	public int getOrder_pay_id() {
		return order_pay_id;
	}
	public void setOrder_pay_id(int order_pay_id) {
		this.order_pay_id = order_pay_id;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public String getPay_kind() {
		return pay_kind;
	}
	public void setPay_kind(String pay_kind) {
		this.pay_kind = pay_kind;
	}
	public String getPay_bank() {
		return pay_bank;
	}
	public void setPay_bank(String pay_bank) {
		this.pay_bank = pay_bank;
	}
	public String getPay_cardnumber() {
		return pay_cardnumber;
	}
	public void setPay_cardnumber(String pay_cardnumber) {
		this.pay_cardnumber = pay_cardnumber;
	}
	@Override
	public String toString() {
		return "PayBean [pay_id=" + pay_id + ", order_pay_id=" + order_pay_id + ", pay=" + pay + ", pay_kind="
				+ pay_kind + ", pay_bank=" + pay_bank + ", pay_cardnumber=" + pay_cardnumber + "]";
	}
	
	
	
}
