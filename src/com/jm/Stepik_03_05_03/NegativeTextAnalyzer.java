package com.jm.Stepik_03_05_03;

class NegativeTextAnalyzer extends KeywordAnalyzer {

    private String[] negative = {
            ":(",
            "=(",
            ":|",
    };

    @Override
    protected String[] getKeywords() {
        return negative;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }

    @Override
    public Label processText(String text) {
        Label label = null;
        for (int i = 0; i < negative.length; i++) {
            if (text.contains(negative[i])) {
                label = getLabel();
                break;
            } else {
                label = Label.OK;
            }
        }
        return label;
    }
}
