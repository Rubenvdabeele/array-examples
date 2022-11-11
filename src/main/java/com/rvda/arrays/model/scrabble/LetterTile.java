package com.rvda.arrays.model.scrabble;

import java.util.AbstractMap;
import java.util.Map;

public class LetterTile {
    public static enum Character {
        A,
        B,
        C,
        D,
        E,
        F,
        G,
        H,
        I,
        J,
        K,
        L,
        M,
        O,
        N,
        P,
        Q,
        R,
        S,
        T,
        U,
        V,
        W,
        X,
        Y,
        Z,
    }

    private Character character;

    private static Map<Character, Integer> letterValues;

    static {
        // There are lots of ways to define this kind of map.
        // Even better would be to do this based on an external file.
        // The below resulst in an immutable hashmap! That's good, we will not need to change it on the fly.
        // Hashmaps and maps: https://www.w3schools.com/java/java_hashmap.asp
        // Initializing hashmaps the java 9 way: https://www.baeldung.com/java-initialize-hashmap
        // Immutability and its advantages: https://en.wikipedia.org/wiki/Immutable_object
        letterValues = Map.ofEntries(
            new AbstractMap.SimpleEntry<Character, Integer>(Character.A,1),
            new AbstractMap.SimpleEntry<Character, Integer>(Character.B,3),
            new AbstractMap.SimpleEntry<Character, Integer>(Character.C,3),
            new AbstractMap.SimpleEntry<Character, Integer>(Character.D,2),
            new AbstractMap.SimpleEntry<Character, Integer>(Character.E,1),
            new AbstractMap.SimpleEntry<Character, Integer>(Character.F,4),
            new AbstractMap.SimpleEntry<Character, Integer>(Character.G,2),
            new AbstractMap.SimpleEntry<Character, Integer>(Character.H,4),
            new AbstractMap.SimpleEntry<Character, Integer>(Character.I,1),
            new AbstractMap.SimpleEntry<Character, Integer>(Character.J,8),
            new AbstractMap.SimpleEntry<Character, Integer>(Character.K,5),
            new AbstractMap.SimpleEntry<Character, Integer>(Character.L,1),
            new AbstractMap.SimpleEntry<Character, Integer>(Character.M,3),
            new AbstractMap.SimpleEntry<Character, Integer>(Character.N,1),
            new AbstractMap.SimpleEntry<Character, Integer>(Character.O,1),
            new AbstractMap.SimpleEntry<Character, Integer>(Character.P,3),
            new AbstractMap.SimpleEntry<Character, Integer>(Character.Q,10),
            new AbstractMap.SimpleEntry<Character, Integer>(Character.R,1),
            new AbstractMap.SimpleEntry<Character, Integer>(Character.S,1),
            new AbstractMap.SimpleEntry<Character, Integer>(Character.T,1),
            new AbstractMap.SimpleEntry<Character, Integer>(Character.U,1),
            new AbstractMap.SimpleEntry<Character, Integer>(Character.V,4),
            new AbstractMap.SimpleEntry<Character, Integer>(Character.W,4),
            new AbstractMap.SimpleEntry<Character, Integer>(Character.X,8),
            new AbstractMap.SimpleEntry<Character, Integer>(Character.Y,4),
            new AbstractMap.SimpleEntry<Character, Integer>(Character.Z, 10)
        );
    }

    protected LetterTile(Character character){
        this.character = character;
    }

    public Character getCharacter(){
        return this.character;
    }

    public Integer getPointValue(){
        return letterValues.get(this.character);
    }
}
