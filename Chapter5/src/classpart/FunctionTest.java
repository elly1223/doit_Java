package classpart;

public class FunctionTest {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int sum = addNum(num1, num2);  // add �Լ��� ȣ���ؾ߸� �� �� �ִ�.

		System.out.println(num1 + " + " + num2 + " = " + sum + "�Դϴ�");
	}

	public static int addNum(int n1, int n2) {
		int result = n1 + n2;
		return result;  // ��� �� ��ȯ
	}

}