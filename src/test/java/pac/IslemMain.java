package pac;
import java.util.Scanner;

import static pac.Islem.*;

public class IslemMain {

    public static void main(String[] args) {
        IslemX(10).add(5).subt(1).yaz();

        System.out.println("----------------------");


        Islem islem = Islem.IslemX(10);
        islem.add(5);
        islem.subt(1);
        islem.yaz();
        Scanner sc1 = Islem.IslemX(1).sc();
        sc1.nextLine();

    }
}
