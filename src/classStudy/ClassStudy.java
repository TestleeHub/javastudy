package classStudy;

class Student {
	//멤버변수(속성)
	String name;
	String email;
	String address;
	
	//디폴트 생성자
	public Student() {	}
	
	//생성자 오버로딩
	public Student(String name, String email, String address) {
		this.name = name;
		this.email = email;
		this.address = address;
	}
	
	//멤버 메서드(기능, 동작)
	
	//getter, setter
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	//일반 메서드
	public void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("이메일 : " + email);
		System.out.println("주소 : " + address);
	}
}

public class ClassStudy {
	public static void main(String[] args) {
		//디폴트 생성자를 사용하여 클래스를 인스턴스화
		Student student1 = new Student();
		//매개변서 생성자를 사용하여 클래스를 인스턴스화
		Student student2 = new Student("홍길동", "hong@email.com", "서울");
		
		//멤버변수에 직접 접근하여 데이터 전달
		student1.name = "임꺽정";
		
		//setter를 이용하여 데이터 전달
		student1.setEmail("lim@email.com");
		student1.setAddress("부산");
		
		//멤머 메서드 호출
		student1.printInfo();
		student2.printInfo();
	}
}
