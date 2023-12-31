import java.util.Scanner;

public class Exam {
    private int idExam;
    private String examName;
    private int idCourse;
    private int idStudent;
    private int grade;
    public Exam(){}
    public Exam(int idExam,String examName,int idCourse,int idStudent,int grade){
        this.idExam=idExam;
        this.examName=examName;
        this.idCourse=idCourse;
        this.idStudent=idStudent;
        this.grade=grade;
    }
    public int getIdExam(){
        return idExam;
    }
    public String getExamName(){
        return examName;
    }
    public int getIdCourse(){
        return idCourse;
    }
    public int getIdStudent(){
        return idStudent;
    }
    public int getGrade(){
        return grade;
    }
    public void setExam(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ID : ");
        this.idExam=sc.nextInt();
        System.out.println("Exam Name : ");
        this.examName=sc.nextLine();
        System.out.println("ID Course : ");
        this.idCourse=sc.nextInt();
        System.out.println("ID Student : ");
        this.idStudent=sc.nextInt();
        System.out.println("Grade : ");
        this.grade=sc.nextInt();
    }
    public void setGrade(int grade){
        this.grade=grade;
    }
    public void DisplayExam(){
        System.out.println("ID : "+idExam);
        System.out.println("Exam Name : "+examName);
        System.out.println("ID Course : "+idCourse);
        System.out.println("ID Student : "+idStudent);
        System.out.println("Grade : "+grade);
    }


}
