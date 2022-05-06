public class HW3 {
    /*
Создать класс PhoneNumber (в отдельном файле)
2 поля:
num целочисленного типа
    (там будет храниться номер в виде числа, начинающегося с 8)
numType строчного типа
    (там будет храниться информация о типе номера, например "Рабочий" или "Личный")
В psvm создать объект класса PhoneNumber, задать его полям значения через операцию присваивания
Вывести информацию об объекте в консоль в одну строку
 */
    public static void main(String[] args) {
        PhoneNumber phone = new PhoneNumber();
        phone.num = 89525565858L;
        phone.numType = "Рабочий";

        System.out.println(phone.num + " - " + phone.numType);
        //или
        System.out.println(phone);
    }
}

//System.out.println("Номер телефона:");
//
//        Scanner scanner = new Scanner(System.in);
//        String phoneNumberScan = scanner.nextLine();
//
//        phoneNumberScan = phoneNumberScan.replaceAll("[^0-9]","");
//        String phoneNumber =  phoneNumberScan.substring(phoneNumberScan.length()-10);
//        System.out.println("7" + phoneNumber);