package com.Nate.JPractice.utilities;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Nathanael on 5/4/2017.
 * Makes files exported from anki usable
 */
public class FileHelper {

    /**
     * gets the the single line of text from the anki export (note form)
     * @param file
     * @return text from file
     * @throws IOException
     */
    public static String getText(File file) throws IOException {
        Scanner reader = new Scanner(file, "UTF-8");
        String text = "";
        while (reader.hasNext()) {
            text += reader.nextLine();
        }
        reader.close();
        return text;
    }

}
