import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Course {
    private int courseCode;
    private String courseName;
    private int creditHours;
    private List<Teacher> teachers_list;
    private List<Student> enrolled_students;
    public Course(){}
    public Course(int courseCode,String courseName,int creditHours){
        this.courseCode=courseCode;
        this.courseName=courseName;
        this.creditHours=creditHours;
        this.teachers_list=new ArrayList<>();
        this.enrolled_students=new ArrayList<>();
    }
    public int getCourseCode (){
        return courseCode;
    }
    public String getCourseName(){
        return courseName;
    }
    public int getCreditHours(){
        return creditHours;
    }
    public List<Teacher> getTechersList(){
        return teachers_list;
    }
    public List<Student> getEnrolledStudents(){
        return enrolled_students;
    }
    public void setCourse(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Course Code : ");
        this.courseCode=sc.nextInt();
        System.out.println("Course Name : ");
        this.courseName=sc.nextLine();
        System.out.println("Credit Hours : ");
        this.creditHours=sc.nextInt();
    }
    public void addTeacher(Teacher teacher){
        teachers_list.add(teacher);
        System.out.println(teacher.getFullName()+" added to "+courseName +"sucessfully");
    }
    public void removeTeacher(Teacher teacher){
        teachers_list.remove(teacher);
        System.out.println(teacher.getFullName()+" removed from "+courseName+"sucessfully");
    }
    public void addStudent(Student student){
        enrolled_students.add(student);
        System.out.println(student.getFullName()+" added to "+courseName +"sucessfully");
    }
    public void removeStudent(Student student){
        enrolled_students.remove(student);
        System.out.println(student.getFullName()+" removed from "+courseName+"sucessfully");
    }
    public void displayCourseDetails(){
        System.out.println("---------Course details--------- ");
        System.out.println("Course Code :"+courseCode);
        System.out.println("Course Name : "+courseName);
        System.out.println("Teachers of this Course : ");
        for (Teacher teacher : teachers_list){
            System.out.println(teacher.getFullName());
        }
    }
}
