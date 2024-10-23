import org.junit.jupiter.api.Test;

public class Data {
        public static void main(String[] args) {
            int x = 10;
            int b = 100;

            System.out.println(x + b);
            System.out.println(x - b);
            System.out.println(x * b);
            System.out.println(x / b);

            System.out.println(x > b);
            System.out.println(x < b);
            System.out.println(x == b);
            System.out.println(x != b);
            System.out.println(x >= b);
            System.out.println(x <= b);

            double  g = 7.2;
            int z = 22;
            System.out.println(g + z);
            System.out.println(g - z);
            System.out.println(g * z);
            System.out.println(g / z);

            //переполнение в минус уходит , пробовал циклом , аналогично , это верно?
            int s = 2147483647;
            int k = s + z;
            System.out.println(k);
                
            }

        }



