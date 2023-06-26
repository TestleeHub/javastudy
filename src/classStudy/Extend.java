package classStudy;

class _01_Animal {
	// 멤버변수
	private String kind; // 종류
	private int legs; // 다리

	// 디폴트생성자
	public _01_Animal() {
		System.out.println("<<부모 디폴트 생성자>>");
	}

	// 매개변수 생성자
	public _01_Animal(String kind, int legs) {
		this.kind = kind;
		this.legs = legs;
	}

	// 멤버 메서드
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public void eat() {
		System.out.println("먹다~~");
	}

	public void sleep() {
		System.out.println("자다~~");
	}

	public void play() {
		System.out.println("놀다~~");
	}

	public void printInfo() {
		System.out.println("종류 : " + kind + " 다리갯수 : " + legs);
	}
}


class _01_Cat extends _01_Animal {
	// 디폴트 생성자
	public _01_Cat() {
		System.out.println("<<cat자식 디폴트 생성자>>");
	}

	// 멤버메서드
	public void cry() {
		System.out.println("야옹");
	}
}

class _01_Dog extends _01_Animal{
	// 디폴트 생성자
	public _01_Dog() {	
		System.out.println("<<dog자식 디폴트 생성자>>");
	}
	
	// 멤버 메서드
	public void bark() {
		System.out.println("멍멍~~");
	}
}

public class Extend {
	public static void main(String[] args) {
		System.out.println("===cat===");
		_01_Cat cat = new _01_Cat();
		cat.cry();

		// 부모의 setter로 값 전달
		cat.setKind("고양이");
		cat.setLegs(4);
		// 출력
		cat.printInfo();
		// 공통 기능 출력
		cat.eat();
		cat.sleep();
		cat.play();
		
		System.out.println("===dog===");
		_01_Dog dog = new _01_Dog();
		dog.bark();
		
		dog.setKind("강아지");
		dog.setLegs(4);
		
		dog.printInfo();
		
		dog.eat();
		dog.sleep();
		dog.play();
	}
}
