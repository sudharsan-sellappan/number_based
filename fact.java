import java.util.*;

public class fact{
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        for(int i=1;i<=number;i++){
            if(number%i==0){
                System.out.print(i+" ");
            }
        }
        input.close();
    }
}