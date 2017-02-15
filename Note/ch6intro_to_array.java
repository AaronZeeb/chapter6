/********************************************************************
// These are the notes for ch 6 used in hayes class


import
//******************************************************************* */


import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.*;
import java.util.StringTokenizer;
import java.util.*;
import java.util.ArrayList;
public class ch6intro_to_array

{
    final static int MAX = 20;

public static void main (String[] args)
{
    //this is a general ArrayList
    ArrayList list = new ArrayList();
    
    //Type of ArrayList holds only the Type
    ArrayList <String> farm=new ArrayList<>();
    
    farm.add("cow");
    farm.add("pig");
    farm.add("chicken");
    farm.add("duck");
    
    
    for(int i=0; i<20; i++)
    {
        farm.add("cow");
        farm.add("dog");
        farm.add("horse");
        farm.add("chicken");
        farm.add("chicken");
    }
    farm.add("dog");
    farm.add("horse");
    farm.add("pig");
    farm.add("pig");
    farm.add("sheep");
    
    System.out.println(farm);
    int count=0;
    for(int i=0;i<farm.size();i++)//remove i++
    {//for(int i=farm.size; i>=0; i++)
        if(farm.get(i).equals("cows"))
            count++;
        //.set() returns the object at that index
        //replaces the object
        //farm.set(i,"cat");
        
        //removes that object at that index
        //if you have to or more objects in a row it will not remove all of them
        if(farm.get(i).equals("chicken"))
            farm.remove(i);
        
        //removing all of them
        //my idea do the if twice
        if(farm.get(i).equals("chicken"))
        {
            //while(farm.remove("Chicken"))
            farm.remove(i);
            //i-1;
        }
        
        //else
           //i++;
    }
    System.out.println("-----------------------------------");
    System.out.println(farm);
    System.out.println("There are "+count+"cows");
    
    
    ArrayList <CD> mycds = new ArrayList<>();
    
    mycds.add(new CD("From within","HeadHunterz",);
    mycds.add("Headhunterz");
    mycds.add("$10.99");
    mycds.add("15");
    
/**/
       mathy useful= new mathy();
       int x = 50;
       int[] num = new int[1000];
       int[] values = new int[20];
       int[] oddnum = new int[num.length];
       int[] evennum = new int[num.length];
       int[] negnum = new int[MAX];
       
       String[] names = {"Charlie","Megan","Tadd","Patrick","Jake"};
       
       Random gen = new Random();
// pop with random numbers range -50 to 50
//have to index
//i<=length is the off by one error
       for(int i =0; i<num.length; i++)
       {
            num[i] = gen.nextInt(100)-50;
        }
//prints the array of int off by one error < not <=
       for(int i =0; i<num.length; i++)
       {
            System.out.println( num[i] );
        }
        
        oddnum=useful.getOdd(num);
        //for each look
        
        for (int s : num)
        {
            System.out.println(s);
        }


/**
 * System.out.println("----------SORTING-----------"  );
 */
     
/*
        int look = 42;
        System.out.println(Searches.linearSearch(num,look)  );
        System.out.println(num.length  );
        num = doubleSize(num);
        System.out.println(Searches.binarySearch(num,look)  );
/**

/*

        //Sorts.selectionSort(num);
        System.out.println(num.length  );
        num = doubleSize(num);



/*      odd(num,oddnum);

        System.out.println("---------------");

        for (int s : oddnum)
            System.out.println(s);



/*
        System.out.println("Enter a number");
        int find = Keyboard.readInt();

        System.out.println(Searches. binarySearch(num,find));

   /*
//searching for 412
          for (int i = 0; i < MAX; i++)
          x++;

      // for (int i = 0; i < MAX; i++)
        //  values[num[i]+25] ++;
        //  x++;
        //how do you count the #of times each value comes up?

       for( int i =0; i<num.length; i++)
            System.out.print("\t" + num[i]);

       //for (int i = 0; i<50;i++)
       //   System.out.println("The number of times" + (i-25) +"is" +
       //                       "\t" + values[i]);




/*
//it gets passed by vaule
       foo(num[0]);
       System.out.println("******"+num[0]);
       
//arrary gets passed by refernce and will change it 
       foo(num);
       System.out.println("$$$$$$$"+num[0]);
/*
       System.out.println(oddnum[7]);

       odd(num,oddnum);

       negnum = neg(num);

 */
//make a two demenstional array
int[][] table=new int[5][10];

//Load the table with values 
for(int row=0; row < table.length; row++)
    for(int col=0; col<table[row].length;col++)
        table[row][col]=row*10+col;

//print the table 
for(int row=0; row < table.length; row++)
{
    for(int col=0; col<table[row].length;col++)
        System.out.print(table[row][col]+"\t");
        
    System.out.println();
}
//2d arrays 
int[][]scores={ {1,2,3},//6
                {2,2,3},//7
                {3,2,3},//8
                {4,2,3} };//9
   System.out.println(scores[0].length+"col");
   System.out.println(scores.length+"row");
   
   System.out.println("The sum of the array is "+mathy.sum2DArray(scores));
   
   System.out.println(mathy.sumOneRow2DArray(scores,3));   
   System.out.println(mathy.sumOneRow2DArray(scores[3]));   
   
}// end of main
/**
   public static int[] doubleSize(int[] array)
   {


        return array;


   }

   public static void foo(int x)
   {
       x=100;

   }



    public static void foo(int [] num)
      {
          num[0]=100;
      }




   public static void odd(int[] m_num, int[] m_odd)
   {

       int count =0;


   }// end of odd

 //====================================================
     public static int[] neg(int[] m_num)
      {


       return negarray;
   }//end of neg
*/
}// end of class











