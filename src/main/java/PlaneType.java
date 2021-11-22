public enum PlaneType {

    BOEING747(500, 330000 ),
    BOEING787(250, 200000),
    AIRBUS350(300, 250000);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity(){
        return capacity;
    }

    public int getTotalWeight(){
        return totalWeight;
    }
}
