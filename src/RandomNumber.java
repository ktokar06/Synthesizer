import java.util.Random;

public class RandomNumber {
    public static  void main (String[] args)
    {   //Создаем генератор чисел
        Random random = new Random();
        //Вложенный цикл
        for (int i = 0; i < 6; i++)
        {
           for (int j = 0; j < 6; j++);
        }
        //Генерируем числа от 1 до 6
        int  randomNumber = random.nextInt(6) + 1;
        //Ввыодим на экран соответствующую букву
        switch (randomNumber)
        {
            case 1:
                System.out.print("A ");
                break;

            case 2:
                System.out.print("Б ");
                    break;

            case 3:
                System.out.print("В ");
                break;

            case 4:
                System.out.print("Г ");
                break;

            case 5:
                System.out.print("Д ");
                break;

            case 6:
                System.out.print("Е ");
                break;
        }
    }
}
