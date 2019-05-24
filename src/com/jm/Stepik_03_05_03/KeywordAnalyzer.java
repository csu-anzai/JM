package com.jm.Stepik_03_05_03;

abstract class KeywordAnalyzer implements TextAnalyzer {

    abstract String getKeywords();
    abstract String getLabel();

    @Override
    public abstract Label processText(String text);



}
