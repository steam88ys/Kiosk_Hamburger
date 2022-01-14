package mvc.view;

import java.util.ArrayList;

import mvc.vo.OrderMenuVO;

public class KioskView {

	private ArrayList<OrderMenuVO> orderMenuArrList;
	private int sum;
	
	public KioskView(ArrayList<OrderMenuVO> orderMenuArrList) {
		this.orderMenuArrList = orderMenuArrList;
	}
	
	public String getMenuName (int menuNo) {
		String menuName = "";
		switch (menuNo) {
		case 1: 
			menuName = "불고기 버거";
			break;
		case 2: 
			menuName = "치킨 버거";
			break;
		case 3: 
			menuName = "새우 버거";
			break;
		case 4: 
			menuName = "콜라";
			break;
		case 5: 
			menuName = "감자튀김";
			break;
		default:
			System.out.println("잘못된 메뉴번호를 입력하였습니다.");
		}
		return menuName;
		
	}
	
	public void print() {
		System.out.println("------------------------------ 주문 내역 -------------------------------");
		for(int i=0; i < orderMenuArrList.size(); i++) {
//			ArrayList에 저장된 OrderMenuVO의 객체 참조값을 반환 받아서 지역 변수에 저장한다.
			OrderMenuVO om = orderMenuArrList.get(i);
//			OrderMenuVO 객체의 정보를 반환받아서 주문내역을 출력한다.(반복)
			int price = om.getMenuPrice();
			int count = om.getMenuCount();
			System.out.printf("%d. %s : %d원 수량(%d) 합계 : %d\n",
								i+1, getMenuName(om.getMenuNo()), price, count, price*count);
			sum += price * count;
			
			System.out.printf("\t\t 결제금액: %d 원\n", sum);
			
		}
	}
	
}
