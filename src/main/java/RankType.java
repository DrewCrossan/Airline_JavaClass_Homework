public enum RankType {

    CAPTAIN("Captain"),
    FIRST_OFFICER("First Officer"),
    PURSER("Purser"),
    FLIGHT_ATTENDANT("Flight Attendant");

    private final String rank;

    RankType(String rank){
        this.rank = rank;
    }

    public String getRank(){
        return rank;
    }
}
