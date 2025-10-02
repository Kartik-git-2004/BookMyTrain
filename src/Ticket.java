public class Ticket {
    private int ticketId;
    private User user;
    private Train train ;
    private int seatBooked;
    private int counter = 1001;

    public Ticket(int ticketId,User user , int seatBooked,Train train ){
        this.ticketId = counter++;
        this.user =user;
        this.train= train;
        this.seatBooked=seatBooked;


    }

    public int  getTicketId(){return ticketId;}
    public User getUser(){return user;}
    public  Train getTrain(){return  train;}
    public  int getSeatBooked(){return seatBooked;}
 public int getCounter(){return counter;}

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public void setSeatBooked(int seatBooked) {
        this.seatBooked = seatBooked;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public String toString(){
        return "Ticket ID : "+ticketId+" | Train : "+train.getTrainName()+" | User : "+user.getFullName()+
                " |   "+ train.getSource()+" --> "+train.getDestination()+" | SeatBooked : "+seatBooked;
    }
}
