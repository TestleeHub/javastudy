package classStudy;

class IDFormat {
	private String userID;

	public IDFormat() {
	}

	public IDFormat(String userID) {
		this.userID = userID;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) throws IDFormatException {
		if (userID == null) {
			throw new IDFormatException("아이디는 null일 수 없습니다.");
		} else if (userID.length() > 28 || userID.length() < 8) {
			throw new IDFormatException("아이디는 8~28글자 입니다.");
		} else {
			this.userID = userID;
		}
	}
}

@SuppressWarnings("serial")
class IDFormatException extends Exception {
	public IDFormatException(String message) {
		super(message); // 부모( = Exception)매개변수 생성자 호출
	}
}

public class ExceptionStudy {
	public static void main(String[] args) {
		IDFormat idFormat = new IDFormat();

		// userID가 null인 경우 예외처리
		try {
			idFormat.setUserID(null);
			System.out.println("try" + idFormat.getUserID());
		} catch (IDFormatException e) {
			System.out.println("catch!" + e.getMessage());
		} finally {
			System.out.println("finally");
		}
		System.out.println("정상종료");
	}
}
