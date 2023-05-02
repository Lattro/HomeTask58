import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Map<Integer,String> map = new HashMap<Integer, String>();
        System.out.println("Введите товар и его цену : Апельсин 19");
        for (int i = 0; i < 5; i++)
        {
            String value = scanner.next();
            int price = scanner.nextInt();
            map.put(price,value);
        }
        System.out.println(map.values());
        System.out.println(map.keySet());
    }
}
