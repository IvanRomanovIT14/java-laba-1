import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Выберите номер задания 1-20: ");
        Scanner scanner = new Scanner(System.in);
        Task s = new Task();
        int choice;
        if (scanner.hasNextInt()) {
            choice = scanner.nextInt();
        } else {
            System.out.println("Это не целое число!");
            scanner.next();
            return;
        }
        switch (choice) {
            case 1:
                System.out.println("Введите дробное число: ");
                double zad1 = scanner.nextDouble();
                double num1 = s.fraction(zad1);
                s.fraction(zad1);
                System.out.println("Дробная часть числа: " + num1);
                break;
            case 2:
                System.out.println("Введите цифру 0-9: ");
                char zad2;
                while (true) {
                    String input = scanner.nextLine();
                    if (input.length() == 1) {
                        zad2 = input.charAt(0);
                        break;
                    }
                    System.out.println("Можно вводить тольцо число от 1 до 9!");
                }
                char num2 = (char) s.charToNum(zad2);
                s.charToNum(zad2);
                System.out.println("Код символа: " + num2);
                break;
            case 3:
                System.out.println("Введите число: ");
                int zad3;
                if (scanner.hasNextInt()) {
                    zad3 = scanner.nextInt();
                } else {
                    System.out.println("Это не целое число!");
                    scanner.next();
                    return;
                }
                System.out.println(s.is2Digits(zad3));
                break;
            case 4:
                System.out.println("Введите число a: ");
                int a4;
                if (scanner.hasNextInt()) {
                    a4 = scanner.nextInt();
                } else {
                    System.out.println("Это не целое число!");
                    scanner.next();
                    return;
                }
                System.out.println("Введите число b: ");
                int b4;
                if (scanner.hasNextInt()) {
                    b4 = scanner.nextInt();
                } else {
                    System.out.println("Это не целое число!");
                    scanner.next();
                    return;
                }
                System.out.println("Введите число num: ");
                int num4;
                if (scanner.hasNextInt()) {
                    num4 = scanner.nextInt();
                } else {
                    System.out.println("Это не целое число!");
                    scanner.next();
                    return;
                }
                System.out.println(s.isInRange(a4, b4, num4));
                break;
            case 5:
                System.out.println("Введите число a: ");
                int a5;
                if (scanner.hasNextInt()) {
                    a5 = scanner.nextInt();
                } else {
                    System.out.println("Это не целое число!");
                    scanner.next();
                    return;
                }
                System.out.println("Введите число b: ");
                int b5;
                if (scanner.hasNextInt()) {
                    b5 = scanner.nextInt();
                } else {
                    System.out.println("Это не целое число!");
                    scanner.next();
                    return;
                }
                System.out.println("Введите число c: ");
                int c5;
                if (scanner.hasNextInt()) {
                    c5 = scanner.nextInt();
                } else {
                    System.out.println("Это не целое число!");
                    scanner.next();
                    return;
                }
                System.out.println(s.isInRange(a5, b5, c5));
                break;
            case 6:
                System.out.println("Введите число: ");
                int num6;
                if (scanner.hasNextInt()) {
                    num6 = scanner.nextInt();
                } else {
                    System.out.println("Это не целое число!");
                    scanner.next();
                    return;
                }
                System.out.println("Модуль этого числа: " + s.abs(num6));
                break;
            case 7:
                System.out.println("Введите число: ");
                int num7;
                if (scanner.hasNextInt()) {
                    num7 = scanner.nextInt();
                } else {
                    System.out.println("Это не целое число!");
                    scanner.next();
                    return;
                }
                System.out.println(s.is35(num7));
                break;
            case 8:
                System.out.println("Введите число x: ");
                int x8;
                if (scanner.hasNextInt()) {
                    x8 = scanner.nextInt();
                } else {
                    System.out.println("Это не целое число!");
                    scanner.next();
                    return;
                }
                System.out.println("Введите число y: ");
                int y8;
                if (scanner.hasNextInt()) {
                    y8 = scanner.nextInt();
                } else {
                    System.out.println("Это не целое число!");
                    scanner.next();
                    return;
                }
                System.out.println("Введите число z: ");
                int z8;
                if (scanner.hasNextInt()) {
                    z8 = scanner.nextInt();
                } else {
                    System.out.println("Это не целое число!");
                    scanner.next();
                    return;
                }
                System.out.println("Максимальное число: " + s.max3(x8, y8, z8));
                break;
            case 9:
                System.out.println("Введите число x: ");
                int x9;
                if (scanner.hasNextInt()) {
                    x9 = scanner.nextInt();
                } else {
                    System.out.println("Это не целое число!");
                    scanner.next();
                    return;
                }
                System.out.println("Введите число y: ");
                int y9;
                if (scanner.hasNextInt()) {
                    y9 = scanner.nextInt();
                } else {
                    System.out.println("Это не целое число!");
                    scanner.next();
                    return;
                }
                System.out.println("Сумма чисел: " + s.sum2(x9, y9));
                break;
            case 10:
                System.out.println("Введите число: ");
                int x10;
                if (scanner.hasNextInt()) {
                    x10 = scanner.nextInt();
                } else {
                    System.out.println("Это не целое число!");
                    scanner.next();
                    return;
                }
                System.out.println("День недели - " + s.day(x10));
                break;
            case 11:
                System.out.println("Введите число x: ");
                int x11;
                if (scanner.hasNextInt()) {
                    x11 = scanner.nextInt();
                } else {
                    System.out.println("Это не целое число!");
                    scanner.next();
                    return;
                }
                System.out.println("Числа от 0 до x: " + s.listNums(x11));
                break;
            case 12:
                System.out.println("Введите число x: ");
                int x12;
                if (scanner.hasNextInt()) {
                    x12 = scanner.nextInt();
                } else {
                    System.out.println("Это не целое число!");
                    scanner.next();
                    return;
                }
                System.out.println("Чётные числа от 0 до x: " + s.chet(x12));
                break;
            case 13:
                System.out.println("Введите число x: ");
                int x13;
                if (scanner.hasNextInt()) {
                    x13 = scanner.nextInt();
                } else {
                    System.out.println("Это не целое число!");
                    scanner.next();
                    return;
                }
                System.out.println("Колличество знаков в числе x: " + s.numLen(x13));
                break;
            case 14:
                System.out.println("Введите число x - количетсво строк и столбцов: ");
                int x14;
                if (scanner.hasNextInt()) {
                    x14 = scanner.nextInt();
                } else {
                    System.out.println("Это не целое число!");
                    scanner.next();
                    return;
                }
                s.square(x14);
                break;
            case 15:
                System.out.println("Введите x - количество символов в высоту: ");
                int x15;
                if (scanner.hasNextInt()) {
                    x15 = scanner.nextInt();
                } else {
                    System.out.println("Это не целое число!");
                    scanner.next();
                    return;
                }
                s.rightTriangle(x15);
            case 16:
                System.out.println("Введите количество чисел в массиве: ");
                int len16;
                if (scanner.hasNextInt()) {
                    len16 = scanner.nextInt();
                } else {
                    System.out.println("Это не целое число!");
                    scanner.next();
                    return;
                }
                System.out.println("Введите чила массива: ");
                int[] arr16 = new int[len16];
                for (int i = 0; i < len16; i++) {
                    if (scanner.hasNextInt()) {
                        arr16[i] = scanner.nextInt();
                    } else {
                        System.out.println("Это не целое число!");
                        scanner.next();
                        return;
                    }
                }
                System.out.println("Введите число x: ");
                int x16 = scanner.nextInt();
                System.out.println("Индекс числа x массииве: " + s.findFirst(arr16, x16));
                break;
            case 17:
                System.out.println("Введите количество чисел в массиве: ");
                int len17;
                if (scanner.hasNextInt()) {
                    len17 = scanner.nextInt();
                } else {
                    System.out.println("Это не целое число!");
                    scanner.next();
                    return;
                }
                System.out.println("Введите чила массива: ");
                int[] arr17 = new int[len17];
                for (int i = 0; i < len17; i++) {
                    if (scanner.hasNextInt()) {
                        arr17[i] = scanner.nextInt();
                    } else {
                        System.out.println("Это не целое число!");
                        scanner.next();
                        return;
                    }
                }
                System.out.println("Наибольшее по модулю число в масииве: " + s.maxAbs(arr17));
                break;
            case 18:
                System.out.println("Введите размер 1 массива:");
                int len18;
                if (scanner.hasNextInt()) {
                    len18 = scanner.nextInt();
                } else {
                    System.out.println("Это не целое число!");
                    scanner.next();
                    return;
                }
                int[] arr18 = new int[len18];
                System.out.println("Введите числа:");
                for (int i = 0; i < len18; i++) {
                    if (scanner.hasNextInt()) {
                        arr18[i] = scanner.nextInt();
                    } else {
                        System.out.println("Это не целое число!");
                        scanner.next();
                        return;
                    }
                }
                System.out.println("Массив:");
                for (int i = 0; i < len18; i++) {
                    System.out.print(arr18[i] + " ");
                }
                System.out.println();
                System.out.println("Введите размер 2 массива:");
                int len182;
                if (scanner.hasNextInt()) {
                    len182 = scanner.nextInt();
                } else {
                    System.out.println("Это не целое число!");
                    scanner.next();
                    return;
                }
                System.out.println("Введите числа:");
                int[] arr182 = new int[len182];
                for (int i = 0; i < len182; i++) {
                    if (scanner.hasNextInt()) {
                        arr182[i] = scanner.nextInt();
                    } else {
                        System.out.println("Это не целое число!");
                        scanner.next();
                        return;
                    }
                    ;
                }
                System.out.println("Массив:");
                for (int i = 0; i < len182; i++) {
                    System.out.print(arr182[i] + " ");
                }
                System.out.println();
                System.out.println("Введите позицию для вставки массива: ");
                int pos = scanner.nextInt();
                int[] res18 = s.add(arr18, arr182, pos);
                System.out.println("Результат: ");
                s.printArray(res18);
                break;
            case 19:
                System.out.println("Введите размер массива:");
                int len19;
                if (scanner.hasNextInt()) {
                    len19 = scanner.nextInt();
                } else {
                    System.out.println("Это не целое число!");
                    scanner.next();
                    return;
                }
                int[] arr19 = new int[len19];
                System.out.println("Введите числа:");
                for (int i = 0; i < len19; i++) {
                    if (scanner.hasNextInt()) {
                        arr19[i] = scanner.nextInt();
                    } else {
                        System.out.println("Это не целое число!");
                        scanner.next();
                        return;
                    }
                }
                System.out.println("Исходный массив:");
                for (int i = 0; i < len19; i++) {
                    System.out.print(arr19[i] + " ");
                }
                System.out.println();
                System.out.println("Перевёрнутый массив: ");
                int[] res19 = s.reverseBack(arr19);
                s.printArray(res19);
                break;
            case 20:
                System.out.println("Введите размер массива:");
                int len20;
                if (scanner.hasNextInt()) {
                    len20 = scanner.nextInt();
                } else {
                    System.out.println("Это не целое число!");
                    scanner.next();
                    return;
                }
                int[] arr20 = new int[len20];
                System.out.println("Введите числа:");
                for (int i = 0; i < len20; i++) {
                    if (scanner.hasNextInt()) {
                        arr20[i] = scanner.nextInt();
                    } else {
                        System.out.println("Это не целое число!");
                        scanner.next();
                        return;
                    }
                }
                System.out.println("Массив:");
                for (int i = 0; i < len20; i++) {
                    System.out.print(arr20[i] + " ");
                }
                System.out.println();
                System.out.println("Введите x: ");
                int x20 = scanner.nextInt();
                System.out.println("Индексы вхождений x: ");
                int[] res20 = s.findAll(arr20, x20);
                s.printArray(res20);
                break;
            default:
                System.out.println("Неверный ввод!");
        }
    }
}
