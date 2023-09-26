import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
//          System.out.print(listNums(9));
//          System.out.print(reverseListNums(9));
//          System.out.println(chet(19));
//          System.out.println(pow(3, 2));
          System.out.println(equalNum(3233333));
    }

/*
    Необходимо реализовать метод таким образом, чтобы он возвращал строку, в которой
    будут записаны все числа от 0 до x (включительно).

    Пример:
    x=5
    результат: “0 1 2 3 4 5”
*/
    public static String listNums(int x) {
        String outList = "";
        for (int i = 0 ;i <= x; i++) {
            outList += i + " ";
        }
        return outList;
    }

    /*
    Необходимо реализовать метод таким образом, чтобы он возвращал строку,
    в которой будут записаны все числа от x до 0 (включительно).

    Пример:
    x=5
    результат: “5 4 3 2 1 0”
     */
    public static String reverseListNums(int x) {
        int max = x;
        String reverse = "";
        for ( ; max >= 0; max--) {
            reverse += max + " ";
        }
        return reverse;
    }

    /*
Необходимо реализовать метод таким образом, чтобы он возвращал строку, в которой будут записаны все четные числа от 0 до x (включительно).
Подсказа для обеспечения качества кода: инструкцию if использовать не следует.

    Пример:
    x=9
    результат: “0 2 4 6 8”
     */
    public static String chet(int x) {
        int i = 0;
        String chet = "";
        for (; i <= x; i += 2) {
           chet += i + " ";
        }
        return chet;
    }

    /*
Необходимо реализовать метод таким образом, чтобы он возвращал результат возведения x в степень y.

Подсказка: для получения степени необходимо умножить единицу на число x, и сделать это y раз,
т.е. два в третьей степени это 1*2*2*2

    Пример:
    x=2
    y=5
    результат: 32
     */
    public static int pow(int x, int y) {
        int res = 1;
        int i;
        for (i = 1 ; i <= y; i++) {
            res *= x;
        }
        return res;
    }

    /*
    Необходимо реализовать метод таким образом, чтобы он возвращал true, если все знаки числа одинаковы, и false в ином случае.

    Подсказки:

    int x=123%10; // х будет иметь значение 3
    int у=123/10; // у будет иметь значение 12

    Пример 1:
    x=1111
    результат: true

    Пример 2:
    x=1211
    результат: false
     */
    public static boolean equalNum(int x) {
        boolean equal = false;
        for ( ;x > 0 ; x/=10) {
            if(x%100 == x%10) equal = true;
        }
        return equal;
    }
}