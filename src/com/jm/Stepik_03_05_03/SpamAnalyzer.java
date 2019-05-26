package com.jm.Stepik_03_05_03;

import java.util.ArrayList;

class SpamAnalyzer extends KeywordAnalyzer {

    //комментарии
    private String[] keywords;
    private String text;

    //конструктор от массива строк с ключевыми словами
    SpamAnalyzer(String[] keywords, String text){
        this.keywords = keywords;
        this.text = text;
    }

    @Override
    //возвращаем найденные спам-слова
    protected String[] getKeywords(){
        ArrayList arrayListSpam = new ArrayList();
            for (int i = 0; i < keywords.length; i++){
                if (keywords[i].contains(text)){
                    arrayListSpam.add(keywords[i]);
                    System.out.println(keywords[i]);
                }
            }
        String[] resultSpam = new String[arrayListSpam.size()];
        for (int j = 0; j < arrayListSpam.size(); j++){
            resultSpam[j] = arrayListSpam.get(j).toString();
        }
        return resultSpam;
    }

    @Override
    //возвращаем метку
    protected String getLabel(){
        if (getKeywords().length > 0) {
            return "найдено";
        } else {
            return "не найдено";
        }
    }

    @Override
    //здесь анализируем текст
    public Label processText(String text) {
        if (getKeywords().length > 0 && getLabel().equals("найдено")){
            return Label.SPAM;
        } else{
            return Label.OK;
        }

    }
}
