package classpart;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;

	public void showStudentInfo() {
		System.out.println(studentName + "," + address); // 이름, 주소 출력
	}

	public String getStudentName() {  // 학생의 이름을 반환하는 메서드
		return studentName;
	}

	public void setStudentName(String name) {  // 학생 이름을 매개변수로 전달
		studentName = name;
	}

	public static void main(String[] args) {
		Student studentAhn = new Student();
		studentAhn.studentName = "안연수";

		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}

}
