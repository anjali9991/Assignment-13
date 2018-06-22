
import java.util.ArrayList;
import java.util.Collections;
public class compare{
public static void main(String[] args)
{
	Person c=new Person(1,"Anjali",19);
	Person c1=new Person(2,"Akshit",15);
	Person c2=new Person(3,"Aastha",21);
	Person c3=new Person(4,"Prashansa",19);
	ArrayList<Person>list=new ArrayList<Person>();
	list.add(c);
	list.add(c1);
	list.add(c2);
	list.add(c3);
	Collections.sort(list);
	for(Person a:list)
	{
		System.out.println("Rollno="+a.id+" "+"Name="+a.name+" "+"Age="+a.age);
	}
}
}
class Person implements Comparable<Person>
{
	int id;
	String name;
	int age;
	Person(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	public int compareTo(Person s)
	{
		int compareName=name.compareTo(s.name);
		if((age>s.age)&&(compareName==0))
			return 1;
		else 
			return -1;
	}
}