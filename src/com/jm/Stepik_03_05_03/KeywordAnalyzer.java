package com.jm.Stepik_03_05_03;

import java.io.Serializable;
import java.lang.constant.Constable;

abstract class KeywordAnalyzer implements TextAnalyzer {

    protected abstract String[] getKeywords();
    protected abstract Label getLabel();

    @Override
    public Label processText(String text){
        return null;
    }
}
