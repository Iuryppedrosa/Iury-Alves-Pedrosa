public class ElonsToyCar {
    private String distanceInicial = "Driven 0 meters";
    private String bateryInicial = "Battery at 100%";
    private int driveCount;

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return this.distanceInicial;
    }

    public String batteryDisplay() {
        return this.bateryInicial;
    }

    public void drive() {
        int distance = 20;
        if(driveCount < 100){
            driveCount++;
        }
        this.distanceInicial = "Driven " + (distance * driveCount) + " meters";
        if(driveCount < 100){
            this.bateryInicial = "Battery at " + (100 - driveCount) + "%";
        }else{
            this.bateryInicial = "Battery empty";
        }
    }

    public int getDriveCount(){
        return this.driveCount;
    }
}
