import java.util.Scanner;

public class Console {
    public String setVariable() {
        Scanner scan = new Scanner(System.in);
        String answer, variable = null;
        int counter = 1;

        do {
            answer = scan.nextLine();

            // is empty form check
            if (answer.isEmpty()) {
                System.out.print("ОШИБКА! Вы ничего не ввели, укажите пожалуйста правильное значение: ");
            }

            // whanna out check
            else if (answer.equals("q") || answer.equals("Q")) {
                System.out.print("Вы действительно хотите выйти?  Y/N  ");
                answer = scan.nextLine();
                if (answer.equals("Y") || answer.equals("y")) {
                    System.out.println("До свидания!");
                    counter = 0;
                } else System.out.print("Повторите ввод параметра: ");
            }

            // wrong simbol contains check


            else {
                variable = answer;
                counter = 0;
            }
        } while (counter == 1);



        return variable;
    }
}

