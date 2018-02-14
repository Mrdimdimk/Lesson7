package by.vashkevich.StudGroup;

public class Group {
	private String title;
	private Student[] studentik; // массив из студентов
	private int studentCounter =0;

	public void setStudentsArray(Student[] studentik) { // добавляем массив
														// студентов
		if (studentik != null) {
			this.studentik = studentik;
		}

	}

	public Student[] getStudents() { // получить информацию о студенте
		return this.studentik;
	}

	public void addStudetInGroup(Student student) { // добавляем студента в
													// массив
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

	public int avgStudAge() { // считаем средний возраст студентов
		int avgAge;
		int sum = 0;
		for (int i = 0; i < studentik.length; i++) {
			sum += studentik[i].getSudentAge(); // 1. создаем ссылку на обект. 2
												// вызываем возр каждого
												// студента
		}
		avgAge = sum / studentik.length;
		return avgAge;
	}

	public int coutStudIn2015() {
		int countTel = 0;
		for (int i = 0; i < studentik.length; i++) {
			if (studentik[i].getSudentAddindate() == 2015){
				 // 1. создаем ссылку на обект. 2 вызываем дату зачисления
					// каждого студента и сравниваем равно ли 2015
			countTel++;
		}
		}
		return countTel;
	}

	public int countYearMaxSudentAdd() {   // перебираем массив если год совпадает с первым, то увеличиваем счётчик
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
