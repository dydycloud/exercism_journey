public class CarsAssemble {
    int CAR_PER_HOUR = 221;
    int SUCCESS_100 = 1;
    double SUCESS_90 = 0.9;
    double SUCCESS_80 = 0.8;
    double SUCESS_77 = 0.77;
    
    public double productionRatePerHour(int speed) {
        double production = speed * CAR_PER_HOUR;
        if(speed > 0 && speed < 10){
            if(speed <= 4){
                return production * SUCCESS_100;
            }
            else if(speed <= 8){
                return production * SUCESS_90;
            }
            else{
                return production * SUCCESS_80;
            }
        }else{
            return production * SUCESS_77;
        }
    }

    public int workingItemsPerMinute(int speed) {
        return (int)this.productionRatePerHour(speed) / 60;
    }
}
