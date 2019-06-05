package com.jm.Stepik_03_05_03;


import java.util.Arrays;

class SpamAnalyzer extends KeywordAnalyzer {

    private String[] keywords;

    SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }

    @Override
    public Label processText(String text) {
        if (true) {
            for (int i = 0; i < keywords.length; i++) {
                if (text.contains(keywords[i])) return getLabel();
            }
            return getLabel();
        } else {
            return Label.OK;
        }
    }
}
