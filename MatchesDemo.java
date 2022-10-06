//определить, является ли строка всеми числами
public class MatchesDemo
{
	public static void main(String[] args) {
    String str = "123456789";
    String reg = "\\d+"; //шаблон сопоставления регулярных выражений. (содержит только числа)
    boolean b= str.matches(reg);//возращает True, если str соответсвует reg(то есть содержит только числа)
    System.out.println(b);
                                            }
}
