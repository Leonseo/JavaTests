import java.util.Scanner;
 
/*
   * Функция: обнаружение законности пароля
   1. Пароль должен содержать не менее 8 символов.

  2. Пароль может содержать только буквы и цифры.

  3. Пароль должен содержать не менее 2 цифр.
 * 
 */
public class RegexDemo {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();
        if(true == isValid(password)) {
                         System.out.println («Правильный формат пароля»);
        } else {
                         System.out.println («Неверный формат пароля»);
        }
    }
 
    public static boolean isValid(String password) {
                 if (password.length () <8) {// Проверка длины пароля
            return false;
        } else {
            int numberCounter = 0;
            for(int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                                 if (! Character.isLetterOrDigit (c)) {// Убедитесь, что пароль состоит из цифр и букв
                                   //Character.isLetterOrDigit (c) - возвращает True , если (c) - буква или цифра
                    return false;
                }
                                 if (Character.isDigit (c)) {// подсчитать количество цифр в пароле
                                  //Character.isDigit (c) - возращает True если (с)- является числом
                    numberCounter++;
                }
            }
                         if (numberCounter <2) {// Убедитесь, что пароль содержит не менее 2 цифр
                return false;
            }
        }
        return true;
    }
}
