import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Events {
    private String eventName;
    private LocalDateTime eventDateTime;
    private String location;
    private List<Student> attendees;
    private Student projectManager;
    private Club clubOrganizer;
    public Events(String eventName, LocalDateTime eventDateTime, String location, Student projectManager) {
        this.eventName = eventName;
        this.eventDateTime = eventDateTime;
        this.location = location;
        this.projectManager = projectManager;
        this.attendees = new ArrayList<>();
    }
    public void addAttendee(Student student){
        attendees.add(student);
        System.out.println("You has registered for the event sucessfully");
    }
    public void removeAttendee(Student student) {
        if (attendees.remove(student)) {
            System.out.println("You has canceled their registration for the event: " + eventName);
        } else {
            System.out.println("You are not registered for the event: " + eventName);
        }
    }
    public void setClubOrganizer(Club club){
        this.clubOrganizer=club;
        System.out.println(club.getClubName()+" will be the organizer of the event : "+ eventName);
    }
    public void displayEventDetails(){
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Event Name : "+eventName);
        System.out.println("Event Date and Time  :"+formatter.format(eventDateTime));
        System.out.println("Location : "+location);
        System.out.println("Project Manager : "+projectManager.getFullName());
        System.out.println("Number of Attendees : "+attendees.size());

    }
    public String getEventName(){
        return eventName;
    }
    public String getLocation(){
        return location;
    }
    public LocalDateTime getEventDateTime(){
        return eventDateTime;
    }
    public List<Student> getAttendees(){
        return attendees;
    }   
    public Student getProjectManager(){
        return projectManager;
    }
    public Club getClubOrganizer(){
        return clubOrganizer;
    }
    
}
