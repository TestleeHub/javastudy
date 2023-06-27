package classStudy;

abstract class _01_Computer {
	
	public abstract void display();
	public abstract void typing();
	
	//일반 메서드 구현
	public void turnOn() {
		System.out.println("전원을 켭니다");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다");
	}
}

class _01_Desktop extends _01_Computer{

	@Override
	public void display() {
		System.out.println("_01_Desktop - display()");
	}

	@Override
	public void typing() {
		System.out.println("_01_Desktop - typing()");
	}
}

abstract class _01_NoteBook extends _01_Computer {

	@Override
	public void display() {
		System.out.println("_01_NoteBook - display()");
	}
}

class _01_MyNoteBook extends _01_NoteBook {

	@Override
	public void typing() {
		System.out.println("_01_MyNoteBook - typing()");
	}
}

public class Abstract {
	public static void main(String[] args) {
		
		_01_Computer desktop = new _01_Desktop();
		desktop.display();// 재정의 된 자식메서드 호출
		desktop.typing();// 재정의 된 자식메서드 호출
		desktop.turnOn();
		desktop.turnOff();
		
		System.out.println("----------------");
		
		//_01_Computer myNoteBook = new _01_Computer();// 추상클래스는 인스턴스화 할수 없다.(추상 메서드가 구현이 안된 불완전한 메서드 이므로)
		//_01_Computer myNoteBook = new _01_NoteBook();// 추상클래스는 인스턴스화 할수 없다.
		_01_Computer myNoteBook = new _01_MyNoteBook();
		
		myNoteBook.display();
		myNoteBook.typing();
		myNoteBook.turnOn();
		myNoteBook.turnOff();
	}
}
