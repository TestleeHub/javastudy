package classStudy;

class Calculator {
	/*
	 * 메서드(함수) : 클래스의 기능,
	 * 	- 입력을 받이 처리 결과를 반환하는 기능
	 * 	1) 메서드 호출시 메서드 명이 일치해야 한다.
	 * 	2) 매개 변수 갯수와 type (자료형)이 일치해야 한다.
	 * 	3) 리턴타입도 일치해야 한다.
	 * 	단, 변수명은 달라도 무관
	 * 
	 *  문법 : public 반환형 메서드명(매개변수 1..){
	 *  		return 반환값; //처리결과를 리턴하며 , 반환형과 일치해야 한다.
	 *  	}
	 *  반환형이 void로 선언된 메서드는 결과값을 반환하지 않는다.
	 */
	
	//디폴트 생성자
	public Calculator() {}
	
	// 멤버 메서드
	
	public double add(double num1, double num2) {
		double result = num1 + num2;
		return result;
	}
	
	public double sub(double num1, double num2) {
		double result = num1 - num2;
		return result;
	}
	
	public double mul(double num1, double num2) {
		double result = num1 * num2;
		return result;
	}
	
	public double div(double num1, double num2) {
		double result = num1 / num2;
		return result;
	}
}

	// static 변수 이자 클래스 변수, 공유 변수
	/*
	 * 프로그램이 실행 되서 메모리에 올라 갔을때  딱 한번 데이터 영역 메모리 공간에 할당된다.
	 * - 객체를 생성하지 않고, 바로 클래스 명으로 접근 가능하다
	 * 인스턴스 마다 생성되는 변수가 아니라 클래스에 속해서 한번만 생성되는 변수이고
	 * 여러 인스턴스가 공유한다.
	 * static 변수는 인스턴스보다 먼저 생성된다.
	 * 인스턴스가 생성되지 않아도 사용할 수 있기 때문에 클래스명.static변수, 클래스명.static메서드 사용가능
	 * 
	 * -static 변수나 메서드는 static메서드에서 호출가능
	 */

public class Method {
	public static void main(String[] args) {
		double d1 = 8.0;
		double d2 = 4.0;
		// 인스턴스 생성
		Calculator cal = new Calculator();
		// 참조변수 ,메서드 호출, 출력
		System.out.println("Calculator 클래스의 멤버 메서드 호출");
		System.out.println("더하기 : " + cal.add(d1, d2));
		System.out.println("빼기 : " + cal.sub(d1, d2));
		System.out.println("곱하기 : " + cal.mul(d1, d2));
		System.out.println("나누기 : " + cal.div(d1, d2));
		
		d1 = 10.0;
		d2 = 7.0;
		System.out.println("Method 클래스내의 add 메서드를 바로 호출");
		System.out.println("더하기 : " + add(d1, d2));
	}
	
	public static double add(double d1, double d2) {
		double sum = d1 + d2;
		return sum;
	}
}


