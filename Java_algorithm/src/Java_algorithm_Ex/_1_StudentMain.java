package Java_algorithm_Ex;

import java.util.ArrayList;
import java.util.Scanner;

//학생이름 저장 및 검색

public class _1_StudentMain {

	public static void main(String[] args) {

		Student student1 = new Student("김상현", "71");
		Student student2 = new Student("김기현", "92");
		Student student3 = new Student("유혜리", "00");

		ArrayList<Student> list = new ArrayList<Student>();

		list.add(student1);
		list.add(student2);
		list.add(student3);

		for (Student i : list) {
			System.out.println(i.getName());
			System.out.println(i.getNo());
			System.out.println("=================");
		}

		Scanner in = new Scanner(System.in);

		while (true) {
			System.out.println("계속 검색 : y 중지 : n");
			String input = in.next();
			if (input.equals("y")) {
				System.out.println("검색 시작");

				String name = in.next();
				boolean flag = false;

				for (Student i : list) {
					if (i.getName().equals(name)) {
						System.out.println(name + "의 번호는 " + i.getNo());
						flag = true;
					}
				}

				if (!flag) {
					System.out.println("입력하신 이름을 찾지 못했습니다.");
				}

			} else if (input.equals("n")) {
				break;
			}

		}
		System.out.println("프로그램이 종료되었습니다.");
	}
}

class Student {
	private String name;
	private String no;

	public Student(String name, String no) {
		this.name = name;
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

}
