package Quiz1;

import java.io.IOException;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/quiz001")
public class quiz001 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public quiz001() {
        super();
      
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

//2. ����ó������� �հ� ���θ� �˷��ִ� ���α׷��� �ۼ��Ͻÿ�. 
//����ó������ 5�� ������ ������, �� ���� �� ������ 20�����̸�, 
//�� ���� 60���� �Ѿ�� �հ��̴�. 
//��, ������ 60���� �Ѿ���� �� �����̶� 
//8�� �̸��� ������ �¾Ҵٸ� Ż���� �ȴ�. 
//Scanner sc = new Scanner(System.in);
//System.out.print("1. ����Ʈ���� ����: ");
//int ����1 = sc.nextInt();
//System.out.print("2. ����Ʈ���� ����: ");
//int ����2 = sc.nextInt();
//System.out.print("3. �����ͺ��̽� ����: ");
//int ����3 = sc.nextInt();
//System.out.print("4. ���α׷��� ��� Ȱ��: ");
//int ����4 = sc.nextInt();
//System.out.print("5. �����ý��� ���� ����: ");
//int ����5 = sc.nextInt();
//int ������ = ����1+ ����2+����3+����4+����5;
//
//if (����1 <8 || ����2<8 || ����3<8 || ����4<8 || ����5<8) {
//	System.out.println("Ż��");
//}else if(������ <61) {
//	System.out.println("Ż��");
//	
//}else {
//	System.out.println("�հ�");
//}



//		int �ݾ� = 25600;
//		int _1���� = �ݾ� / 10000; int �������� = �ݾ�%10000;
//		int _5õ�� = �������� /5000; int _5õ���� = ��������%5000; 
//		System.out.println("�ݾ�: "+�ݾ�);
//		System.out.println("1�������: "+_1����);
//		System.out.println("5õ�����: "+_5õ��);