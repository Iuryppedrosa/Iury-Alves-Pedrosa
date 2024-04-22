class NeedForSpeed {
    public int distance;
    public int battery = 100;

    public int speed;
    public int batteryDrain;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return battery <= 0;
    }

    public int distanceDriven() {
        return distance;
    }

    public void drive() {
        if((battery - batteryDrain) <= 0) {
            distance += (battery / batteryDrain) * speed;
            battery = 0;
        } else {
            battery -= batteryDrain;
            distance += speed;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    public int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        while(!car.batteryDrained()) {
            car.drive();
        }
        return car.distanceDriven() >= distance;
    }
}
