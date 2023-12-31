import java.util.ArrayList;
import java.util.List;

public class Level {
    private int levelNumber;
    private List<Course> courses;
    private List<Student> students;
    private List<Teacher> teachers;
    public Level(int levelNumber){
        this.levelNumber=levelNumber;
        this.courses=new ArrayList<>();
        this.students=new ArrayList<>();
        this.teachers=new ArrayList<>();
    }
    public int getLevelNumber(){
        return levelNumber;
    }
    public List<Course> getCourses(){
        return courses;
    }
    public List<Student> getStudents(){
        return students;
    }
    public List<Teacher> getTeachers(){
        return teachers;
    }
    public void addCourse(Course course){
        courses.add(course);
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }
    public void removeCourse(Course course){
        courses.remove(course);
    }
    public void removeStudent(Student student){
        students.remove(student);
    }
    public void removeTeacher(Teacher teacher){
        teachers.remove(teacher);
    }
    public void displayLevelDetails(){
        System.out.println("Level Number : "+levelNumber);
        System.out.println("Courses : ");
        for(Course course : courses){
            System.out.println(course.getCourseName());
        }
        System.out.println("Students : ");
        for(Student student : students){
            System.out.println(student.getFullName());
        }
        System.out.println("Teachers : ");
        for(Teacher teacher : teachers){
            System.out.println(teacher.getFullName());
        }
    }
    
}
