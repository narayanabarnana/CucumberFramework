package javaNotes;

class Student {
	
	String name="Narayana";
	int rollno=10209;
	int marks=90;
	static String collegeName="BharathiDegreeCollege";
	
	public String getStudentInfo()
	{
		System.out.println(name + "------" + marks);
		return name + "------" + marks;
	}
	
	public static String getCollgeInfo(){
		return collegeName;
	}
	
	public int getAverageMarks(int x, int y)
	{
		return (x+y)/2;
	}
	public String getStudentCompleteInfo() {
		return name + "---" + rollno + "------" + marks + " ----- " + collegeName;
	}
	
	
	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.getStudentInfo();
		getCollgeInfo();
		s1.getAverageMarks(10, 20);
		s1.getStudentCompleteInfo();
		
	}

}
