public class Lasagna {
    int COOKING_BOOK_TIME = 40;
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return COOKING_BOOK_TIME;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int minutesInOven){
        return this.expectedMinutesInOven() - minutesInOven;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layer){
        int timePerLayer = 2;
        int preparationTimePerLayer = layer * timePerLayer;
        return preparationTimePerLayer;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layer, int minutesInOven){
        return this.preparationTimeInMinutes(layer) + minutesInOven;
    }
}
