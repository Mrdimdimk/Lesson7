package by.vashkevich.StudGroup;

import by.htp.lesson7.model.Student;

public class Group {
	private String title;
	private Student[] studentik; // Array of students
	private int studentCounter = 0;

	public void setStudentsArray(Student[] studentik) { // add Array of student
														//
		if (studentik != null) {
			this.studentik = studentik;
		}

	}

	public Student[] getStudents() { // get Info about student
		return this.studentik;
	}

	public void addStudetInGroup(Student student) { // add student into Array
													//
		if (this.studentik != null) {
			if (studentCounter < studentik.length) {
				studentik[studentCounter] = student;
				studentCounter++;
			} else {
				Student[] studentik = new Student[this.studentik.length + 1];
				for (int i = 0; i < this.studentik.length; i++) {
					studentik[i] = this.studentik[i];

				}
				this.studentik = studentik;
				this.studentik[studentCounter] = student;
				studentCounter++;

			}
		} else {
			this.studentik = new Student[1];
			this.studentik[studentCounter] = student;
			studentCounter++;
		}
		// this.studentik[0] = student;

	}

	public int avgStudAge() {
		int avgAge;
		int sum = 0;
		if (this.studentik == null) {
		} else {// count average Age

			for (int i = 0; i < studentik.length; i++) {
				sum += studentik[i].getSudentAge();
			} // 1. create link on object. 2
				// call age every student

		}
		avgAge = sum / studentik.length;
		return avgAge;
	}

	public int coutStudIn2015() {
		int countTel = 0;
		for (int i = 0; i < studentik.length; i++) {
			if (studentik[i].getSudentAddindate() == 2015) {
				// 1.create link on object. 2 call date adding student in group,
				// every student and compare date 2015
				countTel++;
			}
		}
		return countTel;
	}

	public int countYearMaxSudentAdd() { // going around Array if yera ==
											// position 1 => counter ++
											//
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

	public void sortBoobles(){
		for (int i = this.studentik.length-1; i > 0 ; i--) {
			for(int j = 0 ; j < i ; j++) {
				if(this.studentik[j+1] !=null)
				if(this.studentik[j].getSudentAge() > this.studentik[j+1].getSudentAge(){
					Student promezytok = this.studentik[j];
					this.studentik[j] = this.studentik[j+1];
					this.studentik[j+1] = promezytok;
				}
				
			}
			
		}
		
	}

}
