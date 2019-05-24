package com.jm.Stepik_03_05_03;

class TooLongTextAnalyzer implements TextAnalyzer {

    private int maxLength;

    TooLongTextAnalyzer (int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public Label processText (String text) {
        return null;
    }
}


