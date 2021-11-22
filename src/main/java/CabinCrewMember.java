public class CabinCrewMember {

    private String name;
    private RankType rank;

    public CabinCrewMember(String name, RankType rankType){
        this.name = name;
        this.rank = rankType;
    }

    public String getName() {
        return name;
    }

    public RankType getRank() {
        return rank;
    }

    public String passengerInstructions() {
        return "Please fasten your seatbelts!";
    }
}
