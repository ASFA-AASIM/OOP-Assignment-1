import java.util.Scanner;

public class HotelReservation {
    public static void main(String[] args) {
        Room singleroom=new Room(01, Room.RoomCategory.SINGLE ,75);
        Room doubleroom=new Room(02, Room.RoomCategory.DOUBLE ,150);
        Room suitroom = new Room(03, Room.RoomCategory.SUIT  ,300);
        Room luxuryroom=new Room(04, Room.RoomCategory.LUXURY,500);
        Room casualroom=new Room(05, Room.RoomCategory.CASUAL,100);

        Room []rooms={singleroom,doubleroom,suitroom,luxuryroom,casualroom};

        Hotel hotel=new Hotel(rooms);
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.println("1:Available Hotel Rooms:");
            System.out.println("2:Room Reservation:");
            System.out.println("3:Cancel Room Reservation:");
            System.out.println("4:Exit The Process!!");
            System.out.println("Enter your choice:");

            int choice= scanner.nextInt();

            switch (choice){
                case 1:
                    hotel.displayRoom();
                    break;
                case 2:
                    System.out.println("Enter the room number you want to reserve:");
                    int  roomNumber= scanner.nextInt();
                   reserveRoom(rooms, roomNumber);
                   break;
                case 3:
                    System.out.println("Enter the room number for cancelling reservation:");
                    roomNumber= scanner.nextInt();
                    cancelReservation(rooms,roomNumber);
                    break;
                case 4:
                    System.out.println("Thank You for your interest!!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Inappropriate choice.Please try again!!");
                    break;

                }
            }

        }

    public static void reserveRoom(Room [] rooms, int roomNumber){
        for (Room room: rooms) {
            if (room.getRoomNumber() == roomNumber && !room.isStatus()) {
                room.reserve();
                System.out.println("Room " + roomNumber + " has been reserved.");
                return;
            }
        }
        System.out.println("Room " + roomNumber + " is not available for reservation.");
    }

    public static void cancelReservation(Room[] rooms, int roomNumber) {
        for (Room room: rooms) {
            if (room.getRoomNumber() == roomNumber && room.isStatus()) {
                room.cancelReservation();
                System.out.println("Reservation for Room " + roomNumber + " has been canceled.");
                return;
            }
        }
        System.out.println("Room " + roomNumber + " is not reserved.");
    }

    }


