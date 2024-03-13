import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


/*      Параллелепипедтин жана цилиндрдин площадь жана объёмун эсептеген бир программа жазабыз.
        Фигуралардын параметрлерин(длина, ширина, высота,радиус) берип жатканда туура эмес маалымат
        берилсе Exception ыргытып, аны оброботка кылып кандай ошибка чыкканын корсотуп берсин.
                Мумкун болгон каталар:
        1) берилген маалымат терс сан болсо
        2) берилген маалымат сан эмес тамга болсо
        3) жана озунуздор берген кошумча каталар болсо да болот
        Параллелепипед:
        - Фигуранын аянтын эсептеген формула: 2*((height * length) + (length * width) + (height * width));
        - Фигуранын коломун эсептеген формула: (length*width*height);
        -Формулалар Parallelepiped классында жазылуусу керек
        Цилиндр:
        - Фигуранын аянтын эсептеген формула: 2*PI * radius*( height + radius);
        - Фигуранын коломун эсептеген формула: (PI*radius*radius*height);
        -Формулалар Cylinder классында жазылуусу керек
        Бардык Exception дор логикасы main класста жазылcын
        Бардык маалмыттар консоль аркылуу берилсин
        Программа кайсыл фигуранын аянтын жана коломун эсептегибиз келгенин сурап, тандаган фигураны эсептеп бериши керек. */

        Scanner scanner = new Scanner(System.in);

        Figure figure = new Figure();


        while (true) {
            try {
                System.out.println("Выберите фигуру для вычисления площади и объема:");
                System.out.println("1. Параллелепипед");
                System.out.println("2. Цилиндр");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        figure.parallelepiped(scanner);
                        break;
                    case 2:
                        figure.cylinder(scanner);
                        break;
                    default:
                        System.out.println("Неверный выбор. Пожалуйста, выберите 1 или 2.");
                }
            } catch (MyException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}