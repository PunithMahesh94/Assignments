class CharacterCounter{

       

      String str;

      char ch;

      int count=0;    

      public int countCharacter(String str,char ch)

      {

          this.str=str;

          this.ch=ch;

          for(int i=0;i<str.length();i++)

           { if(str.charAt(i)==ch)

                count++;

           }

           return count;

           

           

      }

}
