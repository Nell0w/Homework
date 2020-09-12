/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

import java.util.Scanner;

/**
 *
 * @author nello
 */
public class Homework {

    public static void main(String[] args) {
        String result = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваш год: ");
        int userInput = scanner.nextInt();
        int animal = userInput % 12;
        int color = userInput % 10;
        switch (color){
            case 0 -> result = "белой";
            case 1 -> result = "белого";
            case 2 -> result = "чёрной";
            case 3 -> result = "чёрного";
            case 4 -> result = "синей";
            case 5 -> result = "синего";
            case 6 -> result = "красной";
            case 7 -> result = "красного";
            case 8 -> result = "желтой";
            case 9 -> result = "желтого";
        }
        switch (animal){
            case 0:
                result += " обезьяны";
                break;
            case 1:
                result += " петуха";
                break;
            case 2:
                result += " собаки";
                break;
            case 3:
                result += " свиньи";
                break;
            case 4:
                result += " крысы";
                break;
            case 5:
                result += " быка";
                break;
            case 6:
                result += " тигра";
                break;
            case 7:
                result += " заяца";
                break;
            case 8:
                result += " дракона";
                break;
            case 9:
                result += " змеи";
                break;
            case 10:
                result += " лошади";
                break;
            case 11:
                result += " овцы";
                break;
        }
        System.out.println("Год " + result);

    }
}
