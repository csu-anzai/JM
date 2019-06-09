package com.jm.Stepik_03_05_03;

abstract class KeywordAnalyzer implements TextAnalyzer {

    String[] key;

    protected abstract String[] getKeywords();
    protected abstract Label getLabel();

    @Override
    public Label processText(String text)
    {
//        if (true){
//            for (int i = 0; i < key.length; i++){
//                if (text.contains(key[i])) return getLabel();
//            }
//            return getLabel();
//        } else {
//            return Label.OK;
//        }
        return null;
    }
}
