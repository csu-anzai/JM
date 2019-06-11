package com.jm.Stepik_03_05_03;

abstract class KeywordAnalyzer implements TextAnalyzer {

    protected abstract String[] getKeywords();
    protected abstract Label getLabel();

    @Override
    public Label processText(String text){
        Label label = Label.OK;
        for (String s : getKeywords()) {
            if (text.contains(s)) label = getLabel();
        } return label;
    }
}
