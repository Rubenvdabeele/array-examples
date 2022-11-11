package com.rvda.arrays;

import java.util.Scanner;

public abstract class ArrayExamples {

    @SuppressWarnings("unused")
    public static void arrayExamples(){
        //Declaration
        int[] myArray;

        //Initialization
        myArray = new int[2]; //[0,0]

        //Initializing elements
        myArray[0] = 1;
        myArray[1] = 2;
        //myArray[2] = 3; // Error! Out-of-bounds.
        //myArray[-1] = 3; // Error! Out-of-bounds.

        //Shortcut Syntax 
        int[] myArrayShortcut = {1,2};

        //Overwriting elements? No problem!
        myArray[0] = 9999;
        myArray[0] = myArray[1];

        //Accessing elements
        System.out.println("First element " + myArray[0]);
        System.out.println("First element " + myArray[1]);
        //System.out.println("First element" + myArray[2]); //Error! Out-of-bounds.
        int myNumber = myArray[0];
        //String myString = myArray[1]; //Error! The array contains ints, not Strings!

        //More Examples!
        String[] studentNames = {"Josh", "Peter", "Anna", "Sofie"};
        boolean[] truthValues = {true, false, true};
        double[] prices = new double[2];
        prices[0] = 0.4567;
        prices[1] = 0.555;

        System.out.println("Length : " + prices.length);

        //Length of an Array ( = number of elements)
        int studentsArrayLength = studentNames.length;
        System.out.println("Amount of students : " + studentsArrayLength);

        //Arrays of Arrays (Multidimensional Arrays)
        int[][] myMatrix = new int[2][2];//Square matrix, A list of 2 lists of integers
        myMatrix[0][0] = 55;
        myMatrix[0][1] = 66;
        myMatrix[1][0] = 75;
        myMatrix[1][1] = 86;
        System.out.println("Columns " + myMatrix.length);
        System.out.println("Rows in the first column " + myMatrix[0].length);
        System.out.println("Rows in the second column " + myMatrix[1].length);

        //More multidimensional/nested arrays, anything goes!
        String[][][] myStringList = new String[2][2][2]; // 1 list of 2 lists of 2 lists of 2 strings!
        String[][][] myStringListShort = {{{"a", "b"},{"c","d"}},{{"a","b"},{"c","d"}}};
        int[][] myNonSquareMatrix = new int[5][3];
        int[][] myJaggedArray = {{1,2,3}, {1,2}}; // A list of 1 list of 3 integers and one list of 2 integers!


        //Guess the output!
        int[] anotherArray = {1,2,3,4};

        System.out.println(anotherArray[1]);

        System.out.println(anotherArray.length);

        System.out.println(anotherArray[4]);

        System.out.println(anotherArray[1]);

        anotherArray[1] = 6;
        
        System.out.println(anotherArray[1]);
    }

    public static void fillArray(){
        Scanner inputScanner = new Scanner(System.in);
        Integer[] array = new Integer[5];
        int currentIndex = 0;
        while(true)
        {
            System.out.println("Add a number to the array, type exit to quit.");
            System.out.println(String.format("Current: %s", arrayToString(array)));
            if(currentIndex == array.length  ){
                System.out.println("The array is full!");
                break;
            }
            String input = inputScanner.nextLine().trim();
            if(input.equals("exit")){
                break;
            }
            try {
                int newInteger = Integer.parseInt(input);
                array[currentIndex] = newInteger;
                currentIndex++;
            } catch(NumberFormatException  e){
                System.out.println(String.format("%s is not a valid integer.", input));
                continue;
            }
            
        }
        inputScanner.close();
    }

    public static String arrayToString(Object[] array){
        String output = new String();
        output += "[ ";
        for(int i = 0; i < array.length; i++){
            output += (array[i] == null ? "x" : array[i].toString());
            // Needs Comma?
            output +=  (i == array.length - 1 ?  " " : ", " );
        }
        output += "]";
        return output;
    }
}
