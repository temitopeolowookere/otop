package classWorks.hotelManagementSystem;

public class UnicornHotel {
    public String[] rooms;

    public UnicornHotel ( int numberOfRooms){
        this.rooms = new String[numberOfRooms];

    }
    public String bookRoom(String name) throws IllegalAccessException{
        for (int i = 0;i<rooms.length;i++){
            if (rooms[i]== null){
                rooms[i] = name;
                break;
            }
        }
        return "room booked successful";
    }

    public String getRoomGuest(int roomNumber) {

        return rooms[roomNumber- 1];
    }

    public String[] getRooms() {
        return new String[0];
    }
}
