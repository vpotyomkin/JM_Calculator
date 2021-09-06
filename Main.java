class Main {
  public static void main(String[] args) {
    InputReader.checker();

    if (InputReader.correctArabic) {
      double a = Double.parseDouble(InputReader.a);
      double b = Double.parseDouble(InputReader.b);
      if ((int)a == a) {
        switch(InputReader.operationSplit[1]) {
          case("+"): 
            System.out.println((int)(a+b));
            break;
          case("-"): 
            System.out.println((int)(a-b));
            break;
          case("*"): 
            System.out.println((int)(a*b));
            break;
          case("/"): 
            System.out.println((int)(a/b));
        }
      }
    } else if (InputReader.correctRoman) {
        int a = Converter.Roman.valueOf(InputReader.a).toInt();
        int b = Converter.Roman.valueOf(InputReader.b).toInt();
        switch(InputReader.operationSplit[1]) {
          case("+"): 
            System.out.println(Converter.toRoman((int)(a+b)));
            break;
          case("-"):
            if ((a-b)<1) throw new ArithmeticException("Результат операции с римскими числами не может быть отрицательным!");
            System.out.println(Converter.toRoman((int)(a-b)));
            break;
          case("*"): 
            System.out.println(Converter.toRoman((int)(a*b)));
            break;
          case("/"): 
            System.out.println(Converter.toRoman((int)(a/b)));
        }
      }
    }
  }
