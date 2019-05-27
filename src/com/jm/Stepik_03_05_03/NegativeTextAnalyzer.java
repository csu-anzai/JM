package com.jm.Stepik_03_05_03;

import java.util.ArrayList;

class NegativeTextAnalyzer extends KeywordAnalyzer {

    private String[] negative = {
            ":(",
            "=(",
            ":|",
    };

    @Override
    //возвращаем найденные негатив-слова
    protected String[] getKeywords(){
        ArrayList arrayListNegative = new ArrayList();
        for (int i = 0; i < negative.length; i++){
            if (negative[i].contains(text)){
                arrayListNegative.add(negative[i]);
                System.out.println(negative[i]);
            }
        }
        String[] resultNegative= new String[arrayListNegative.size()];
        for (int j = 0; j < arrayListNegative.size(); j++){
            resultNegative[j] = arrayListNegative.get(j).toString();
        }
        return resultNegative;
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
            return Label.NEGATIVE_TEXT;
        } else{
            return Label.OK;
        }

    }

}
