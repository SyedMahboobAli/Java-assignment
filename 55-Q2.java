import java.io.*;
import java.util.*;
import java.util.Scanner;
 
class Student
{
    String name;
    String emailid;
    int phno;
    int rollno; 
    public Student(String name, int phno, int rollno,String emailid) 
    {
        this.name = name;
        this.rollno = rollno;
        this.emailid = emailid;
        this.phno = phno;
    }
}
 
class nameCompare implements Comparator<Student>
{
    public int compare(Student s1, Student s2)
    {
        return s1.name.compareTo(s2.name);
    }
}
 
 
class phnoCompare implements Comparator<Student>
{

    public int compare(Student s1, Student s2)
    {
        return s2.phno - s1.phno;
    }
}
 
public class SortTextFile
{
    public static void main(String[] args)throws IOException
    {
        Scanner myInput = new Scanner( System.in );
        System.out.println("Enter Student details:");
        
        BufferedWriter writer1 = new BufferedWriter(new FileWriter("C:\\Users\\HOME\\Desktop\\1234\\input.txt"));
         myInput.nextlines();
         writer1.close();

        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\HOME\\Desktop\\1234\\input.txt"))
         
        ArrayList<Student> studentRecords = new ArrayList<Student>();
         
        String currentLine = reader.readLine();
         
        while (currentLine != null)
        {
            String[] studentDetail = currentLine.split(" ");
             
            String name = studentDetail[0];
             
            int  = Integer.valueOf(studentDetail[1]);
             
            studentRecords.add(new Student(name, phno));
             
            currentLine = reader.readLine();
        }
         
         
        Collections.sort(studentRecords, new phnoCompare());
         
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\HOME\\Desktop\\1234\\output.txt"));
         
         
        for (Student student : studentRecords) 
        {
            writer.write(student.name);
             
            writer.write(" "+student.phno);
             
            writer.newLine();
        }
         
        reader.close();
         
        writer.close();
    }
}