import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    private int idStudent;
    private String fisrtName;
    private String lastName;
    private String password;
    private List<Course> enrolledCourses; 
    private List<Grade> grades;
    private boolean isLoggedIn =false;
    public Student(){}
    public Student(int idStudent,String firstName,String lastName){
        this.idStudent=idStudent;
        this.fisrtName=firstName;
        this.lastName=lastName;
        this.enrolledCourses=new ArrayList<>();
        this.grades=new ArrayList<>();
        this.isLoggedIn=false;
    }
    public void setStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ID : ");
        this.idStudent=sc.nextInt();
        System.out.println("Fisrt Name : ");
        this.fisrtName=sc.nextLine();
        System.out.println("Last Name : ");  
        this.lastName=sc.nextLine();
    }
    public void setPassword(String password){
        this.password=password;
    }
    public boolean isLoggedIn(){
        return isLoggedIn;
    }
    public int getID(){
        return idStudent;
    }
    public String getFisrtName(){
        return fisrtName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getFullName(){
        return lastName+" "+fisrtName;
    }
    public boolean getIsLoggedIn(){
        return isLoggedIn;
    }
    public List<Grade> getGrades(){
        return grades;
    }
    public List<Course> getEnrolledCourses(){
        return enrolledCourses;
    }

    public void login(){
        if(isLoggedIn){
            System.out.println("You are already logged in.");
            return;
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your ID : ");
        this.idStudent = sc.nextInt();
        System.out.println("Enter your password : " );
        this.password=sc.nextLine();
        isLoggedIn=true;
        System.out.println("Welcome, "+getFullName()+" ! ");
        System.out.println("You have sucessfully logged in as a student. ");

        
    }
    public void logout(){
        if(!isLoggedIn){
            System.out.println("You are not currently logged in.");
            return;
        }

        System.out.println("GoodBye !");
        isLoggedIn=false;
        System.out.println("You have sucessfully logged out.");
    }
    public void enrollInCourse(Course course){
        enrolledCourses.add(course);
        Grade grade = new Grade(course,this);
        grades.add(grade);
        System.out.println("You've got enrolled sucessfully in the course :  "+course.getCourseName());
    }
    public void viewGrades(){
        if(enrolledCourses.isEmpty()){
            System.out.println("You are not enrolled in any courses yet. ");
        }else{
            System.out.println("----------You're grades are :---------");
            for(Grade grade : grades){
                System.out.println(grade.getCourse().getCourseName()+" : "+grade.getGradeValue());
            }
        }
    }
    public void viewCourses(){
        if(enrolledCourses.isEmpty()){
            System.out.println("You are not enrolled in any courses yet. ");
        }else{
            System.out.println("----------You're enrolled courses are :---------");
            for(Course course : enrolledCourses){
                System.out.println(course.getCourseName());
            }
        }
    }
}
