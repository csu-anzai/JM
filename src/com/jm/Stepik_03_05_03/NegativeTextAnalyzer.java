package com.jm.Stepik_03_05_03;

import java.util.ArrayList;

class NegativeTextAnalyzer extends KeywordAnalyzer {

    String[] negative = {
            ":(",
            "=(",
            ":|",
    };

    @Override
    protected String[] getKeywords() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < keywords.length; i++){
            for (int j = 0; j < negative.length; j++){
                if (keywords[i].contains(negative[j])){
                    arrayList.add(keywords[i]);
                    System.out.println(keywords[i]);
                }
            }
        }
        String[] result = new String[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++){
            result[i] = arrayList.get(i).toString();
        }
        return result;
    }

    @Override
    protected String getLabel() {
        return null;
    }

    @Override
    public Label processText(String text){
        return null;
    }

}
