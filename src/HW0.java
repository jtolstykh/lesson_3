public class HW0 {
    /*
       Создать метод, принимающий массив целых чисел ints и целое число target
       и возвращает индекс элемента, равного target, внутри ints
     */
//вариант_1
    static void array(int[] ints, int target) {
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == target) {
                System.out.println("Индекс элемента, равного target: " + i);
            }
        }
    }


//вариант_2
    static void array2 (int[] ints, int target2) {
        int targetIndex = -1;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == target2) {
                targetIndex = i;
                break;
            }
        }
        if (targetIndex != -1) {
            System.out.println("Элемент: " + target2 + " на индексе: " + targetIndex);
        } else {
            System.out.println("Элемент не найден");
        }
    }

    public static void main(String[] args) {

       int [] ints = {0,22,3,25,45};
       array(ints,3);
       array2(ints,10);

    }
}

