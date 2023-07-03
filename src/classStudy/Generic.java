package classStudy;

class Rubber {
	public void doPrinting() {
		System.out.println("고무 재료를 사용합니다.");
	}
	
	@Override
	public String toString() {
		return "재료는 고무 입니다.";
	}
}

class Silicon {
	public void doPrinting() {
		System.out.println("실리콘 재료를 사용합니다.");
	}
	
	@Override
	public String toString() {
		return "재료는 실리콘입니다.";
	}
}

class Machine<T> {
	// 멤버변수
	private T material; // T는 자료형 material은 참조변수
	// 멤버메서드
	
	public Machine() {	}

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	@Override
	public String toString() {
		return material.toString();
	}
}

public class Generic {
	public static void main(String[] args) {
		System.out.println("==T가 Rubber일때==");
		Machine<Rubber> powderPrinter = new Machine<Rubber>();
		powderPrinter.setMaterial(new Rubber());
		powderPrinter.getMaterial().doPrinting();
		System.out.println(powderPrinter);
		
		System.out.println("==T가 Plastic일때==");
		Machine<Silicon> plasticPrinter = new Machine<Silicon>();
		Silicon plastic = new Silicon();
		plasticPrinter.setMaterial(plastic);
		Silicon material = plasticPrinter.getMaterial();
		material.doPrinting();
		System.out.println(plasticPrinter);
	}
}
