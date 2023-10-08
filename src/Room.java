public class Room {
    private int roomNumber;
    private boolean status;
    private double pricePerNight;

    enum RoomCategory{
        SINGLE,DOUBLE,SUIT,LUXURY,CASUAL
    }

    private RoomCategory roomCategory;


    public Room(int roomNumber, RoomCategory roomCategory, double pricePerNight ) {
        this.roomNumber = roomNumber;
        this.roomCategory=roomCategory;
        this.status=false;
        this.pricePerNight=pricePerNight;

    }

    public int getRoomNumber() {

        return roomNumber;
    }

    public RoomCategory getRoomCategory() {

        return roomCategory;
    }

    public boolean isStatus() {

        return status;
    }

    public double getPricePerNight() {

        return pricePerNight;
    }

    public void reserve(){

        status=true;
    }

    public void cancelReservation(){

        status=false;
    }



}
