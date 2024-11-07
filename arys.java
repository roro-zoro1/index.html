//caratrd by Calvin Sites
//it uses a ary to count to 100 and than adds all the number's up
//softwaredevelupment

public class arys {
    public static void main(String[] args) {
        int sum=0;
        int[] number=new int[100];
        for(int x=1;x<101;x++){
            number[x-1]=x;
        }
        for(int x=0;x<number.length;x++){ //this is are loop
            if(number[x]%2==0){ //it use's modulus to deturmen if it is odd or even
                System.out.println(number[x]+" is even");
            } else{
                System.out.println(number[x]+" is odd");   
            }
            sum=sum+number[x];
        }
        System.out.println(sum+" is the sum of are number's");
    }





}
