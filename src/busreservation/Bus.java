package busreservation;

public class Bus {
   private int busNo;
    private boolean ac;
    private int capacity;

    Bus(int no, boolean ac, int cap){
        this.busNo = no;
        this.ac = ac;
        this.capacity = cap;
    }
    public int getCapacity(){
        return capacity;
    }
    public void setCapacity(int cap){
        capacity = cap;
    }
    public boolean getac(){
        return ac;
    }
    public void setac(boolean ac){
        this.ac = ac;
    }
    public int getBusNo(){
        return busNo;
    }
    public void displayBusInfo(){
        System.out.println("Bus Number: " + busNo + " AC: " + ac + " Capacity: " + capacity);
    }
}
