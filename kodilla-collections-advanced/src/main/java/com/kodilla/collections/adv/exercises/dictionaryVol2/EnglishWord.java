package com.kodilla.collections.adv.exercises.dictionaryVol2;

import java.util.Objects;

public class EnglishWord {
    private String englishWord;
    private PartOfSpeech partOfSpeech;

    public EnglishWord(String englishWord, PartOfSpeech partOfSpeech) {
        this.englishWord = englishWord;
        this.partOfSpeech = partOfSpeech;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public PartOfSpeech getPartOfSpeech() {
        return partOfSpeech;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnglishWord that = (EnglishWord) o;
        return Objects.equals(englishWord, that.englishWord) &&
                partOfSpeech == that.partOfSpeech;
    }

    @Override
    public int hashCode() {
        return Objects.hash(englishWord, partOfSpeech);
    }
}
