public class Main {
    public static void main(String[] args) {
        System.out.println(listNums(7));
        System.out.println(reverseListNums(20));
        System.out.println(chet(19));
        System.out.println(pow(2, 5));
    }

/*
    Необходимо реализовать метод таким образом, чтобы он возвращал строку, в которой
    будут записаны все числа от 0 до x (включительно).

    Пример:
    x=5
    результат: “0 1 2 3 4 5”
*/
    public static String listNums(int x) {
        for (int i = 0; i<=x; i++) {
            System.out.print(i + " ");
        }
        return "";
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
        for ( ; max >= 0; max--) {
            System.out.print(max + " ");
        }
        return "";
    }

    /*
Необходимо реализовать метод таким образом, чтобы он возвращал строку, в которой будут записаны все четные числа от 0 до x (включительно). Подсказа для обеспечения качества кода: инструкцию if использовать не следует.

    Пример:
    x=9
    результат: “0 2 4 6 8”
     */
    public static String chet(int x) {
        for (int i = 0; i<=x; i+=2 ) {
            System.out.print(i + " ");
        }
        return "";
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
        int degree = y;
        int num = x;
        int sqrt=0;
        for (int i=1; i<=degree; i++) {
            sqrt = i*y;
        }
        System.out.println(sqrt);
        return degree;
    }
}