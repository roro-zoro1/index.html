//caratrd by Calvin Sites
//floecontrol the program count to 100 and than adds all the number's up
//softwaredevelupment

public class flowControl {
    public static void main(String[] args) {
        int sum=0;
        for(int x=1;x<101;x++){ //this is are loop
            if(x%2==0){ //it use's modulus to deturmen if it is odd or even
                System.out.println(x+" is even");
            } else{
                System.out.println(x+" is odd");   
            }
            sum=sum+x;
        }
        System.out.println(sum+" is the sum of are number's");
    }





}
