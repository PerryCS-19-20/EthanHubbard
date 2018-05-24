class Main extends ConsoleProgram {
  public void run() {
    System.out.println("Please answer the following questions in numbers without the percent sign. Ex: I want a 89.5%, so I enter in 89.5");
    System.out.println("");

    while(true){
      double first = readDouble("What is your current grade? ");
      double second = readDouble("What grade do you want? ");
      double third = readDouble("What is the exam weight? ");
      first = first / 100;
      second = second / 100;
      third = third / 100;
      Calculate YEET = new Calculate(first, second, third);
      System.out.println("Calculating... ");
      if(first == 0) {
       System.out.println("you're stupid i dont think theres any coming back from that but here u go: ");
      }
      System.out.println(Math.round(YEET.calc()*100.0)/100.0 + "%");
      System.out.println("");
    }
  }
}
