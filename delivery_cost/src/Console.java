import java.util.Scanner;

// Пофиксить вылет когда пробел между цифрами
// Вылет если две точки

public class Console {
    public String setVariable() {
        Scanner scan = new Scanner(System.in);
        String answer, variable = null;
        int counter = 1;

        do {
            answer = scan.nextLine().trim();

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
                    // ДОБАВИТЬ ФЛАГ НА ПРЕРЫВАНИЕ ПОТОКА
                } else System.out.print("Повторите ввод параметра: ");
            }

            // wrong simbol contains check via ASCII code
            else if (counter == 1) {
                for (int i = 0; i < answer.length(); i++) {
                    byte b = (byte) answer.charAt(i);
                    if (b < 46 || b > 57 || b == 47) {
                        System.out.println("ОШИБКА! Данные содержат недопустимые символы");
                        System.out.print("Повторите ввод параметра: ");
                        break;
                    } else {
                        variable = answer;
                        counter = 0;
                    }
                }
            }
        } while (counter == 1);

        return variable;
    }
}

