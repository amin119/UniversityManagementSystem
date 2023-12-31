import java.util.ArrayList;
import java.util.List;

public class History {
    private List<Student> students;
    private List<Teacher> teachers;
    private List<Course> courses;
    private List<Classroom> classrooms;
    private List<Club> clubs;
    private List<Events> events;
    private List<Grade> grades;
    private List<Exam> exams;
    public History() {
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.courses = new ArrayList<>();
        this.classrooms = new ArrayList<>();
        this.clubs = new ArrayList<>();
        this.events = new ArrayList<>();
        this.grades = new ArrayList<>();
        this.exams = new ArrayList<>();
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addClassroom(Classroom classroom) {
        classrooms.add(classroom);
    }

    public void addClub(Club club) {
        clubs.add(club);
    }

    public void addEvent(Events event) {
        events.add(event);
    }

    public void addGrade(Grade grade) {
        grades.add(grade);
    }

    public void addExam(Exam exam) {
        exams.add(exam);
    }
    public List<Student> getAllStudents() {
        return students;
    }

    public List<Teacher> getAllTeachers() {
        return teachers;
    }

    public List<Course> getAllCourses() {
        return courses;
    }

    public List<Classroom> getAllClassrooms() {
        return classrooms;
    }

    public List<Club> getAllClubs() {
        return clubs;
    }

    public List<Events> getAllEvents() {
        return events;
    }
    
    public List<Grade> getAllGrades() {
        return grades;
    }
    public List<Exam> getAllExams() {
        return exams;
    }
    public void displayAllStudents() {
        System.out.println("All Students:");
        for (Student student : students) {
            System.out.println(student.getFullName());
        }
    }
    public void displayAllTeachers() {
        System.out.println("All Teachers:");
        for (Teacher teacher : teachers) {
            System.out.println(teacher.getFullName());
        }
    }
    public void displayAllCourses() {
        System.out.println("All Courses:");
        for (Course course : courses) {
            System.out.println(course.getCourseName());
        }
    }
    public void displayAllClassrooms() {
        System.out.println("All Classrooms:");
        for (Classroom classroom : classrooms) {
            System.out.println( classroom.getRoomNumber());
        }
    }
    public void displayAllClubs() {
        System.out.println("All Clubs:");
        for (Club club : clubs) {
            System.out.println(club.getClubName());
        }
    }
    public void displayAllEvents() {
        System.out.println("All Events:");
        for (Events event : events) {
            System.out.println(event.getEventName());
        }
    }
    public void displayAllGrades() {
        System.out.println("All Grades:");
        for (Student student : students) {
            System.out.println("- " + student.getFullName());
            for (Grade grade : student.getGrades()) {
                System.out.println(grade.getCourse().getCourseName() + ": " + grade.getGradeValue());
            }
        }
    }
    public void displayAllExams() {
        System.out.println("All Exams:");
        for (Exam exam : exams) {
                System.out.println(exam.getExamName() + ": " + exam.getIdCourse());
            }
        }
    }
    
