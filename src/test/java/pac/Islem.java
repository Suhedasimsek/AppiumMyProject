package pac;

import java.util.Scanner;

public class Islem {
    private int total;


    public static Islem IslemX(int num){
        return new Islem(num);
    }
    private Islem(int num){
        total = num;
    }

    public Islem add(int num){
        total += num;
        return this;
    }

    public Islem subt(int num){
        total -= num;
        return this;
    }

    public void yaz(){
        System.out.println(total);
    }

    public Scanner sc(){
        return new Scanner(System.in);
    }

}
