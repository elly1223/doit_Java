package hiding;

public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student();
		// studentLee.studentName = "�̻��";
		studentLee.setStudentName("�̻��");  // set �޼��带 Ȱ���� private ������ ���� ����

		System.out.println(studentLee.getStudentName());
	}
}