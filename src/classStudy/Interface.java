package classStudy;

//인터페이스 - 부모
interface Calc {

	// 상수 - 컴파일 과정에서 public static final 추가
	double PI = 3.14;
	int ERROR = -9999;

	// 추상 메서드 - 컴파일 과정에서 public abstract를 추가 한다.
	int add(int num1, int num2);

	int substract(int num1, int num2);

	int times(int num1, int num2);

	int div(int num1, int num2);
}

//자식클래스 - 부모인터페이스(Calc) 구현 중 add,sub구현
abstract class Calculator2 implements Calc {

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}
}

class CompleteCalc extends Calculator2 {

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int div(int num1, int num2) {
		if(num2 != 0) {
			return num1 / num2;
		}
		else {
			return ERROR;
		}
	}

	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현했습니다.");
	}
}

public class Interface {
	public static void main(String[] args) {
		int num1 = 10, num2 = 5;
		// 다형성을 적용해서 메서드 호출
		// 인터페이스(부모) 참조변수 = new 자식클래스();
		Calc calc = new CompleteCalc();
		System.out.println("덧셈 : " + calc.add(num1, num2));
		System.out.println("뺄셈 : " + calc.substract(num1, num2));
		System.out.println("곱셈 : " + calc.times(num1, num2));
		System.out.println("나눗셈 : " + calc.div(num1, num2));

		// 다운 캐스팅 : showInfo는 자식에게만 있는 메서드이므로 다운캐스팅 한다.
		CompleteCalc completeCalc = (CompleteCalc) calc;
		completeCalc.showInfo();
		// calc.showInfo();
	}
}
