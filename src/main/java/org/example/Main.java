package org.example;
import java.util.Scanner;

class Main

{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Привет пользователь!\nДля начала выбери что ты хочешь");
        System.out.println("1-Регистрация\n2-Формулки");
        int id = in.nextInt();
        if (id == 1)
        {
            registration();
        }
        else
            formulki();

    }

    public static void registration()
    {
        System.out.println("Ты выбрал регистрацию,так что давай знакомиться!");
        System.out.println("Введи фамилию: ");
        in.nextLine();
        String sn = in.nextLine();
        System.out.println("Введи имя: ");
        String nm = in.nextLine();
        System.out.println("Введи отчество: ");
        String mn = in.nextLine();
        System.out.println("Введи почту: ");
        String pc = in.nextLine();
        System.out.println("Введи номер телефона: ");
        String nb = in.nextLine();
        System.out.println("Сколько тебе лет?: ");
        int v = in.nextInt();
        if (v < 18)
        {
            System.out.println("Iди гуляй");
        }
        else
        {
            System.out.println("Старик");
        }
    }

    public static void formulki()
    {
        System.out.println("Вы выбрали режим формул");
        System.out.println("Введите диаметр для нахождения P,S,R");
        float d = in.nextFloat();
        float r = d / 2;
        float p = 2 * (float) Math.PI * r;
        float s = (float) (Math.PI * r * r);

        // Вывод результатов
        System.out.println("\nВот что вышло:");
        System.out.println("Радиус: " + r);
        System.out.println("Периметр: " + p);
        System.out.println("Площадь: " + s);
    }

    }
