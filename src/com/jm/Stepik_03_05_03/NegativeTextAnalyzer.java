package com.jm.Stepik_03_05_03;

class NegativeTextAnalyzer extends KeywordAnalyzer {

    private String[] keywords = {
            ":(",
            "=(",
            ":|",
    };

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
