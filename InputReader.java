import java.util.Scanner;
import java.lang.Double;

public class InputReader {
  public static boolean correctArabic, correctRoman;
  public static String[] operationSplit;
  public static String operand;
  public static String a, b;
  public static double op1, op2;
  public static void checker() {
    Scanner in = new Scanner(System.in);
    String operation = in.nextLine();
    correctArabic = operation.matches("^(10|[1-9]) ?[+/*-] ?(10|[1-9])$");
    correctRoman = operation.matches("^(X|IX|IV|VI{0,3}|I{1,3}) ?[+/*-] ?(X|IX|IV|VI{0,3}|I{1,3})$");
    in.close();
    operationSplit = operation.split("(?<= ?[+/*-])|(?=[+/*-]) ?");
    if (correctArabic == true | correctRoman == true){
      for (int i = 0; i < operationSplit.length; i++)                operationSplit[i] = operationSplit[i].trim();
      a = operationSplit[0];
      b = operationSplit[2];
      operand = operationSplit[1];   
      
    } else {
        try { 
          op1 = Double.parseDouble(operationSplit[0]);
          op2 = Double.parseDouble(operationSplit[2]);
        } catch (NumberFormatException e) {
            if (operationSplit.length <= 2) {
              throw new ArithmeticException("Строка не является математической операцией!");
            } else if (!correctRoman) {
                throw new ArithmeticException("Используются одновременно разные системы счисления!");
            }
          }
    
      } if ((op1 != (int)op1) | (op2 != (int)op2)) {
              throw new ArithmeticException("Нецелое число!");
        }
  }
}