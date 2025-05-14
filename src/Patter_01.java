import java.util.Scanner;
public class Patter_01 {
    public static void main(String[] args) {
        for(int row = 1 ; row <= 5 ; row++)
        {
            if(row % 2 != 0) {   // 1 // 2

                for (int col = 1; col <= row; col++) {  // col = 1 , row = 1
                    if (col % 2 == 0) {
                        System.out.print("0");
                    } else {
                        System.out.print("1");
                    }
                    System.out.print(" ");
                }
                System.out.println();
            }
            else
            {
                for(int col = 1 ; col <= row ; col++) // 2
                {
                    if(col % 2 == 0)
                    {
                        System.out.print("0");
                    }
                    else
                    {
                        System.out.print("1");
                    }
                    System.out.print(" ");
                }
                System.out.println();
            }

        }

    }
}


  /*
 --         1
            0 1
 --         1 0 1           row - 3 , n = 5 , col - 3  // 1
            0 1 0 1
  --        1 0 1 0 1

           odd row- 1 se shuru hona chahiye
           odd col - 1 se shuru hora hai

           even row - 0 se shuru hon chahiye

           even col - 0








             */
