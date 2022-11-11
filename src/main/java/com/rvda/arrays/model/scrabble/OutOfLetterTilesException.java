package com.rvda.arrays.model.scrabble;

public class OutOfLetterTilesException extends Exception {
    protected OutOfLetterTilesException(){
        super("This bag contains no more Letters.");
    }
}
