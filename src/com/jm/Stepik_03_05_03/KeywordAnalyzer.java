package com.jm.Stepik_03_05_03;

abstract class KeywordAnalyzer implements TextAnalyzer {

    protected abstract String[] getKeywords();
    protected abstract Label getLabel();

    @Override
    public Label processText(String text){
        for (String s : getKeywords()) {
            if (text.contains(s)) {
                return getLabel();
            }
        } return Label.OK;
    }
}
