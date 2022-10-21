import java.util.Calendar;

public class Formatting {
	public static void main(String[] args) {
		
		// 포맷팅 - 지정된 위치에 값을 대입한 것을 문자열 형식으로 만드는 것.
		
		// 사용법 1. String 클래스의 format 메소드 사용
		String format1 = String.format("%s과 정수%d%n", "문자열", 123);
		System.out.println(format1);
		
		// 사용법 2. System.out.printf() 메소드 사용
		System.out.printf("실수 %f와 boolean %b\n", 3.141592, true);
		
		// 사용법 2-2. System.out.format() 메소드 사용
		// System.out.printf() 메소드와 동일하다.
		
		// 추가 기능 (%n 은 줄바꿈 기호이고, <- 는 공백을 확인하기 위해 넣은 문자임.)
		int i = 1234567;
		System.out.printf("%,d%n", i);		// 1,234,567	3자리마다 반점을 찍음
		System.out.printf("%8d<-%n", i);	//  1234567<-	8칸의 공백을 숫자로 채우기.
		System.out.printf("%-8d<-%n", i);	// 1234567 <-	8칸의 공백을 숫자로 왼쪽 정렬로 채우기.
		System.out.printf("%08d%n", i);		// 01234567		8칸의 공백을 숫자로 채우는데, 공백에는 0을 넣는다.
		System.out.printf("%+d%n", i);		// +1234567		양수여도 기호를 표시하기. 
		System.out.printf("%+d%n", -i);		// -1234567		물론 음수이면 음수기호가 나타난다.
		
		double f = 12345.6789;
		System.out.printf("%.4f%n", f);			// 12345.6789		소숫점 네번째 자리까지만 출력 
		System.out.printf("%11.4f%n", f);		//  12345.6789		11칸의 공백을 채워넣음. 소숫점 아래의 숫자와, 점도 칸을 차지하는 것으로 간주한다.
		System.out.printf("%+,-13.4f<-%n", f);	// +12,345.6789 <-	정수에서 쓰였던 + 와 , 와 - 모두 잘 작동한다.
		
	
	}
}
