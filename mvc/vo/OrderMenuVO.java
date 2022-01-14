package mvc.vo;

public class OrderMenuVO {

	private int orderNo;	// 주문번호
	private int menuNo;		// 메뉴
	private int menuPrice;	// 메뉴가격
	private int menuCount;	// 메뉴수량
	
	public OrderMenuVO(int orderNo, int menuNo, int menuPrice, int menuCount) {
		super();
		this.orderNo = orderNo;
		this.menuNo = menuNo;
		this.menuPrice = menuPrice;
		this.menuCount = menuCount;
	}
	
	public int getMenuNo() {
		return menuNo;
	}
	public void setMenuNo(int menuNo) {
		this.menuNo = menuNo;
	}
	public int getMenuPrice() {
		return menuPrice;
	}
	public void setMenuPrice(int menuPrice) {
		this.menuPrice = menuPrice;
	}
	public int getMenuCount() {
		return menuCount;
	}
	public void setMenuCount(int menuCount) {
		this.menuCount = menuCount;
	}
	public int getOrderNo() {
		return orderNo;
	}
	
}
