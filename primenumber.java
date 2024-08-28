import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number=input.nextInt();
int flag =0;
int midnumber = number/2;
        if(number==0 || number ==1){
            flag=1;
        }
        
        else{
            for(int i=2;i<=midnumber;i++){
                if(number%i==0){
                    flag=1;
                }
            }
            if(flag==1){
                       System.out.println("not a prime");
            }
            else{
                System.out.println("prime number");
            }
        }
        input.close();
    }
}
