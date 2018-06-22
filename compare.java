import java.util.ArrayList;
import java.util.Collections;
//import java.util.Comparator;
public class compare{
public static void main(String[] args)
{
	Student c=new Student(1,"Anjali",19);
	Student c1=new Student(2,"Akshit",15);
	Student c2=new Student(3,"Aastha",21);
	Student c3=new Student(4,"Prashansa",19);
	ArrayList<Student>list=new ArrayList<Student>();
	list.add(c);
	list.add(c1);
	list.add(c2);
	list.add(c3);
	Collections.sort(list);
	for(Student a:list)
	{
		System.out.println("Rollno="+a.id+" "+"Name="+a.name+" "+"Age="+a.age);
	}
}
}
class Student implements Comparable<Student>
{
	int id;
	String name;
	int age;
	Student(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	public int compareTo(Student s)
	{
		int compareName=name.compareTo(s.name);
		if((age>s.age)&&(compareName==0))
			return 1;
		else 
			return -1;
	}
}
