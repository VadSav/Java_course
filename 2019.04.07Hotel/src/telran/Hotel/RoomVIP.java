package telran.Hotel;

public class RoomVIP {



    private String price;
    private int number;


    
    public RoomVIP(String price, int number) {
    
    	this.price = price;
    	this.number = number;
        }

        public String getPricer() {
            return price;
        }

        public int getNumber() {
            return number;
        }

        @Override
        public String toString() {
    	return "RoomVIP " + number;
        }

		public String getPrice() {
			return price;
		}

		public void setPrice(String price) {
			this.price = price;
		}

		public void setNumber(int number) {
			this.number = number;
		}
        
  
        
}
	

