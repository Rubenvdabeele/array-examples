package com.rvda.arrays.model.scrabble;

import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class LetterBag {
    
    private Integer tilesLeft;

    public LetterBag(){
        this.tilesLeft = 20;
    }

    public LetterTile pullLetterTile() throws OutOfLetterTilesException{

        if(tilesLeft == 0) {
            throw new OutOfLetterTilesException();
        }

        // This list could be made static, since we only need to convert the enum list to an ArrayList once.
        // It is a workaround and mixes displayvalues with logical values.
        List<LetterTile.Character> possibleCharacters = Arrays.asList(LetterTile.Character.values());

        //Infinite scrabble bag of holding!
        Random rand = new Random();
        LetterTile.Character pickedLetter = possibleCharacters.get(rand.nextInt(possibleCharacters.size()));

        tilesLeft -= 1;

        return new LetterTile(pickedLetter);
    }
}
