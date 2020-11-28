import Exercises.*;

public class Main {

    public static void main(String[] args) {

        //Завдання 3.1
        //Написати алгоритм, котрий знаходить у заданому несортованому числовому масиві найбільше число.
        //IExercise lab = new Lab_3_1();

        //Завдання 3.2
        //Написати алгоритм, котрий створює масив заданої довжини та наповнює його числами Фібоначчі.
        //IExercise lab = new Lab_3_2();

        //Завдання 3.3
        //вставка числа у відсортований массив
        //IExercise lab = new Lab_3_3();

        //Collections
        // 3) Теперь напиши алгоритм, который принимает лист строк с повторами и возвращает набор всех разных строк *
        // 5) Поэкспериментируй с разными сетами. Например, выведи все элементы хеш сета через цикл / итератор. Создай трисет с аналогичным набором данных и повтори процедуру.
        //IExercise lab = new LabCollections_1();

        //Collections
        //4) Теперь напиши алгоритм, который принимает лист строк с повторами и считает, сколько раз каждая строка повторяется.
        //IExercise lab = new LabCollections_2();

        //Collections
        // 6) Поэкспериментируй с мапами.
        // Создай хешМап и наполни его строками под номерными (инт) ключами.
        // Затем извлеки из мапа все ключи (есть специальный метод),
        // затем все значения (тоже есть специальный метод), и все пары (называются вхождения) и выведи их в консоль через цикл.
        // Попробуй достать из мапа по несуществующему ключу и всякое такое.
        IExercise lab = new LabCollections_3();

        lab.execute();
    }
}
