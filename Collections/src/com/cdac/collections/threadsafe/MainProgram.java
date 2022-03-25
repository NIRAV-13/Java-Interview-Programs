package com.cdac.collections.threadsafe;
import java.util.ArrayList;
// import com.cdac.collections.bean.Student;
// Applying pull up method as run() is used at both the places.
public class MainProgram
{
	public static void main(String[] args)  throws CloneNotSupportedException {

		Thread t1 = new Thread();
		Thread t2 = new Thread();
		t1.start();
		t2.start();

	}
	public void run() 
	{
		ArrayList<String> Employeenames = new ArrayList<>();
		ArrayList<String> Studentnames=  new ArrayList<>();
		for(int i=0;i<100;i++)
		{
			Employeenames.add("Employee :: "+i);
			EmployeeRunnable employeeRunnable = new EmployeeRunnable(Employeenames);
		}
		for(int j =100; j<200;j++)
		{
			Studentnames.add("Student :: "+j);
			StudentRunnable studentRunnable = new StudentRunnable(Studentnames);
		}
	}
}

