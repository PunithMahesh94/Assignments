class StringModifier{

      int position;

      StringBuffer str;

      char ch;

           

      public StringBuffer insertCharacter(String str,char ch,int position)

      {

          this.str=new StringBuffer(str);

          this.ch=ch;

          this.position=position;

          this.str.insert(position-1,ch);

          return this.str;

      }

}

class Tester{

   public static void main(String[] args)

   {

          Scanner input=new Scanner(System.in);

          System.out.print("enter a string:");

          String str=input.nextLine();

           

          System.out.print("enter character u want to insert:");

          char ch=input.next().charAt(0);

          System.out.print("enter position at which u want to insert:");

          int position=input.nextInt();

          // int len=str.length();

          if(position>str.length()+1)

            System.out.println("plz enter 1-"+(str.length()+1)+"position only");

          else{

          StringModifier sb=new StringModifier();

  StringBuffer strB = new StringBuffer() ;

          strB=sb.insertCharacter(str,ch,position);



          System.out.println(strB);}

}

}
