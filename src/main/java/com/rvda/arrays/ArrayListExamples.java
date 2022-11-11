package com.rvda.arrays;

import java.util.ArrayList;

import com.rvda.arrays.model.scrabble.LetterBag;
import com.rvda.arrays.model.scrabble.LetterTile;
import com.rvda.arrays.model.scrabble.OutOfLetterTilesException;



public abstract class ArrayListExamples {
    public static void arrayListExamples(){
        ArrayList<LetterTile> scrabbleHand = new ArrayList<>();

        LetterBag bag = new LetterBag();

        try { 
            scrabbleHand.add(bag.pullLetterTile());
            scrabbleHand.add(bag.pullLetterTile());
            scrabbleHand.add(bag.pullLetterTile());
            scrabbleHand.add(bag.pullLetterTile());
            scrabbleHand.add(bag.pullLetterTile());
            scrabbleHand.add(bag.pullLetterTile());
            scrabbleHand.add(bag.pullLetterTile());
        } catch(OutOfLetterTilesException e){
            System.out.println(e);
        }

        // The below will not compile! The LetterTile constructor is protected, and only accessible within the scrabble package.
        // this means only the LetterBag object can make new tiles!
        // LetterTile myLetterTile = new LetterTile(LetterTile.Character.A);
        // Same goes for the outoflettertiles exception!
        // OutOfLetterTilesException e = new OutOfLetterTilesException();
        
        String currentHandString = "";
        for(int i = 0; i  < scrabbleHand.size(); i ++){
            currentHandString += scrabbleHand.get(i).getCharacter().toString();
            currentHandString += scrabbleHand.get(i).getPointValue().toString();
            currentHandString += ", ";
        }

        // Skip the for loop and use lambda functions to operate on elements of an ArrayList!
        // Looks complicated but does the same as the loop underneath.
        Integer totalScoreLambda = scrabbleHand.stream().reduce(0,(runningTotal, currentLetter) -> runningTotal + currentLetter.getPointValue(), Integer::sum);

        Integer totalScoreForLoop = 0;
        for(int i = 0; i  < scrabbleHand.size(); i ++){
            totalScoreForLoop += scrabbleHand.get(i).getPointValue();
        }

        System.out.println("CurrentHand " + currentHandString);

        System.out.println("Score:  " + totalScoreLambda);
        System.out.println("Score:  " + totalScoreForLoop);
    }
}
