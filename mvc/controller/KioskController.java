package mvc.controller;

import java.util.ArrayList;
import java.util.Scanner;

import mvc.view.KioskView;
import mvc.vo.OrderMenuVO;

public class KioskController {
	
	private static int[] price = {3000, 3500, 3700, 1500, 2500};
	
	public static void selectMenuPrint () {
		System.out.println("**************************** ���� �޴� ���� ****************************");
		System.out.println("1. �Ұ�� ����\t2. ġŲ ����\t3.���� ����\t4.�ݶ�\t5.����Ƣ��");
		System.out.println("*********************************************************************");
	}

	public static void main(String[] args) {

		ArrayList<OrderMenuVO> orderMenuArrList = new ArrayList<OrderMenuVO>();
		Scanner s1 = new Scanner (System.in);	// ���ڿ� �Է¿�
		Scanner s2 = new Scanner (System.in);	// ���� �Է¿�
		
		selectMenuPrint();
		
		int orderNo = 1;
		
//		�޴� ����	
		while(true) {
			
			System.out.print("* ������ �޴��� ��ȣ�� �Է����ּ��� : ");
			int menuNO = s2.nextInt();
			System.out.print("* ������ �޴��� ������ �Է����ּ��� : ");
			int menuCount = s2.nextInt();
			
			OrderMenuVO om = new OrderMenuVO(orderNo, menuNO, price[menuNO-1], menuCount);
			
			orderMenuArrList.add(om);
			System.out.print("* �޴��� ��� �����Ͻðڽ��ϱ�?(y/n) : ");
			String msg = s1.nextLine();
			if(msg.equals("n") || msg.equals("no")) break;
		}
		
//		��ü �ֹ� ���� ���		
		KioskView view = new KioskView(orderMenuArrList);
		view.print();
		
//		���� �� �ֹ� �Ϸ� ȭ�� ���
		System.out.println("*********************************************************************");
		System.out.println(orderNo + "�� ������ ���� �� �ֹ��� �Ϸ�Ǿ����ϴ�.");
		System.out.println("*********************************************************************");
		
		s1.close();
		s2.close();
	}

}
