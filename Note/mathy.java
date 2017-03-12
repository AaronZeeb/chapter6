import java.text.DecimalFormat;
import java.text.NumberFormat;
//import cs1.Keyboard;
//import javax.swing.*;

public class mathy
{
    private int [][] square;

    /**
        default constructor - stubed in

    */
    public mathy()
    {
            //System.out.println ("hi from default constructor");

    }

    public mathy(int [][] array)
    {
        square = array;

    }



    /**
        take the absoulute value of the number
        @param int value
        @return absoulute value of number
    */
    public int abs (int x)
    {
        if (x < 0)
            x = -x;

        return x;



    }//end of abs
    //}end of class

    /**
        takes the odd numbers out of an array
        @param int[] values
        @return int[] odd values in the array
    */

    public int[] getOdd ( int[] num1)
    {   int i = 0;
        int z = 0;
        int [] odd = new int[num1.length];
        
        for ( ; i < num1.length; i++)
        {
            if (num1[i]%2 != 0)
                {
                    odd[z] = num1[i];
                    z++;
                }      
        }
        
        return odd;
    }//end of getOdd
    
    /**
     * takes the even numbers out of an array
     * @param int[] values, int[] even values
     * @return none
     */
    public void getEven(int[] num, int evennum [])
    {
        int i = 0;
        int z = 0;
        
        int[] even = new int[num.length];
        
        
        for( ; i < num.length; i++)
        {
            if (num[i]%2 == 0)
            {
                even[z] = num[i];
                z++;
            }
        }
        
        
        //[] evenum = new int[] even;
    }//end of getEven


    /**
        two int parameters and adds them
        @param 2 int values
        @return int sum of values
    */


    public int add (int x, int y)
    {   //System.out.println(sum );
        int sum;      //sum x and y are local var
        sum = x+y;

        return sum;


    }//end of add


    public double add (double x,double y)
    {

        return x+y;
    }
    
    /**
     * displays marbles
     */
    public void display(int [] row1, int [] row2, int [] row3, int [] row4)
    {
        
        for (int m : row1)
        {
            System.out.print(m);            
        }
        
        System.out.println();
        
        for (int m : row2)
        {
            System.out.print(m);            
        }
        
        System.out.println();
        
        for (int m : row3)
        {
            System.out.print(m);            
        }
        
        System.out.println();
        
        for (int m : row4)
        {
            System.out.print(m);            
        }
        
        System.out.println();
    }
    
    /**
            message from Mathy class
            @param none
            @return String message
    */


    public String toString()
    {
        return ("Hi what do you want?, I'm just Mathy");

    }


    public void switchThem (int[] a1, int a2[])
    {
        int [] temp = a1;




    }
    public void count(int[] a1, int[] a2)
    {
        for (int i : a1)
            a2[i] ++;



    }

    
    /**
     * return total of entire 2d array
     */
    public static int sum2DArray(int [][] scores)
    {
        int sum = 0;


        for ( int row=0; row < scores.length; row++)
        {
            for ( int col=0; col < scores[row].length; col++)
            {
                System.out.print (scores[row][col] + "\t");
                sum += scores[row][col];
            }
            System.out.println();
        }


        return sum;

    }
    
    /**
     * gets the sum of one row of the array
     */
    public int sumOneRow2DArray(int [][] array, int row)
    {   int total = 0;
        
        
        for (int col = 0; col < array[row].length; col++)
        {
                System.out.print (array[row][col] + "\t");
                total += array[row][col];
            
        }



        return total;

    }

        /**
     * gets the sum of one coloumn of the array
     */
    public int sumOneCol2DArray(int [][] array, int col)
    {   int total = 0;
        

        for ( int row=0; row < array.length; row++)
        {
            System.out.print (array[col] + "\t");
            total += array[row][col];
            
            System.out.println();
        }
    


        return total;

    }
    
    public int[] sumall2DArray(int [][] scores)
    {
        int [] temp = {1,2,3,4,};




        return temp;
    }
    

    
    /**
        Doubles the size of an array
        @param int []
        @return int [] twice the size, with values copied over
    */
    public static int[] doubleSize(int[] array)
    {
       //make temp 2 times the size of array
       int[] temp = new int[array.length * 2];
       System.out.println(temp.length +"-" );

        //copy all the values over to new array
       for (int i = 0; i < array.length; i++)
            temp[i] = array[i];

        //old array changes reference to new larger array
       array = temp;

       return array;

    }

   

   
   
   
   
    public int MagicSquare(int[][]square ,int col)
    {
        int magicnum = 0;
        for ( int row=0; row < array.length; row++)
        {
            System.out.print (array[col] + "\t");
            magicnum += array[row][col];
            System.out.println();
        }
    }
  
    public boolean isMagic(int[][]square, int magicnum)
    {
        //Checks each row
        for ( int i = 0; i < array.length; i++)
        {
            //Finds the sum of row [i
            int sum = 0;
            for ( int j = 0; j < array.length; j++)
                sum += square[i][j];
            // If this row does not equal the magic sqaure number then it returns false
            if (sum != 15)
                return false;
        }

        //Checks each column
        for (int j = 0; j < array.length; j++)
        {
            //Finds the sum of column #j
            int sum = 0;
            for (int i = 0; i < array.length; i++)
                sum += square[i][j];

            //If this column does not equal the magic sqaure number then it returns false
            if (sum != magicnum)
                return false;
        } 
        
        //Checks forward diagonal
        int amount=0;
        for(int row=0; row < array.length; row++)
        {
            for(int col=0; col<square[row].length;col++)
            {
                amount+=square[row][col];
                if (amount!=magicnum)
                return false;
            }
        }
        //Checks backward diagonal
        amount=0;
        amount+=square[0][2];
        amount+=square[1][1];
        amount+=square[2][0];
        if (amount!= magicnum)
            return false;

        return true;
    }
    
    public int getMagicNum(int magicnum)
    {
        return magicnum;
    }
    
    public int setMagicSquare(int [][]square,int[][]square1,int [][]square2)
    {
        int count=0;
        if(count==0)
        {
            count++;
            return square;
        }
        else if(count==1)
        {
            count++;
            square=square1;
            return square;
        }
        else if(count==2)
        {
            count++;
            square=square2;
            return square;
        }
    }
    
}//end of class