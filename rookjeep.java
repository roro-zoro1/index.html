//caratrd by Calvin Sites
//this add a rook craler jeep to the jeepraper
//softwaredevelupment

public class rookjeep extends Jeep{
    int tiresize;
    int suspenchintravul;
    public rookjeep(String typ, int year, String color, Boolean isgas, int horsepower, int tiresize, int suspenchintravul){
        super(typ, year, color, isgas, horsepower);
        this.tiresize=tiresize;
        this.suspenchintravul=suspenchintravul;
        
    }
    public String toString (){
        return year+"  "+color+" is rookcraller with "+ tiresize;
    }
}