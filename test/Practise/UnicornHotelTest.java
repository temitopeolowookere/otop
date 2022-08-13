package Practise;

import classWorks.hotelManagementSystem.UnicornHotel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UnicornHotelTest {
    UnicornHotel unicornHotel;


    @BeforeEach
    void startAllTestWith (){
        unicornHotel= new UnicornHotel(10);

    }

    @Test
    void testThatHotelExists(){
//        UnicornHotel unicornHotel = new UnicornHotel();
        assertNotNull(unicornHotel);
    }
    @Test
    void testThatWeHaveRooms_AndTheyAreEmpty(){
        String [] rooms = unicornHotel.getRooms();
        assertNotNull(rooms);
        for (String room: rooms){
            assertNull(room);
        }

    }

    @Test
     void testThatRoomCanBooked(){
        String name = "tope imioho";
        try{
            String result = unicornHotel.bookRoom(name);
            assertNotNull(result);
            assertEquals(name,unicornHotel.getRoomGuest(1));
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }


    }


}
