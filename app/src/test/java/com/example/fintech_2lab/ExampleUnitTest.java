package com.example.fintech_2lab;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        int res =counter.getWordsCount("Grazios dienos");
        assertEquals(2, res);

          res =counter.getWordsCount("Labai grazios dienos");
        assertEquals(3, res);

          res =counter.getWordsCount("Saule  ");
        assertEquals(1, res);

         res =counter.getWordsCount("");
        assertEquals(0, res);


          res =counter.getCharsNoSpaceCount("Lietus");
        assertEquals(6, res);

         res =counter.getCharsNoSpaceCount("   ");
        assertEquals(0, res);

         res =counter.getCharsNoSpaceCount("Mieste labai daug zmoniu");
        assertEquals(21, res);
    }
}