import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teacher {
    private int idTeacher;
    private String firstName;
    private String lastName;
    private String password;
    private List<Course> courses_list;
    private boolean isLoggoedIn =false;
    public Teacher(){}
    public Teacher(int idTeacher,String firstName,String lastName){
      this.idTeacher=idTeacher;
      this.firstName=firstName;
      this.lastName=lastName;
      this.courses_list=new ArrayList<>();  
    }
    public void assignGrades(Student student,Course course,int grade){
        if(courses_list.contains(course)){
            Grade studentGrade=findGrade(student,course);
            if (studentGrade!=null){
                studentGrade.setGradeValue(grade);
                System.out.println("Grade assigned to "+student.getFullName()+" for "+course.getCourseName());
            }else{
                System.out.println(student.getFullName()+" is not enrolled in this course ");
            }
        }else {
            System.out.println("You are not teaching "+course.getCourseName());
        }
    }
    private Grade findGrade(Student student,Course course){
        for (Student enrollStudent : course.getEnrolledStudents()){
            if (enrollStudent.equals(student)){
                for(Grade grade : student.getGrades()){
                    if (grade.getCourse().equals(course)){
                        return grade;
                    }
                }
            }
        }
        return null;
    }
    public void viewCourses(){
        System.out.println("Courses taught by "+getFullName()+" : ");
        for (Course course : courses_list){
            System.out.println(course.getCourseName());
        }
    }
    public String getFullName(){
        return lastName.toUpperCase()+" "+firstName;
    }
    public int getId(){
        return idTeacher;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public void addCourse(Course course){
        courses_list.add(course);
        System.out.println("Course "+course.getCourseName()+" added sucessfully");
    }
    public void removeCourse(Course course){
        courses_list.remove(course);
        System.out.println("Course "+course.getCourseName()+" removed sucessfully");
    }
    public void displayTeacherDetails(){
        System.out.println("---------Teacher Details---------");
        System.out.println("ID : "+idTeacher);
        System.out.println("Full Name : "+getFullName());
        System.out.println("Courses : ");
        for (Course course : courses_list){
            System.out.println(course.getCourseName());
        }
    }
    public void setTeacher(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ID : ");
        this.idTeacher=sc.nextInt();
        System.out.println("First Name : ");
        this.firstName=sc.nextLine();
        System.out.println("Last Name : ");
        this.lastName=sc.nextLine();
    }
    public boolean isLoggedIn(){
        return isLoggoedIn;
    }
    public List<Course> getCoursesList(){
        return courses_list;
    }
    public void login(){
        if(isLoggoedIn){
            System.out.println("You are already logged in.");
            return;
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your ID : ");
        this.idTeacher = sc.nextInt();
        System.out.println("Enter your password : " );
        this.password=sc.nextLine();
        isLoggoedIn=true;
        System.out.println("Welcome, "+getFullName()+" ! ");
        System.out.println("You have sucessfully logged in as a teacher. ");

        
    }
    public void logout(){
        if(!isLoggoedIn){
            System.out.println("You are not currently logged in.");
            return;
        }

        System.out.println("GoodBye !");
        isLoggoedIn=false;
        System.out.println("You have sucessfully logged out.");
    }
}
