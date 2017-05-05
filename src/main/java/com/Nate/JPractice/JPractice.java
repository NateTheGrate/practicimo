package com.Nate.JPractice;

import com.Nate.JPractice.utilities.FileHelper;
import com.Nate.JPractice.utilities.Randomizer;
import com.Nate.JPractice.utilities.StringHelper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Nathanael on 5/4/2017.
 */
public class JPractice {

    public static Scanner scan = new Scanner(System.in);

    public static void main (String[] args) {
        ArrayList<String[]> cards = getPairs();
        Randomizer r = new Randomizer(cards.size());
        for (int i = 0; i < 10; i++) {
            System.out.println(cards.get(r.getRandomInt())[0]);
        }

    }

    /**
     * basically just initialize everything
     * @return
     */
    public static ArrayList<String[]> getPairs() {

        ArrayList<String[]> pairs = new ArrayList<String[]>();

        try {
            File file = new File(scan.nextLine());
            String text = FileHelper.getText(file);
            pairs = StringHelper.pairBuilder(text);
        }
        catch (IOException e) {
            // do something
        }

        return pairs;
    }
}
