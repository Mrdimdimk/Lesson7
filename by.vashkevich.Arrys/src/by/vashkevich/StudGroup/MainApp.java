package by.vashkevich.StudGroup;


public class MainApp {

	public static void main(String[] args) {
		
Student stud0 = new Student("Hellp", 18, 2015);
Student stud1 = new Student("Me", 20, 2016);
Student stud2 = new Student("Please", 50, 2015);
Student stud3 = new Student("It's", 20, 2015);
Student stud4 = new Student("Hard", 666, 2016);
//Student stud5 = new Student("Insaine", 2000, 2017);

System.out.println(stud0.getSudentName()+ "  "+stud0.getSudentAge());
System.out.println(stud1.getSudentName()+ "  "+stud1.getSudentAge());
System.out.println(stud2.getSudentName()+ "  "+stud2.getSudentAge());
System.out.println(stud3.getSudentName()+ "  "+stud3.getSudentAge());
System.out.println(stud4.getSudentName()+ "  "+stud4.getSudentAge());

Group gr1 = new Group();

gr1.addStudetInGroup(stud0);
gr1.addStudetInGroup(stud1);
gr1.addStudetInGroup(stud2);
gr1.addStudetInGroup(stud3);
gr1.addStudetInGroup(stud4);
//gr1.addStudetInGroup(stud5);

System.out.println("—редний возраст студентов : "+gr1.avgStudAge()+ "г." + " OK");
System.out.println(" оличество студентов зачисленных в 2015г. : "+gr1.coutStudIn2015());
System.out.println("√од в котором зачисленно максимальное число студентов : " +gr1.nameYearMaxSudentAdd());
System.out.println(" оличество студентов в этот год : " + gr1.countYearMaxSudentAdd() + " OK");

	}

}
