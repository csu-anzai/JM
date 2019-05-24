package com.jm.Stepik_03_05_03;

class SpamAnalyzer extends KeywordAnalyzer {

    private String[] keywords;

    SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }

    @Override
    protected String getKeywords(){
        return null;
    }

    @Override
    protected String getLabel(){
        return null;
    }

    @Override
    public Label processText(String text) {
        return null;
    }
}
