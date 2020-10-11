package com.kodilla.collections.adv.exercises.dictionaryVol2;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DictionaryTestSuite {
    @Test
    public void shouldAddWordToDictionary() {
        // given
        Dictionary dictionary = new Dictionary();
        String polishWord = "samochód";
        EnglishWord englishWord = new EnglishWord("Car", PartOfSpeech.NOUN);
        // when
        dictionary.addWord(polishWord, englishWord);
        // then
        assertEquals(1, dictionary.size());
    }
    @Test
    public void shouldReturnZeroIfNoElementsWereAddedToDictionary() {
        // given
        Dictionary dictionary = new Dictionary();
        // when
        // nothing added
        // then
        assertEquals(0, dictionary.size());
    }

    @Test
    public void shouldReturnEnglishWordsCorrespondingToGivenPolishWord() {
        // given
        Dictionary dictionary = new Dictionary();
        dictionary.addWord("stos", new EnglishWord("stack", PartOfSpeech.NOUN));
        dictionary.addWord("gra", new EnglishWord("play", PartOfSpeech.NOUN));
        dictionary.addWord("gra", new EnglishWord("game", PartOfSpeech.NOUN));
        dictionary.addWord("grać", new EnglishWord( "play", PartOfSpeech.VERB));
        // when
        List<EnglishWord> result = dictionary.returnEnglishWords("gra");
        // then
        List<EnglishWord> expectedList = new ArrayList<>();
        expectedList.add(new EnglishWord("play", PartOfSpeech.NOUN));
        expectedList.add(new EnglishWord("game", PartOfSpeech.NOUN));
        assertEquals(expectedList, result);
    }

    @Test
    public void shouldReturnEnglishWordsCorrespondingToGivenPolishWord_onlyForParticularPartOfSpeech() {
        // given
        Dictionary dictionary = new Dictionary();
        dictionary.addWord("stos", new EnglishWord("stack", PartOfSpeech.NOUN));
        dictionary.addWord("brać", new EnglishWord("brotherhood", PartOfSpeech.NOUN));
        dictionary.addWord("brać", new EnglishWord("take", PartOfSpeech.VERB));
        dictionary.addWord("grać", new EnglishWord( "play", PartOfSpeech.VERB));
        // when
        List<EnglishWord> result = dictionary.returnEnglishWords("brać", PartOfSpeech.NOUN);
        // then
        List<EnglishWord> expectedResult = new ArrayList<>();
        expectedResult.add(new EnglishWord("brotherhood", PartOfSpeech.NOUN));
        assertEquals(expectedResult, result);
    }

}