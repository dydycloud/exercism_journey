class NeedForSpeed {
    public int batteryDrain;
    public int batteryLevel;
    private boolean batteryStatus;
    private int distanceDriven;
    private int speed;
    static int topSpeed = 50;
    static int nitroDrainCost = 4;
    
    public NeedForSpeed(int speed, int batteryDrain) {
        this.batteryLevel = 100;
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.batteryStatus = false;
    }

    public boolean batteryDrained() {
        if(this.batteryLevel < this.batteryDrain || this.batteryLevel <= 0){
            this.batteryStatus = true;
        }
        return this.batteryStatus;
    }

    public int distanceDriven() {
        return this.distanceDriven;
    }

    public void drive() {
        if(this.batteryLevel > 0){
            this.distanceDriven += this.speed;
            this.batteryLevel -= this.batteryDrain;
        }        
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(topSpeed, nitroDrainCost);
    }
}

class RaceTrack {
     private int distance;
    
    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        return car.batteryLevel >= this.distance && car.batteryDrain < this.distance ? true : false;
    }
}
