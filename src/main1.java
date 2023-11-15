

public class main1 {
    public static void main(String[] args) {

    }


}

class apaart {
    private int rooms;
    private int floor;
    private double area;
    private String address;

    public apaart(int rooms, int floor, double area, String address) {
        this.rooms = rooms;
        this.floor = floor;
        this.area = area;
        this.address = address;
    }

    public void printInfo() {
        System.out.println("Rooms: " + this.rooms + ", Floor: " + this.floor + ", Area: " + this.area + ", Address: " + this.address);
    }
}