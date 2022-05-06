public class HW4 {
       /*
    Добавить в класс PhoneNumber два конструктора:
    первый - без аргументов, он задает значение numType = ""
    второй - с двумя аргументами таких же типов, что и поля, он передает значения аргументов в поля
    В psvm создать два объекта класса PhoneNumber
        первый - с помощью конструктора без аргументов и потом задать значения его полей
        второй - с помощью конструктора с двумя аргументами
    Вывести информацию об обоих объектах по одному на строку
     */
    public static void main(String[] args) {
        PhoneNumber phone1 = new PhoneNumber();
        phone1.numType = "Личный";
        phone1.num = 89215476589L;

        PhoneNumber phone2 = new PhoneNumber(89115476565L, "Рабочий");

        System.out.println(phone1 + "\n" + phone2);



    }
}
