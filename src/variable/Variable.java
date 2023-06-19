package variable;

public class Variable {
	public static void main(String[] args) {
		System.out.println("*** 변수 ***");
		System.out.println("변수 : 하나의 값을 저장할 수 있는 메모리 공간");
		
		/*
		 * 변수 선언(메모리에 선언) 및 대입 => 자료형 변수명 = 값;
		 * 변수는 소문자로 시작한다.
		 * 값은 자료형에 맞게 대입되어야 한다.
		 */
		int age = 30;
		String name = "LEE";
		System.out.println("이름 = "+name + " 나이 = " + age);
		
		int level = 10;
		System.out.println("level = " + level);
		
		// 기존 변수에 대입
		level = 20;
		System.out.println("level = " + level);
		
		char chr = 'r';
//		char chr = " "; //에러 char은 한문자, 싱글 따옴표 사용
		System.out.println("chr = " + chr);
		
		// address, e_mail
		String address = "서울 특별시";
		String e_mail = "sch3856@naver.com";
		
		//본인의 정보를 출력 name, age, address, e_mail
		System.out.println("*** 나의 정보 ***");
		System.out.println(); // 빈줄 삽입
		System.out.println("name = " + name + "\nage = " + age + "\naddress = " + address + "\ne_mail = " + e_mail);
		
		/*
		 * 1. 기본 자료형(primitive Type) : 실제 '값'이 저장되는 공간
		 * 		정수형 : byte(1), short(2), int(4), long(8)
		 * 		실수형 : float(4), double(8)
		 * 		문자형 : char(2)
		 * 		부울형 : boolean(1) : true(1) / false(0) => 조건문, 참인지 거짓인지 판단
		 * 		정수형의 long형보다 실수형 float이 더 크다
		 * 
		 * 2. 참조형(Reference Type) : 실제 객체를 가리키는 주소값이 저장되는 공간 = 참조변수의 자료형
		 * 		클래스, 인터페이스, 배열
		 * 
		 * 3. 문자열 : String 클래스
		 */
		
		System.out.println("===정수형 변수===");
		// 선언과 동시에 초기화
		int num1 = 10;
		long num2 = 12345678922222222L;// long형은 숫자 뒤에 L 또는 l 사용(int와 비교)
//		int num3 = 10000000000; // 범위를 벗어남
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		
		System.out.println("===실수형 변수===");
		float fnum1 = 3.14f; // float형은 값 뒤에 F 또는 f를 붙인다.
		System.out.println("fnum1 = " + fnum1);
		double dnum1 = 3.14; // double은 기본형이며 값뒤에 F 또는 f를 붙이지 않는다.
		System.out.println("dnum1 = " + dnum1);

		System.out.println("===문자열 변수===");
		//String str = ""; // String은 클래스 자료형이다 반드시 대문자로 시작한다, 초기화시 ""를 사용하고 공백이 없어도 된다
		//str = "이연우";
		String str = "이연우";
		System.out.println("str = " + str);
		
		System.out.println("===부울형 변수===");
		boolean isMarried = true; // 참, 1이라는 값을 가지고 있다
		boolean isWorker = false; // 거짓, 0이라는 값을 가지고 있다
		
		System.out.println("isMarried = " + isMarried);
		System.out.println("isWorker = " + isWorker);
		
		System.out.println("*** 연산 ***");
		
		int num1 = 40;
		int num2 = 20;
		
		// 60 = 40 + 20
		int addResult = num1 + num2;
		System.out.println("addResult = " + addResult);
		
		// 20 = 40 - 20
		int subResult = num1 - num2;
		System.out.println("subResult = " + subResult);
		
		// 800 = 40 * 20
		int mulResult = num1 * num2;
		System.out.println("mulResult = " + mulResult);
		
		// 2 = 40 / 20
		int divResult = num1 / num2;
		System.out.println("divResult = " + divResult);
		
		/*
		 *  아스키코드 10진수 값
		 *  아스키코드는 정해져 있다
		 *  'A' : 65
		 *  'B' : 66
		 *  'Z' : 90
		 *  'a' : 97
		 *  'z' : 122
		 */
		
		char ch1 = 'A';
		System.out.println("ch1 = " + ch1); // ch1 : A
		
		// 인코딩 : 문자에 해당하는 정수값(아스키코드값) 출력
		System.out.println("ch1 = " + (int)ch1); // 명시적인 형변환 // ch1 = 65
		
		char ch2 = 66; // 묵시적인 형변환
		// 디코딩 : 정수에 해당하는 문자 출력
		System.out.println("ch2 = " + ch2); // ch2 : B
		
		int ch3 = 67;
		System.out.println("ch3 = " + ch3); // ch3 : 66
		// 디코딩
		System.out.println("ch3 = " + (char)ch3);// ch3 : B
		

		/*
		 * 상수 : 프로그램이 실행되는 동안 값이 변하지 않거나 변경 불가능한 수
		 * 		주로 대문자 사용(변수는 소문자)
		 * 		만약 값을 변경해야 할 경우 상수를 선언한 부분의 값만 변경하면 된다.(편리성)
		 * 	
		 * 문법 : final 자료형 변수명; 예 final double PI = 3.14;
		 * 		1) 변수(상수) : 변수에 값 대입 불가 - 변경 불가
		 * 		2) 메서드에도 사용이 가능하다. - 재정의 불가
		 * 		3) 클래스에도 사용이 가능하다. - 상속 불가
		 * 		4) 메서드와 클래스에도 모두 사용이 가능하다.
		 * 
		 */
		
		final double PI = 3.14; // 상수 선언 및 초기화
		double value = 0.7;
		
		double result = PI * value;
		System.out.println("result = " + result);
		
		//	PI = 3.14; 오류 발생 => PI는 상수이므로 변경불가
		
		System.out.println();
		//	내정보 출력(MY_NAME, MY_AGE, MY_ADDRESS, MY_EMAIL)
		final String MY_NAME = "Leeyeanwoo";
		final int MY_AGE = 30;
		final String MY_ADDRESS = "seoul";
		final String MY_EMAIL = "sch3856@naver.com";
		
		System.out.println("MY_NAME = " + MY_NAME + "\nMY_AGE = " + MY_AGE + "\nMY_ADDRESS = " + MY_ADDRESS + "\nMY_AGE = " + MY_EMAIL );
	
				
	}
}
