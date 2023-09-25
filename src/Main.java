public class Main {
    public static void main(String[] args) {
        System.out.println(listNums(7));
    }

/*
    Необходимо реализовать метод таким образом, чтобы он возвращал строку, в которой
    будут записаны все числа от 0 до x (включительно).

    Пример:
    x=5
    результат: “0 1 2 3 4 5”
*/
    public static String listNums(int x) {
        int i = 0;
        for ( ; i<=x; i++) {
            System.out.print(i + " ");
        }
        return "";
    }
}