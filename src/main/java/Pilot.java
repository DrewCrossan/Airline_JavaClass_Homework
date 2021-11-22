public class Pilot {

    private String name;
    private RankType rank;
    private String pilotLicenseNum;

    public Pilot(String name, RankType rankType, String pilotLicenseNum){
        this.name = name;
        this.rank = rankType;
        this.pilotLicenseNum = pilotLicenseNum;
    }

    public String flyPlane(){
        return "Pilot is flying!";
    }

}
