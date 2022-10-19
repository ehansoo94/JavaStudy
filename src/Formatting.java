
public class Formatting {
	public static void main(String[] args) {
		
		// 포맷팅 - 지정된 위치에 값을 대입한 것을 문자열 형식으로 만드는 것.
		
		// 사용법 1. String 클래스의 format 메소드 사용
		String format1 = String.format("%s과 정수%d%n", "문자열", 123);
		System.out.println(format1);
		
		// 사용법 2. printf 메소드 사용
		System.out.printf("실수 %f와 boolean %b\n", 3.141592, true);
		
		// 사용법 2-2. System.out.format() 메소드 사용
			// printf 메소드와 동일하다.
		
		
		
		
		
	}
}
