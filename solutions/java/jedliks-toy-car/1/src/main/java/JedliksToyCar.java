public class JedliksToyCar {
    int meters = 0;
    int battery = 100;
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + this.meters + " meters";
    }

    public String batteryDisplay() {
        if(this.battery == 0){
            return "Battery empty";
        }
        return "Battery at " + this.battery + "%";
    }

    public void drive() {        
        if(this.battery > 0){
            this.battery -= 1;
            this.meters += 20;
        } else {
            this.battery = 0;
        }
        
    }
}