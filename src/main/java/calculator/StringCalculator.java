package calculator;

class StringCalculator {

    public int add(String input) {
        
        String[] numbers=input.split(",");
    if(isEmpty(input))
      {
          return 0;
      }
        return Integer.parseInt(numbers[0] ) + Integer.parseInt(numbers[1]);
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
