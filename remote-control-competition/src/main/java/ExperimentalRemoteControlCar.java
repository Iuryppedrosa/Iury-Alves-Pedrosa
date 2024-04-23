public class ExperimentalRemoteControlCar implements RemoteControlCar{
    int distanceTravelled = 0;

    public void drive() {
        distanceTravelled += 20;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    @Override
    public int getNumberOfVictories() {
        return 0;
    }

    @Override
    public void setNumberOfVictories(int numberOfVictories) {

    }
}
