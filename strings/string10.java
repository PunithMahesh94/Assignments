class Tester{

   public static void main(String[] args)

   {

          Scanner input=new Scanner(System.in);

          System.out.print("enter a string:");

          String str=input.nextLine();

           

          

          System.out.print("enter character u want to count:");

           char ch=input.next().charAt(0);

          

          CharacterCounter cc=new CharacterCounter();

   int count=cc.countCharacter(str,ch);



          System.out.println("no of occurence of character "+ch +" is "+count);

}

}
