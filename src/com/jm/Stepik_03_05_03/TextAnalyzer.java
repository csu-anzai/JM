package com.jm.Stepik_03_05_03;

interface TextAnalyzer {

    enum Label {
        SPAM, NEGATIVE_TEXT, TOO_LONG, OK
    }

    Label processText(String text);
}
