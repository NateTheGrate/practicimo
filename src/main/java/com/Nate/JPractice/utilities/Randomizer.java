package com.Nate.JPractice.utilities;

import java.util.Random;

/**
 * Created by Nathanael on 5/4/2017.
 * Wrapper class for random numbers
 */
public class Randomizer {

    public int m_lowerBound;
    public int m_upperBound;
    private Random r;

    public Randomizer(int upperBound) {
        m_lowerBound = 0;
        m_upperBound = upperBound;
        r = new Random();
    }

    public Randomizer(int upperBound, int lowerBound) {
        m_lowerBound = lowerBound;
        m_upperBound = upperBound;
        r = new Random();
    }

    public int getRandomInt () {
        // get a random int with an upper and lower bound
        return r.nextInt(m_upperBound - m_lowerBound) + m_lowerBound;
    }


}
