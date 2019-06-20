import java.util.Scanner;

public class Console {
    public String setVariable() {
        Scanner scan = new Scanner(System.in);
        String answer, variable = null;
        int counter = 1;

        do {
            answer = scan.nextLine();

            if (answer.isEmpty()) {
                System.out.print("ОШИБКА! Вы ничего не ввели, укажите пожалуйста правильное значение: ");
            } else {
                variable = answer;
                counter = 0;
            }
        } while (counter == 1);


//        if (answer.equals("q") || answer.equals("Q")) {
//            System.out.println("Я понял что ты заблудился");
//            // прервать выполнение программы?
//        }
//        // else if метод проверки на неправильные символы. Введите еще раз (поместить в цикл)
//        // else присваиваем переменной введенное число

        return variable;
    }
}

