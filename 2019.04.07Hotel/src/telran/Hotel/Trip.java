package telran.Hotel;

public class Trip {
    RoomVIP roomVIP;
    Room  room;
   Client client;
   

   @Override
   public String toString() {
	return roomVIP + "||" + room + " client=" + client;
   }

   public Trip(RoomVIP roomVIP, Room room, Client client) {
	super();
	this.roomVIP = roomVIP;
	this. room = room;
	this.client = client;
   }
   
   
}



