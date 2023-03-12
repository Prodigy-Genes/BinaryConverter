import java.util.Scanner;


public class BinaryConverter{
    public static String toBinary(int num){
        String Binary="";
        while(num>0){
            Binary=(num%2)+Binary;
            num/=2;
        }
        return Binary;

    }
}


class Converter {
 public static void main(String[] args) {
    Scanner read=new Scanner(System.in);
    System.out.println("Enter Number To Be Converted:");
    int x = read.nextInt();
    System.out.print(BinaryConverter.toBinary(x));

    read.close();
    
 }   
}
