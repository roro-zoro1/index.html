//caratrd by Calvin Sites
//it uses a bubble to count to 100 and than adds all the number's up
//softwaredevelupment

public class Jeep {
    String typ;
    int year;
    String color;
    Boolean isgas;
    int horsepower;
    public Jeep(String typ, int year, String color, Boolean isgas, int horsepower){
        this.typ=typ;
        this.year=year;
        this.color=color;
        this.isgas=isgas;
        this.horsepower=horsepower;
        }
    public String toString (){
            return year+"  "+color+" "+typ;
        };
    public void repaint (String newcolor){
        color=newcolor;
        System.out.println(year+"  "+color+" "+typ+" has left the paint both");
    }

        
    }
