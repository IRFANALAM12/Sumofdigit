import java.util.*;
import java.io.*;
public class sumofDigit {
    // function defination
    public static int sum_of_digit(int num){
        int result = 0;
        if(num == 0){
            return 0;
            
        }
        else{
            result = num %10 + sum_of_digit(num / 10);
            return result;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the nuber:");
        int num = sc.nextInt();
        //function calling
        int result = sum_of_digit(num);
        System.out.println("The sum of digit is:"+result);

    }
}
