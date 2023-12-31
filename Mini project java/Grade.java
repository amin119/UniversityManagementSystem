public class Grade {
    private Course course;
    private Student student;
    private int gradeValue;
    public Grade (Course course, Student student){
        this.course=course;
        this.student=student;
        this.gradeValue=-1;
    }
    public void setGradeValue(int value){
        this.gradeValue=value;
    }
    public int getGradeValue(){
        return gradeValue;
    }
    public Course getCourse(){
        return course;
    }
    public Student getStudent(){
        return student;
    }
}
