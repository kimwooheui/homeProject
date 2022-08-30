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

//2. 정보처리기사의 합격 여부를 알려주는 프로그램을 작성하시오. 
//정보처리기사는 5개 과목이 있으며, 한 과목 당 문제는 20문제이며, 
//총 합이 60개가 넘어야 합격이다. 
//단, 총합이 60개가 넘어가더라도 한 과목이라도 
//8개 미만의 개수를 맞았다면 탈락이 된다. 
//Scanner sc = new Scanner(System.in);
//System.out.print("1. 소프트웨어 설계: ");
//int 과목1 = sc.nextInt();
//System.out.print("2. 소프트웨어 개발: ");
//int 과목2 = sc.nextInt();
//System.out.print("3. 데이터베이스 구축: ");
//int 과목3 = sc.nextInt();
//System.out.print("4. 프로그래밍 언어 활용: ");
//int 과목4 = sc.nextInt();
//System.out.print("5. 정보시스템 구축 관리: ");
//int 과목5 = sc.nextInt();
//int 과목합 = 과목1+ 과목2+과목3+과목4+과목5;
//
//if (과목1 <8 || 과목2<8 || 과목3<8 || 과목4<8 || 과목5<8) {
//	System.out.println("탈락");
//}else if(과목합 <61) {
//	System.out.println("탈락");
//	
//}else {
//	System.out.println("합격");
//}



//		int 금액 = 25600;
//		int _1만원 = 금액 / 10000; int 만원뺀돈 = 금액%10000;
//		int _5천원 = 만원뺀돈 /5000; int _5천뺀돈 = 만원뺀돈%5000; 
//		System.out.println("금액: "+금액);
//		System.out.println("1만원장수: "+_1만원);
//		System.out.println("5천원장수: "+_5천원);