public class HW5 {
    /*
Добавить в класс PhoneNumber три метода:
метод с именем print без аргументов и без возвращаемого значения,
    print выводит объект в консоль в одну строку
метод с именем changeType с одной строкой как аргумент и без возвращаемого значения,
    changeType изменяет значение поля numType на строку из аргумента
метод с именем getNum без аргументов и с возвратом целочисленного значения,
    getNum возвращает значение поля num
В psvm создать объекты как в HW4
Вызвать у второго объекта метод print(),
с помощью sout и getNum() вывести отдельно значение номера,
вызвать у объекта changeType() со значением строчного типа,
снова вызвать метод print()
 */
    public static void main(String[] args) {

        PhoneNumber phone3 = new PhoneNumber();
        phone3.numType = "Личный";
        phone3.num = 89815476577L;

        PhoneNumber phone4 = new PhoneNumber(89115000065L, "Рабочий");

        phone4.print();
        System.out.println(phone4.getNum());

        phone4.changeType("Мобильный");
        phone4.print();

    }

}
