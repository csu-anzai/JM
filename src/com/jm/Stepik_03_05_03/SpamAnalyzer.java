package com.jm.Stepik_03_05_03;

import java.util.ArrayList;

class SpamAnalyzer extends KeywordAnalyzer {

    //комментарии
    private String[] keywords;

    //наш фильтр
    String[] spam = {
            "фак",
            "спам",
            "черт побери"
    };

    //конструктор от массива строк с ключевыми словами
    SpamAnalyzer(String[] keywords){
        this.keywords = keywords;
    }

    @Override
    //возвращаем набор ключевых слов
    protected String[] getKeywords(){
        ArrayList arrayListSpam = new ArrayList();
        for (int i = 0; i < keywords.length; i++){
            for (int j = 0; j < spam.length; j++){
                if (keywords[i].contains(spam[j])){
                    arrayListSpam.add(keywords[i]);
                    System.out.println(keywords[i]);
                }
            }
        }
        String[] resultSpam = new String[arrayListSpam.size()];
        for (int i = 0; i < arrayListSpam.size(); i++){
            resultSpam[i] = arrayListSpam.get(i).toString();
        }
        return resultSpam;
    }

    @Override
    //возвращаем метку которой будем помечать срабатывание
    protected String getLabel(){
        return null;
    }

    @Override
    //здесь анализируем текс в соответствии со спам словами
    public Label processText(String text) {
        if (getKeywords().length != 0) {
            return Label.SPAM;
        } else {
            return Label.OK;
        }
    }
}
