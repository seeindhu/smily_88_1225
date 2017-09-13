public class Main {

	public static void main(String[] args) {
        system.out.println("student details.");
class Main
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
   if(n==5)
{
getbyavgmarks();
}
    
}
}//main function ends
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
	}

}
