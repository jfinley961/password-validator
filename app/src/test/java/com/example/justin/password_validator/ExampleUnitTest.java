package com.example.justin.password_validator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void passwordTest() throws Exception {
        assertTrue(MainActivity.passwordStrength("Abcdefgh2%"));
        assertFalse(MainActivity.passwordStrength("password"));
        assertFalse(MainActivity.passwordStrength("abcdefg"));
        assertFalse(MainActivity.passwordStrength("Abcdefgh2"));
        assertTrue(MainActivity.passwordStrength("CCCcc234876^&*"));
        assertFalse(MainActivity.passwordStrength("239834ASJHDKJHASKD&^*&^"));
        assertTrue(MainActivity.passwordStrength("A^&7634hjksdf98234kksdfHKJSF"));
    }
    @Test
    public void lowerCaseTest()throws Exception {
        assertFalse(MainActivity.isLowerCase('A'));
        assertTrue(MainActivity.isLowerCase('a'));
    }
    @Test
    public void upperCaseTest() throws Exception {
        assertTrue(MainActivity.isUpperCase('Z'));
        assertFalse(MainActivity.isUpperCase('z'));
    }
    @Test
    public void numberTest() throws Exception {
        assertTrue(MainActivity.isNumber('5'));
        assertFalse(MainActivity.isNumber('~'));
    }
    @Test
    public void symbolTest() throws Exception {
        assertTrue(MainActivity.isSpecialCharacter('%'));
        assertFalse(MainActivity.isSpecialCharacter('j'));
    }
}