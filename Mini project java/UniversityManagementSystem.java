import java.util.Scanner;

public class UniversityManagementSystem {
    private static Scanner sc = new Scanner(System.in);
    private static History universityHistory = new History();
    private static Teacher loggedInTeacher = null;
    private static Student loggedInStudent = null;
    private static void displayMainMenu() {
        System.out.println("-----------University Management System Menu------------");
        System.out.println("Log In as Teacher : 1");
        System.out.println("Log In as Student : 2");
        System.out.println("Log Out : 3");
        System.out.println("Manage Personal Information : 4");
        System.out.println("View Grades and Enrolled Courses : 5");
        System.out.println("Explore University Entities : 6");
        System.out.println("Exit : 7");
    }
    private static int getUserChoice() {
        System.out.print("Enter your choice: ");
        return sc.nextInt();
    }
    public static void main(String[] args) {
        while (true){
            displayMainMenu();
            int choice = getUserChoice();

            switch (choice) {
                case 1:
                    teacherLogin();
                    break;
                case 2:
                    studentLogin();
                    break;
                case 3:
                    logout();
                    break;
                case 4:
                    if (loggedInTeacher != null || loggedInStudent != null) {
                        personalManagementMenu();
                    } else {
                        System.out.println("Please log in first.");
                    }
                    break;
                case 5:
                    if (loggedInTeacher != null || loggedInStudent != null) {
                        gradesAndCoursesMenu();
                    } else {
                        System.out.println("Please log in first.");
                    }
                    break;
                case 6:
                    if (loggedInTeacher != null || loggedInStudent != null) {
                        universityEntitiesMenu();
                    } else {
                        System.out.println("Please log in first.");
                    }
                    break;
                case 7:
                    System.out.println("Exiting University Management System. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
    private static void teacherLogin() {
        Teacher teacher = new Teacher();
        teacher.login();
        if (teacher.isLoggedIn()){
            loggedInTeacher=teacher;
            System.out.println("Teacher login has been successful");
        }else{
            System.out.println("Teacher login has failed");}
    }
    private static void studentLogin() {
        Student student = new Student();
        student.login();
        if (student.isLoggedIn()){
            loggedInStudent=student;
            System.out.println("Student login has been successful");
        }else{
            System.out.println("Student login has failed");}
    }
    private static void logout() {
        if (loggedInTeacher != null) {
            System.out.println("Logging out teacher " + loggedInTeacher.getFullName() + "...");
            loggedInTeacher.logout();
            loggedInTeacher = null;
        } else if (loggedInStudent != null) {
            System.out.println("Logging out student " + loggedInStudent.getFullName() + "...");
            loggedInStudent.logout();
            loggedInStudent = null;
        } else {
            System.out.println("No user is currently logged in.");
            return;
        }
    }
    private static void personalManagementMenu() {
        while (true) {
            System.out.println("------Personal Management Menu-------");
            System.out.println("Update Profile : 1");
            System.out.println("Change Password : 2");
            System.out.println("Back to Main Menu : 3 ");
            int choice = getUserChoice();
            switch (choice) {
                case 1:
                    if(loggedInTeacher!=null){
                        loggedInTeacher.setTeacher();
                    }else{
                        loggedInStudent.setStudent();
                    }
                    System.out.println("Update profile logic goes here.");
                    break;
                case 2:
                    if(loggedInTeacher!=null){
                        System.out.println("Enter new password : ");
                        String password = sc.nextLine();
                        loggedInTeacher.setPassword(password);
                    }else{
                        System.out.println("Enter new password : ");
                        String password = sc.nextLine();
                        loggedInStudent.setPassword(password);
                    }
                    System.out.println("Password has changed sucessfully.");
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
    private static void gradesAndCoursesMenu() {
        while (true) {
            System.out.println("------------Grades and Courses Menu--------------");
            System.out.println("View  Grades : 1");
            System.out.println("View Courses : 2");
            System.out.println("Back to Main Menu : 3");
            int choice = getUserChoice();
            switch (choice) {
                case 1:
                    if (loggedInStudent!=null){
                        loggedInStudent.viewGrades();
                    }else{
                        Student student = new Student();
                        Course course = new Course();
                        student.setStudent();
                        course.setCourse();
                        System.out.println("Enter the grade : ");
                        int grade = sc.nextInt();
                        loggedInTeacher.assignGrades(student,course,grade);;
                    }
                    break;
                case 2:
                    if (loggedInStudent!=null){
                        System.out.println("View courses : 1 ");
                        System.out.println("Enroll courses : 2 ");
                        int choice2 = getUserChoice();
                        if (choice2==1){
                            loggedInStudent.viewCourses(); 
                        }else{  
                            Course course = new Course();
                            course.setCourse();
                            loggedInStudent.enrollInCourse(course);
                        }
                    }else{
                        System.out.println("View courses : 1 ");
                        System.out.println("Add courses : 2 ");
                        System.out.println("Remove courses : 3 ");
                        int choice2 = getUserChoice();
                        if (choice2==1){
                            loggedInTeacher.viewCourses();
                        }else if (choice2==2){
                            Course course = new Course();
                            course.setCourse();
                            loggedInTeacher.addCourse(course);
                        }else{
                            Course course = new Course();
                            course.setCourse();
                            loggedInTeacher.removeCourse(course);
                        }
                    }
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void universityEntitiesMenu() {
        while (true) {
            System.out.println("--------University Entities Menu--------");
            System.out.println("Display All Students : 1");
            System.out.println("Display All Teachers : 2");
            System.out.println("Display All Courses : 3");
            System.out.println("Display All Classrooms : 4");
            System.out.println("Display All Clubs : 5");
            System.out.println("Display All Exams : 6");
            System.out.println("Display All Grades : 7");
            System.out.println("Back to Main Menu : 8");

            int choice = getUserChoice();

            switch (choice) {
                case 1:
                    universityHistory.displayAllStudents();
                    break;
                case 2:
                    universityHistory.displayAllTeachers();
                    break;
                case 3:
                    universityHistory.displayAllCourses();
                    break;
                case 4:
                    universityHistory.displayAllClassrooms();
                    break;
                case 5:
                    universityHistory.displayAllClubs();
                    break;
                case 6:
                    universityHistory.displayAllExams();
                    break;
                case 7:
                    universityHistory.displayAllGrades();
                    break;
                case 8:
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}