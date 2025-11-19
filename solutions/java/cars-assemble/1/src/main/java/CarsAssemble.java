public class CarsAssemble {
    int CAR_PER_HOUR = 221;
    int SUCCESS_100 = 1;
    double SUCESS_90 = 0.9;
    double SUCCESS_80 = 0.8;
    double SUCESS_77 = 0.77;
    
    public double productionRatePerHour(int speed) {
        if(speed > 0 && speed <= 10){
            double production = speed * CAR_PER_HOUR;
            if(speed >= 1 && speed <= 4){
                return production * SUCCESS_100;
            }
            else if(speed >= 5 && speed <= 8){
                return production * SUCESS_90;
            }
            else if(speed == 9){
                return production * SUCCESS_80;
            }
            else if(speed == 10){
                return production * SUCESS_77;
            }
        }
        return 0;
    }

    public int workingItemsPerMinute(int speed) {
        return (int)this.productionRatePerHour(speed) / 60;
    }
}
