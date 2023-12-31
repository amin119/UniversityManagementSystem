public class Classroom {
    private String roomNumber;
    private int capacity;
    private boolean isAvailable;

    public Classroom(String roomNumber,int capacity){
        this.roomNumber=roomNumber;
        this.capacity=capacity;
        this.isAvailable=true;

    }
    public void checkAvailability(){
        System.out.println("Classroom "+roomNumber+ " is "+ (isAvailable ? "available" : "not available"));
    }
    public void reserve(){
        if(isAvailable){
            isAvailable=false;
            System.out.println("Classroom "+roomNumber+" has been reserved.");
    
        }else{
            System.out.println("Classroom "+roomNumber+" is not available for reservation");
        }

    }
    public void releaseReservation(){
        if(!isAvailable){
            isAvailable=true;
            System.out.println("Reservation for classroom "+ roomNumber+" has been released");
        }else{
            System.out.println("Classroom "+roomNumber+" is already available");
        }
    }
    public String getRoomNumber(){
        return roomNumber;
    }
    public int getCapacity(){
        return capacity;
    }
    
}
