public class Plane {

    private PlaneType plane;

    public Plane(PlaneType planeType){
        this.plane = planeType;
    }

    public int getPlaneCapacity() {
        return plane.getCapacity();
    }

    public int getPlaneWeight(){
        return plane.getTotalWeight();
    }
}
