import java .util.Map;
import java.util.HashMap;
import java.util.Scanner;
public class datee {
public static Map<String,String>dd=new HashMap<String,String>();
public static Map<String,String>mm=new HashMap<String,String>();
public static Map<String,String>yy=new HashMap<String,String>();
public static void setdate()
{
	dd.put("01","One");
	dd.put("02","Two");
	dd.put("03","Three");
	dd.put("04","Four");
	dd.put("05","Five");
	dd.put("06","Six");
	dd.put("07","Seven");
	dd.put("08","Eight");
	dd.put("09","Nine");
	dd.put("10","Ten");
	dd.put("11","Eleven");
	dd.put("12","Twelve");
	dd.put("13","Thirteen");
	dd.put("14","Fourteen");
	dd.put("15","Fifteen");
	dd.put("16","Sixteen");
	dd.put("17","Seventeen");
	dd.put("18","Eighteen");
	dd.put("19","Nineteen");
	dd.put("20","Tweenty");
	dd.put("21","Twenty-first");
	dd.put("22","Twenty-second");
	dd.put("23","Twenty-third");
	dd.put("24","Twenty-fourth");
	dd.put("25","Twenty-fifth");
	dd.put("26","Twenty-sixth");
	dd.put("27","Twenty-seventh");
	dd.put("28","Twenty-eighth");
	dd.put("29","Twenty-ninth");
	dd.put("30","Thirty");
	dd.put("31","Thirty-one");
	
	mm.put("01","January");
	mm.put("02","Februry");
	mm.put("03","March");
	mm.put("04","April");
	mm.put("05","May");
	mm.put("06","June");
	mm.put("07","July");
	mm.put("08","August");
	mm.put("09","September");
	mm.put("10","October");
	mm.put("11","Novemeber");
	mm.put("12","Decemeber");
	
	yy.put("1990","nineteen thousand ninty");
	yy.put("1991","nineteen thousand ninety-one");
	yy.put("1992","nineteen thousand ninety-two");
	yy.put("1993","nineteen thousand ninety-three");
	yy.put("1994","nineteen thousand ninty-four");
	yy.put("1995","nineteen thousand ninty-five");
	yy.put("1996","nineteen thousand ninty-six");
	yy.put("1997","nineteen thousand ninty-seven");
	yy.put("1998","nineteen thousand ninty-eight");
	yy.put("1999","nineteen thousand ninty-nine");
	yy.put("2000","two thousand");
	yy.put("2001","two thousand one");
	yy.put("2002","two thousand two");
	yy.put("2003","two thousand three");
	yy.put("2004","two thousand four");
	yy.put("2005","two thousand five");
	yy.put("2006","two thousand six");
	yy.put("2007","two thousand seven");
	yy.put("2008","two thousand eight");
	yy.put("2009","two thousand nine");
	yy.put("2010","two thousand ten");
	yy.put("2011","two thousand eleven");
	yy.put("2012","two thousand twelve");
	yy.put("2013","two thousand thirteen");
	yy.put("2014","two thousand fourteen");
	yy.put("2015","two thousand fifteen");
	yy.put("2016","two thousand sixteen");
	yy.put("2017","two thousand seventeen");
	yy.put("2018","two thousand eighteen");
}
public static void convert(String date)
{
	String d,m,y;
	d=date.substring(0,2);
	m=date.substring(3,5);
	y=date.substring(6,10);
	System.out.print(dd.get(d)+" "+mm.get(m)+" "+yy.get(y));
}
public static void main(String[] args)
{
	String date;
	setdate();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter date int the format date/month/year");
	date=sc.nextLine();
	sc.close();
	convert(date);
}
}
