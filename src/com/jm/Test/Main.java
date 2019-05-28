package com.jm.Test;


import com.jm.Stepik_03_05_03.*;

public class Main {

    interface TextAnalyzer {

        Label processText(String text);
    }

    enum Label {
        SPAM, NEGATIVE_TEXT, TOO_LONG, OK
    }

    abstract class KeywordAnalyzer implements TextAnalyzer {

        protected abstract String[] getKeywords();
        protected abstract Label getLabel();

        @Override
        public Label processText(String text){
            return null;
        }
    }

    class SpamAnalyzer extends KeywordAnalyzer {

        private String[] keywords;

        SpamAnalyzer(String[] keywords){
            this.keywords = keywords;
        }

        @Override
        protected String[] getKeywords(){
            return keywords;
        }

        @Override
        protected Label getLabel(){
            return Label.SPAM;
        }

        @Override
        public Label processText(String text) {
            boolean spam = false;
            for (int i = 0; i < keywords.length; i++) {
                if (text.contains(keywords[i])) {
                    spam = true;
                }
            }
            if (spam) {
                return getLabel();
            } else {
                return Label.OK;
            }
        }
    }

    class NegativeTextAnalyzer extends KeywordAnalyzer {

        private String[] negative = {
                ":(",
                "=(",
                ":|",
        };

        @Override
        protected String[] getKeywords(){
            return negative;
        }

        @Override
        protected Label getLabel(){
            return Label.NEGATIVE_TEXT;
        }

        @Override
        public Label processText(String text) {
            boolean neg = false;
            for (int i = 0; i < negative.length; i++) {
                if (text.contains(negative[i])) {
                    neg = true;
                }
            }
            if (neg) {
                return getLabel();
            } else {
                return Label.OK;
            }
        }

    }

    class TooLongTextAnalyzer implements TextAnalyzer {

        private int maxLength;

        public TooLongTextAnalyzer (int maxLength) {
            this.maxLength = maxLength;
        }

        @Override
        public Label processText (String text) {
            if (text.length() > maxLength) {
                return Label.TOO_LONG;
            } else {
                return Label.OK;
            }
        }
    }


    public static Label checkLabels(TextAnalyzer[] analyzers, String text) {

        if (analyzers[0].processText(text).equals(Label.SPAM))
            return Label.SPAM;

        if (analyzers[0].processText(text).equals(Label.OK) &
                analyzers[1].processText(text).equals(Label.NEGATIVE_TEXT))
            return Label.NEGATIVE_TEXT;

        if (analyzers[0].processText(text).equals(Label.OK) &
                analyzers[1].processText(text).equals(Label.OK) &
                analyzers[2].processText(text).equals(Label.TOO_LONG))
            return Label.TOO_LONG;
        else {
            return Label.OK;
        }
    }
}






