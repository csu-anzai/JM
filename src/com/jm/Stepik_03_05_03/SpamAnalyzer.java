package com.jm.Stepik_03_05_03;

import java.util.ArrayList;

class SpamAnalyzer extends KeywordAnalyzer {

    //комментарии
    private String[] keywords;
//    private String text;

    //конструктор от массива строк с ключевыми словами
    SpamAnalyzer(String[] keywords){
        this.keywords = keywords;
//        this.text = text;
    }

    @Override
    //возвращаем найденные спам-слова
    protected String[] getKeywords(){
        return keywords;
    }

    @Override
    //возвращаем метку
    protected String getLabel(){
        return null;
    }

    @Override
    //здесь анализируем текст
    public Label processText(String text) {
        boolean spam = false;
        for (int i = 0; i < keywords.length; i++) {
            if (keywords[i].contains(text)) {
                spam = true;
            }
        }
        if (spam) {
            return Label.SPAM;
        } else {
            return Label.OK;
        }
    }
}
