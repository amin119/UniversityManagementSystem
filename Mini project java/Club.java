import java.util.ArrayList;
import java.util.List;

public class Club {
    private String clubName;
    private List<Student> members;
    private Teacher advisor;
    public Club(String clubName,Teacher advisor){
        this.clubName=clubName;
        this.advisor=advisor;
        this.members=new ArrayList<>();

    }
    public void addMember(Student student){
        members.add(student);
        System.out.println(student.getFisrtName() + " has joined "+clubName+" sucessfully");
    }
    public void removeMember(Student student){
        if(members.remove(student)){
            System.out.println(student.getFisrtName() +" has been removed from this club sucessfully");
        }else{
            System.out.println(student.getFisrtName() +" is not a member from the beginning");
        }
    }
    public void viewMembers(){
        System.out.println("-----------Members of "+clubName+ ":----------");
        for(Student member : members){
            System.out.println(member.getFullName());
        }
    }
    public void setAdvisor(Teacher advisor){
        this.advisor=advisor;
    }
    public void displayClubDetails(){
        System.out.println("Club Name : "+clubName);
        System.out.println("Advisor : "+advisor.getFullName());
        System.out.println("Members : "+members.size());

    }
    public String getClubName(){
        return clubName;
    }
    public List<Student> getMembers(){
        return members;
    }
    public Teacher getAdvisor(){
        return advisor;
    }
}
