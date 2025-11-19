public class Lasagna {
    int COOKING_BOOK_TIME = 40;
    int TIME_PER_LAYER = 2;
    
    public int expectedMinutesInOven(){
        return COOKING_BOOK_TIME;
    }

    public int remainingMinutesInOven(int minutesInOven){
        return this.expectedMinutesInOven() - minutesInOven;
    }

    public int preparationTimeInMinutes(int layer){
        int preparationTimePerLayer = layer * TIME_PER_LAYER;
        return preparationTimePerLayer;
    }
    
    public int totalTimeInMinutes(int layer, int minutesInOven){
        return this.preparationTimeInMinutes(layer) + minutesInOven;
    }
}
