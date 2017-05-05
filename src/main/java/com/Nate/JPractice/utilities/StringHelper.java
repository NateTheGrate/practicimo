package com.Nate.JPractice.utilities;

import java.util.ArrayList;

/**
 * Created by Nathanael on 5/4/2017.
 */
public class StringHelper {

    /**
     * Takes in one giant line of tab-separated terms
     * and turns them into pairs of flash cards.
     * @param text
     * @return the paired strings
     */
    public static ArrayList<String[]> pairBuilder (String text) {
        // tab character in java is '\t'
        ArrayList<String[]> pairs = new ArrayList<String[]>();

        // break string up into just the terms
        String[] noTab = text.split("\t");

        // order is important here, so no for each loop
        for( int i = 0; i < noTab.length; i+=2){
            String[] pair = {noTab[i], noTab[i + 1]};
            pairs.add(pair);
        }

        // output pairs
        return pairs;
    }

}
