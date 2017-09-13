import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
class student
{
static String[] name=new String[100];
static String[]     dob=new String[100];
static int[]   marks=new int[100];

static int temp;
public static void main(String aa[])
{

int n=1;

while(n!=0)
{

    System.out.print(" 1.insert student details\n2.display student details \n 3.getstudent details by bithdate    \n 4.convert date to age   ");
    Scanner sn=new Scanner(System.in);

    n=sn.nextInt();

     if(n==1)
      {
    
    setstudent();  
      }

     if(n==2)
      {
       getstudent();
      }
     if(n==3)
      {
       getbybirthdate();
      } 
    if(n==4)
      {
      getbyage();
       }
    
}
}//main function ends



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