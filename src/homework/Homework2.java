/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

/**
 *
 * @author nello
 */
import java.util.Random;
import java.util.Scanner;

class Homework2 {

    public static void main(String[] args) {
        System.out.println("Тест для проверки знания таблицы умножения!");
        int trueExample = 0;
        int mathExamples = 5;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        while (mathExamples > 0) {
            mathExamples--;
            System.out.println("Сколько будет?: ");
            int firstNumber = random.nextInt((10 - 1) + 1);
            int secondNumber = random.nextInt((10 - 1) + 1);
            int result = firstNumber * secondNumber;
            System.out.println(firstNumber + " * " + secondNumber + " = ?");
            System.out.println("Ответ: ");
            int userResult = scanner.nextInt();
            if (userResult == result) {
                System.out.println("Правильно, ты угадал!");
                trueExample++;
            }else {
                System.out.println("Не правильно! Подумай лучше!");
            }
                if (mathExamples == 0){
                    switch (trueExample){
                        case 0:
                        case 1:
                            System.out.println();
                            System.out.println("Ты знаешь что такое математика?");
                            System.out.println("Твоя оценка: " + trueExample);
                            break;
                        case 2:
                            System.out.println();
                            System.out.println("Нужно учить таблицу умножения!");
                            System.out.println("Твоя оценка: " + trueExample);
                            break;
                        case 3:
                        case 4:
                            System.out.println();
                            System.out.println("Надо бы еще поучить!");
                            System.out.println("Твоя оценка: " + trueExample);
                            break;
                        case 5:
                            System.out.println();
                            System.out.println("Молодец!");
                            System.out.println("Твоя оценка: " + trueExample);
                            break;
                    }
                }
        }
    }
}