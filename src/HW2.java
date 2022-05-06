public class HW2 {
    /*
Написать метод с именем repeatString, который принимает строку s и целое число num как аргументы
и выводит строку s на экран num раз
Например, если вызвать repeatString("asd", 3), то в консоль трижды выведется строка "asd"
 */
    static void repeatString (String s, int num){
        for (int i = 0; i < num; i++){
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        repeatString("повтор", 5);
    }
}
