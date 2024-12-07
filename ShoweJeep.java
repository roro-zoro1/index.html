//caratrd by Calvin Sites
//this add a Showe jeep to the jeepraper
//softwaredevelupment

public class ShoweJeep extends Jeep {
    int trofes;
    public ShoweJeep(String typ, int year, String color, Boolean isgas, int horsepower){
        super(typ, year, color, isgas, horsepower);
        trofes=0;
    }
    public void winTrofes(){
        trofes++;
    }
    public String toString (){
        return year+"  "+color+" "+typ+" has wone "+trofes+" trofes";
    }
}