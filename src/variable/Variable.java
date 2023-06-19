package variable;

public class Variable {
	public static void main(String[] args) {
		System.out.println("*** 변수 ***");
		System.out.println("변수 : 하나의 값을 저장할 수 있는 메모리 공간");
		
		int age = 30;
		String name = "lee";
		System.out.println("이름 = "+name + " 나이 = " + age);
		
		int level = 10;
		System.out.println("level = " + level);
		
		level = 20;
		System.out.println("level = " + level);
		
		char chr = 'r';
		System.out.println("chr = " + chr);
		
		String address = "서울 특별시";
		String e_mail = "sch3856@naver.com";
		
		System.out.println("*** 나의 정보 ***");
		System.out.println("name = " + name + "\nage = " + age + "\naddress = " + address + "\ne_mail = " + e_mail);
		
		System.out.println("===정수형 변수===");
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
		String str = "lee";
		System.out.println("str = " + str);
		
		System.out.println("===부울형 변수===");
		boolean isMarried = true; // 참, 1이라는 값을 가지고 있다
		boolean isWorker = false; // 거짓, 0이라는 값을 가지고 있다
		
		System.out.println("isMarried = " + isMarried);
		System.out.println("isWorker = " + isWorker);
		
		System.out.println("*** 연산 ***");
		
		int num3 = 40;
		int num4 = 20;
		
		// 60 = 40 + 20
		int addResult = num3 + num4;
		System.out.println("addResult = " + addResult);
		
		// 20 = 40 - 20
		int subResult = num3 - num4;
		System.out.println("subResult = " + subResult);
		
		// 800 = 40 * 20
		int mulResult = num3 * num4;
		System.out.println("mulResult = " + mulResult);
		
		// 2 = 40 / 20
		int divResult = num3 / num4;
		System.out.println("divResult = " + divResult);
		
		char ch1 = 'A';
		System.out.println("ch1 = " + ch1); // ch1 : A
		
		// 인코딩 : 문자에 해당하는 정수값(아스키코드값) 출력
		System.out.println("ch1 = " + (int)ch1); // 명시적인 형변환 // ch1 = 65
		
		char ch2 = 66; // 묵시적인 형변환
		// 디코딩 : 정수에 해당하는 문자 출력
		System.out.println("ch2 = " + ch2); // ch2 : B
		
		int ch3 = 67;
		System.out.println("ch3 = " + ch3); // ch3 : 67
		// 디코딩
		System.out.println("ch3 = " + (char)ch3);// ch3 : C
		
		final double PI = 3.14; // 상수 선언 및 초기화
		double value = 0.7;
		
		double result = PI * value;
		System.out.println("result = " + result);
		
		//	PI = 3.14; 오류 발생 => PI는 상수이므로 변경불가		
	}
}
