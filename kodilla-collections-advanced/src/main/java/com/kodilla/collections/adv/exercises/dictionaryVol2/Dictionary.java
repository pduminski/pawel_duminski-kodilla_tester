package com.kodilla.collections.adv.exercises.dictionaryVol2;

import java.util.*;

public class Dictionary {
    Map<String, List<EnglishWord>> dictionary = new HashMap<>();

    public void addWord(String polishWord, EnglishWord englishWord) {
        List<EnglishWord> englishWords = dictionary.getOrDefault(polishWord, new ArrayList<>());
        englishWords.add(englishWord);
        dictionary.put(polishWord, englishWords);
    }

    public List<EnglishWord> returnEnglishWords(String polishWord) {
        return dictionary.getOrDefault(polishWord, Collections.emptyList());
    }

    public List<EnglishWord> returnEnglishWords(String polishWord, PartOfSpeech partOfSpeech) {
        List<EnglishWord> englishWordsWithGivenPartOfSpeech = new ArrayList<>();
        for (EnglishWord englishWord : dictionary.getOrDefault(polishWord, Collections.emptyList())) {
            if (englishWord.getPartOfSpeech().equals(partOfSpeech))
                englishWordsWithGivenPartOfSpeech.add(englishWord);
        }
        return englishWordsWithGivenPartOfSpeech;
    }

    public int size() {
        return dictionary.size();
    }
}
