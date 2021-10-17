package calculator;

class StringCalculator {

    public int add(String input) {
      if(isEmpty(input))
      {
          return 0;
      }
        return stringToInt(input);
    }
    public booleaan isEmpty(string input)
    {
        return input.isEmpty();
    }
    private int StringToInt(String input)
    {
        return Integer.parseInt(input);
    }
}
