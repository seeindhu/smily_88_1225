import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
	for(int i=0;i<temp;i++)
        {
	System.out.println("\n\n");
	System.out.println("student name ="+name[i]);
	System.out.println("student date of birth ="+dob[i]);
	System.out.println("student marks = "+marks[i]);
	System.out.println("\n\n");
}
}        

		// Add your implementation here
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
	static void setstudent()
        {
	Scanner sn=new Scanner(System.in);
	System.out.print("enter student name");
        name[temp]=sn.next();
	System.out.print(" enter student date of birth  ");
	dob[temp]=sn.next();
	System.out.print(" enter student marks  ");
	marks[temp]=sn.nextInt();
temp++;
   }

		// Add your implementation here
	}

	@Override
	public Student getStudent(int index) {
	static void getstudent()
	{

	for(int i=0;i<temp;i++)
	{
	System.out.print("\n\n");
	("student name = "+name[i]);
	System.out.println("student date of birth = "+dob[i]);
	System.out.println("student marks = "+marks[i]);
	System.out.print("\n\n");


	}

	}
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
	
        
 	static void setstudent()
  	{

   	 Scanner sn=new Scanner(System.in);

	 System.out.print(" enter student name  ");

   	name[temp]=sn.next();

 	System.out.print(" enter student date of birth  ");

   	dob[temp]=sn.next();


 	System.out.print(" enter student marks  ");

   	marks[temp]=sn.nextInt();



	temp++;
   }
		// Add your implementation here
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}

 static void setstudent()
  {

    Scanner sn=new Scanner(System.in);

 System.out.print(" enter student name  ");

   name[temp]=sn.next();

 System.out.print(" enter student date of birth  ");

   dob[temp]=sn.next();


 System.out.print(" enter student marks  ");

   marks[temp]=sn.nextInt();



temp++;
   }

static void getstudent()
{

for(int i=0;i<temp;i++)
{
System.out.print("\n\n");
System.out.println("student name = "+name[i]);
System.out.println("student date of birth = "+dob[i]);
System.out.println("student marks = "+marks[i]);
System.out.print("\n\n");


}

}


static void getbybirthdate()
{
String d=new String();
Scanner sn=new Scanner(System.in);
d=sn.next();
for(int i=0;i<temp;i++)
{

//if(d.compareTo(dob[i])==0)
if(d.equals(dob[i]))
{
System.out.print("\n\n");
System.out.println("student name = "+name[i]);
System.out.println("student date of birth = "+dob[i]);
System.out.println("student marks = "+marks[i]);
System.out.print("\n\n");
}

}

}
////////////////////

static void getbyage()
{
for(int i=0;i<temp;i++)
{
String datetext = dob[i]; // Date in text


try {
      Calendar birth = new GregorianCalendar();
      Calendar today = new GregorianCalendar();
      int age = 0;
      int factor = 0; //to correctly calculate age when birthday has not been yet celebrated
      Date birthDate = new SimpleDateFormat("MM-dd-yyyy").parse(datetext);
      Date currentDate = new Date(); //current date
      
      birth.setTime(birthDate);
      today.setTime(currentDate);
      
      // check if birthday has been celebrated this year
      if(today.get(Calendar.DAY_OF_YEAR) < birth.get(Calendar.DAY_OF_YEAR)) {
            factor = -1; //birthday not celebrated
      }
      age = today.get(Calendar.YEAR) - birth.get(Calendar.YEAR) + factor;
System.out.print("\n\n");
System.out.println("student name = "+name[i]);
System.out.println("student date of birth = "+dob[i]);
System.out.println("student marks = "+marks[i]);
System.out.println("AGE (years): "+age);

System.out.print("\n\n");

} catch (Exception e) {
      System.out.println("Given date: "+datetext+ " not in expected format (Please enter a MM-DD-YYYY date)");
}
}
}

static void nearbybirth()
{
Scanner sn=new Scanner(System.in);
int i=sn.nextInt();
String abc=sn.next();
Date date = new Date();
		System.out.println("Todays date: "+date.toString());
		//test addDays method
		int k=i;
		//while(i<=k){
			Date newDate = addDays(date, i);
			System.out.println("Java Date after adding "+i+" days: "+newDate.toString());
			//i+=10;
		//}
		System.out.println("\n\n");
		//test subtractDays method
	
	//	while(i<=k){
	//		Date newDate = subtractDays(date, 10);
	//		System.out.println("Java Date after subtracting "+i+" days: "+newDate.toString());
	//		i+=10;
	//	}

	
}
public static Date addDays(Date date, int days) {
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(date);
		cal.add(Calendar.DATE, days);
				
		return cal.getTime();
	}
	
	/**
	 * subtract days to date in java
	 * @param date
	 * @param days
	 * @return
	 */
	public static Date subtractDays(Date date, int days) {
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(date);
		cal.add(Calendar.DATE, -days);
				
		return cal.getTime();
	}
}//class ends
