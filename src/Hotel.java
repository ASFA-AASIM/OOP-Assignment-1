public class Hotel {
    private  Room []rooms;

    public Hotel(Room[] rooms) {

        this.rooms = rooms;
    }

    public Room[] getRooms() {
        return rooms;
    }
    public void displayRoom(){
        System.out.println("Display available rooms");
        for(Room room : rooms){
            if(!room.isStatus()){
                System.out.println("Room-" + room.getRoomNumber() + " ; Category:" + room.getRoomCategory() +
                        "  ; Price per night:$" + room.getPricePerNight());
            }

        }





    }
    }

