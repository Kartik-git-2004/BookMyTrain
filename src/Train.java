public class Train {
    private int trainId;

    private String trainName;

    private String source;

    private String destination;

    private int totalSeat;

    private  int availableSeat;

    public Train(int id , String trainName,String source,String destination,int totalSeat){
        this.trainId =id;
        this.trainName=trainName;
        this.source=source;
        this.availableSeat=totalSeat;
        this.totalSeat=totalSeat;
    }

    public int getTrainId() {
        return trainId;
    }

    public String getTrainName() {
        return trainName;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public int getTotalSeat() {
        return totalSeat;
    }

    public int getAvailableSeat() {
        return availableSeat;
    }

    public void setTrainId(int trainId) {
        this.trainId = trainId;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setTotalSeat(int totalSeat) {
        this.totalSeat = totalSeat;
    }

    public void setAvailableSeat(int availableSeat) {
        this.availableSeat = availableSeat;
    }

    public boolean bookSeats(int count){
        if(count<=availableSeat){
            availableSeat-=count;
            return true;
        }
        return false;
    }
    public void cancelSeat(int count){
        availableSeat+=count;
    }

    @Override
    public String toString() {
        return   trainId+ " | "+source+" ---> "+destination+" SeatAvailable "+availableSeat;
    }
}
