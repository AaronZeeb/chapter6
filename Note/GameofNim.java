//Kathy Zhou
//Aaron Zeeb

import java.util.Scanner;

public class GameofNim
{
    public static void main(String[] args)
    {
        //uses mathy to create display
        mathy display = new mathy();
        
        //creates 4 arrays with 1, 3, 5, and 7 values
        int[] row1 = new int[1];
        int[] row2 = new int[3];
        int[] row3 = new int[5];
        int[] row4 = new int[7];
        
        //adds 1 to each of the the rows for how long it is to represent marbles
        //row 1 has 1 marble
        for(int i = 0; i <row1.length; i++)
        {
            row1[i] = 1;
        }
        
        //row 2 has 3 marbles
        for(int i = 0; i <row2.length; i++)
        {
            row2[i] = 1;
        }
        
        //row 3 has 5 marbles
        for(int i = 0; i <row3.length; i++)
        {
            row3[i] = 1;
        }
        
        //row 4 has 7 marbles
        for(int i = 0; i <row4.length; i++)
        {
            row4[i] = 1;
        }
        
        //displays the marbles
        display.display(row1, row2, row3, row4);
        
        //creates an input
        Scanner keyboard = new Scanner(System.in);
        
        //sets up values for row, number and initializes count and turn
        int row, number;
        int count = 16; 
        int turn = 1;
        
        System.out.println();
                    
        //asks player one which row they would like to take marbles from
        System.out.println("Player 1");
        System.out.println("Which row would you like to take marbles from?");
        row = keyboard.nextInt();
        
        //how many marbles
        System.out.println("How many marbles would you like to take?");
        number = keyboard.nextInt();
        System.out.println();
        
        //while there is more than 1 marbles, the game continues 
        while (count > 1)
        {   
            //if user wants row 1
            if (row == 1)
            {
                //subtracts marbles from row by turning the 1 into a 0
                for (int i = 0; i < number; i++)
                    row1[i] = 0;
                
                //updates the total marbles
                count -= number;
            }
            //if user wants row 2
            else if (row == 2)
            {
                //subtracts marbles from row by turning the 1 into a 0
                for (int i = 0; i < number; i++)
                    //in case the value is already a 0, it changes the value from the other side
                    if (row2[i] != 0)   
                        row2[i] = 0;
                    else
                        row2[2-i] = 0;
                        
                //updates the total marbles
                count -= number;
            }
            //if user wants row 3
            else if (row == 3)
            {
                //subtracts marbles from row by turning the 1 into a 0
                for (int i = 0; i < number; i++)
                    //in case the value is already a 0, it changes the value from the other side
                    if (row3[i] != 0)   
                        row3[i] = 0;
                    else
                        row3[4-i] = 0;
                        
                //updates the total marbles
                count -= number;
            }
            //if user wants row 4
            else
            {
                //subtracts marbles from row by turning the 1 into a 0
                for (int i = 0; i < number; i++)
                    //in case the value is already a 0, it changes the value from the other side
                    if (row4[i] != 0)   
                        row4[i] = 0;
                    else
                        row4[6-i] = 0;
                        
                //updates the total marbles
                count -= number;
            }
            
            //displays the marbles
            display.display(row1, row2, row3, row4);
            
            System.out.println();

            
            //player turns
            if (turn %2 == 0) //player1 - if turn is divisible by 2
            {
                System.out.println();
                System.out.println("Player 1");
                
                //asks player which row they would like to take marbles from
                System.out.println("Which row would you like to take marbles from?");
                row = keyboard.nextInt();
                
                //how many marbles
                System.out.println("How many marbles would you like to take?");
                number = keyboard.nextInt();
                
                System.out.println();
                //updates turn
                turn++;
            }
            
            else{ //player 2
                System.out.println();
                System.out.println("Player 2");
                
                //asks player which row they would like to take marbles from
                System.out.println("Which row would you like to take marbles from?");
                row = keyboard.nextInt();
                
                //how many marbles
                System.out.println("How many marbles would you like to take?");
                number = keyboard.nextInt();
                
                System.out.println();
                //updates turn
                turn++;
            }
        }
        
        //displays message to players
        //calculates who won based on turn
        if (turn %2 == 0)
            System.out.println("Player 1, you win!");
        else
            System.out.println("Player 2, you win!");
    }    
}




//display function in mathy
/*
    /**
     * displays marbles
     *//*
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
    }*/

    
