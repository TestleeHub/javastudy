package classStudy;

class Calculator {	
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


