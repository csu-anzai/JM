package com.jm.Stepik_03_05_03;

abstract class KeywordAnalyzer implements TextAnalyzer {

    String[] key;

    protected abstract String[] getKeywords();
    protected abstract Label getLabel();

    @Override
    public Label processText(String text){
        return null;
    }
}
