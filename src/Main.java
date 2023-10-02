import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
//          System.out.print(listNums(9));
//          System.out.print(reverseListNums(9));
//          System.out.println(chet(19));
//          System.out.println(pow(2, 8));
          System.out.println(equalNum(3133));
//        System.out.println(numLen(0));
//        square(20);
//        leftTriangle(5);
//        rightTriangle(4);
//        guessGame();
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
        boolean eq = true;
        int num = x%10;
        for (; x > 0; x /= 10) {
            if (num != x % 10) {
                return false;
            }
        }
        return eq;
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
        for (int i = 0; i <= x; i++) {
            if (i < x) {
                outList += i + " ";
            }
            if (i == x) {
                outList += i;
            }
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
        for (; max >= 0; max--) {
            if (max > 0)
                reverse += max + " ";
            if (max == 0)
                reverse += max;
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
        for (; i == 0; i += 2) {
                chet += i;
        }
        for (; i <= x && i > 0; i += 2) {
            chet += " " + i;
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
        for (i = 1; i <= y; i++) {
            res *= x;
        }
        return res;
    }


    /*
    Необходимо реализовать метод таким образом, чтобы он возвращал количество знаков в числе x.

    Подсказка:
    int у=123/10; // у будет иметь значение 12
    Пример:
    x=12567
    результат: 5
     */
    public static int numLen(long x) {
        if (x == 0) {
            return 1;
        }
        int len = 0;
        for (; x > 0; x /= 10) {
            len++;
        }
        return len;
    }

    /*
    Необходимо реализовать метод таким образом, чтобы он выводил на экран квадрат из символов ‘*’ размером х, у которого х символов в ряд и х символов в высоту.
    Подсказка: метод System.out.print выводит без перехода на следующую строку, в то время как System.out.println выводит с переходом.

        Пример 1:
        x=2
        результат:
        **
        **

        Пример 2:
        x=4
        результат:
        ****
        ****
        ****
        ****
     */
    public static void square(int x) {
        for (int a = 0; a < x; a++) {
            for (int b = 0; b < x; b++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    /*
    Необходимо реализовать метод таким образом, чтобы он выводил на экран треугольник из символов ‘*’ у которого х символов в высоту, а количество символов в ряду совпадает с номером строки.

    Пример 1:
    x=2
    результат:
    *
    **

    Пример 2:
    x=4
    результат:
    *
    **
    ***
    ****
     */
    public static void leftTriangle(int x) {
        for (int a = 0; a < x; a++) {
            for (int b = 0; a >= b; b++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    /*
Необходимо реализовать метод таким образом, чтобы он выводил на экран треугольник из символов ‘*’ у которого х символов в высоту, а количество символов в ряду совпадает с номером строки, при этом треугольник выровнен по правому краю. Подсказка: перед символами ‘*’ следует выводить необходимое количество пробелов.

Пример 1:
x=3
результат:
    *
  **
***

Пример 2:
x=4
результат:
      *
    **
  ***
****
 */
    public static void rightTriangle(int x) {
        for ( int i = 0; i <= x; i++) {
            for ( int j = x; 0 <= j; j--) {
                if (j > i) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println("");
        }
    }

    /*
    Данный метод считывает с консоли введенное пользователем число и выводит, угадал ли пользователь то,
    что было загадано, или нет. Перепишите этот метод таким образом, чтобы он запускался до тех пор,
    пока пользователь не угадает число. После этого выведите нагадать число. экран количество попыток,
    которое потребовалось пользователю, чтобы у

    Ответом на задание является измененный метод.
     */
    public static void guessGame() {
        int randomNum = 3;
        int i = 0;
        int x = 0;
        for ( ; x != randomNum ; i++) {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.println("What number am I thinking (0 to 9)? :");
            x = sc.nextInt();
            if (x == randomNum) {
                System.out.println("Yes, it`s " + randomNum);
            } else {
                System.out.println("No, try again");
            }
        }
        System.out.println("Попыток " + i);
    }
}