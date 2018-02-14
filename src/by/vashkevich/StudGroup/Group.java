package by.vashkevich.StudGroup;

public class Group {
	private String title;
	private Student[] studentik; // ������ �� ���������
	private int studentCounter =0;

	public void setStudentsArray(Student[] studentik) { // ��������� ������
														// ���������
		if (studentik != null) {
			this.studentik = studentik;
		}

	}

	public Student[] getStudents() { // �������� ���������� � ��������
		return this.studentik;
	}

	public void addStudetInGroup(Student student) { // ��������� �������� �
													// ������
		if (this.studentik != null) {
			if (studentCounter < studentik.length) {
				studentik[studentCounter] = student; 
				studentCounter++;
			} else {
				Student[] studentik = new Student[this.studentik.length + 5];
				for (int i = 0; i < this.studentik.length; i++) {
					studentik[i] = this.studentik[i];

				}
				this.studentik = studentik;
				this.studentik[studentCounter] = student;
				studentCounter++;

			}
		} else {
			this.studentik = new Student[5];
			this.studentik[studentCounter] = student;
			studentCounter++;
		}
		//this.studentik[0] = student;

	}

	public int avgStudAge() { // ������� ������� ������� ���������
		int avgAge;
		int sum = 0;
		for (int i = 0; i < studentik.length; i++) {
			sum += studentik[i].getSudentAge(); // 1. ������� ������ �� �����. 2
												// �������� ���� �������
												// ��������
		}
		avgAge = sum / studentik.length;
		return avgAge;
	}

	public int coutStudIn2015() {
		int countTel = 0;
		for (int i = 0; i < studentik.length; i++) {
			if (studentik[i].getSudentAddindate() == 2015){
				 // 1. ������� ������ �� �����. 2 �������� ���� ����������
					// ������� �������� � ���������� ����� �� 2015
			countTel++;
		}
		}
		return countTel;
	}

	public int countYearMaxSudentAdd() {   // ���������� ������ ���� ��� ��������� � ������, �� ����������� �������
		int coutSameYears = 0;
		int year = studentik[0].getSudentAddindate();
		for (int i = 0; i < studentik.length; i++) {
			if (year == studentik[i].getSudentAddindate()) {

				coutSameYears++;
			}
		}
		return coutSameYears;

	}

	public int nameYearMaxSudentAdd() {
		int year = studentik[0].getSudentAddindate();
		int nameYear = 0;
		for (int i = 0; i < studentik.length; i++) {
			if (year == studentik[i].getSudentAddindate()) {
				nameYear = studentik[i].getSudentAddindate();
			}
		}
		return nameYear;

	}

}
