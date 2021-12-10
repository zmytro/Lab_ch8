package lab_ch8_darvis;

public class Ex8_5_Time2TestModified {
    public static void main(String[] args){
        Ex8_5_Time2Modified time1 = new Ex8_5_Time2Modified();             // 00:00:00
        Ex8_5_Time2Modified time2 = new Ex8_5_Time2Modified(2);            // 02:00:00
        Ex8_5_Time2Modified time3 = new Ex8_5_Time2Modified(21, 34);       // 21:34:00

        System.out.println("TIME1");
        System.out.printf("     %s\n", time1.toUniversalString());
        System.out.printf("     %s\n", time1.toString());

        System.out.println("TIME2");
        System.out.printf("     %s\n", time2.toUniversalString());
        System.out.printf("     %s\n", time2.toString());

        System.out.println("TIME3");
        System.out.printf("     %s\n", time3.toUniversalString());
        System.out.printf("     %s\n", time3.toString());


        System.out.println("TIME4");
        try{
            Ex8_5_Time2Modified time4= new Ex8_5_Time2Modified(27, 74, 99);
        }catch(IllegalArgumentException e){
            System.out.printf("\nОшибка %s\n",
                    e.getMessage());
        }
    }
    } // end class Time2Test


/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/


