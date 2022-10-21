import java.util.Calendar;

public class Formatting {
	public static void main(String[] args) {
		
		// ������ - ������ ��ġ�� ���� ������ ���� ���ڿ� �������� ����� ��.
		
		// ���� 1. String Ŭ������ format �޼ҵ� ���
		String format1 = String.format("%s�� ����%d%n", "���ڿ�", 123);
		System.out.println(format1);
		
		// ���� 2. System.out.printf() �޼ҵ� ���
		System.out.printf("�Ǽ� %f�� boolean %b\n", 3.141592, true);
		
		// ���� 2-2. System.out.format() �޼ҵ� ���
		// System.out.printf() �޼ҵ�� �����ϴ�.
		
		// �߰� ��� (%n �� �ٹٲ� ��ȣ�̰�, <- �� ������ Ȯ���ϱ� ���� ���� ������.)
		int i = 1234567;
		System.out.printf("%,d%n", i);		// 1,234,567	3�ڸ����� ������ ����
		System.out.printf("%8d<-%n", i);	//  1234567<-	8ĭ�� ������ ���ڷ� ä���.
		System.out.printf("%-8d<-%n", i);	// 1234567 <-	8ĭ�� ������ ���ڷ� ���� ���ķ� ä���.
		System.out.printf("%08d%n", i);		// 01234567		8ĭ�� ������ ���ڷ� ä��µ�, ���鿡�� 0�� �ִ´�.
		System.out.printf("%+d%n", i);		// +1234567		������� ��ȣ�� ǥ���ϱ�. 
		System.out.printf("%+d%n", -i);		// -1234567		���� �����̸� ������ȣ�� ��Ÿ����.
		
		double f = 12345.6789;
		System.out.printf("%.4f%n", f);			// 12345.6789		�Ҽ��� �׹�° �ڸ������� ��� 
		System.out.printf("%11.4f%n", f);		//  12345.6789		11ĭ�� ������ ä������. �Ҽ��� �Ʒ��� ���ڿ�, ���� ĭ�� �����ϴ� ������ �����Ѵ�.
		System.out.printf("%+,-13.4f<-%n", f);	// +12,345.6789 <-	�������� ������ + �� , �� - ��� �� �۵��Ѵ�.
		
	
	}
}
