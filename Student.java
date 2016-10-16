import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
import java.io.*;
/**
 * This is a class to define the necessary attributes and methods to conceptualize a "Student"
 * The spepcific tasks are:
 * 1. Instiate 
 * 
 * @author MD Abdul Alim 
 * @version 13.10.2016
 */

public class Student{
	static Scanner myScanner = new Scanner(System.in);
    // Declare the important attributes of a student. For example:
    //1.Id
    //2. Name
    //3. Department
    //4. University
    //5. GPAs in various terms (Multidimensional arrays)
    //6. subjects for Current terms
    //7. Credits and grades of Current Terms (Multidimmentional Array)
    int id;
    String name,deptName,universityName;
    double cgpa;
    double[][] gpa;
    String[] subjects;
  //  double[][][] credits;
    //double[][][] grades;
    
    
    

    /**
     * Define a constructor that initilize the default properties of the Student
     */
    public Student(){
        // initialise   variables with defult values
    	id = 0;
    	name = null;
    	deptName = null;
    	universityName = null;
    	gpa = new double[6][6];
    //	credits = new double[8][8][10];
    	//grades = new double[8][8][10];
        
    }
    /**
     * Define a method to print the students details.
     */
    
    public void studentDetailsById(){
        //write your code here
    	prln("ID : "+id);
    	prln("Name : "+name);
    	prln("Depertment : "+deptName);
    	prln("University : "+universityName);

    }
    
    /**
     * Define a method to update information of students by ID
     * Use as many arguments as required.
     */
    public void updateStudentById(int id){
        //Write your code here
    	this.id = id;
    //	input.nextLine();
    	pr("Enter name : ");
    	name = myScanner.nextLine();
    	pr("Enter University name : ");
    	universityName = myScanner.nextLine();
    	pr("Enter Department name : ");
    	deptName = myScanner.nextLine();   	 
    }
    
    /**
     * Define a method to compute the CGPA from the Given term GPA for a particular student.
     * se as many arguments as required.
     */
    public double computeCGPAByID(){
        // Write your code here
    	
    	for(int i=1;i<=8;i++)
    	{
    		prln("Enter GPA of Sem " + i +" : ");
    		cgpa += myScanner.nextDouble();
    	}
    	return cgpa/8;
    }
    
    /**
     * Define a method to compute the GPA from the given Credits and Grades of all the subjects
     */
    public double computeGPAById(){
        //write yor code here
     return 0.0;
    }
    
    /**
     * After performing required operations on each student, save the information to a file. Use File and PrintWriter Class. 
     * use as many arguments as required.
     * 
     */
  public void saveStudent() throws IOException
    {
	  
    }
    /**
     * Create a dummy files with infromations to describe the properties of a Student object and load the data files using Java File and Scanner class.
     * use as many arguments as required.
     */
    public void loadStudents(){
        //Write your code here
        
    }
    
    /**
     * The tasks to be carried out here:
     * 1. Create an Arrays of students using Student Class. Initlize them and perfom all the above defined operation to evualuate your code.
     * use as many arguments as required.
     */
    public static void main(String[] args){
    	int n,iD;
    	double cgpa;
    	
        //Write your main function to execute call defined methods
    	  prln("Give the number of students :");
    	n = myScanner.nextInt();
    	Student[] student = new Student[n];
    	for (int i = 1; i <= n; i++) {
            prln("-----Update Student " + i +" Information");
    		prln("Enter ID no : ");
    		iD = myScanner.nextInt();
    		student[i] = new Student();
    		try {
				student[i].updateStudentById(iD);
				student[i].studentDetailsById();
				//student[i].saveStudent();
				cgpa = student[i].computeCGPAByID();
	              prln("CGPA is : "+cgpa);
			} catch (Exception e) {
				
			}
		}
    }
    
    static void prln(Object anyObject){
    	System.out.println(anyObject);
    }
    static void pr(Object anyObject){
    	System.out.print(anyObject);
    }
}
