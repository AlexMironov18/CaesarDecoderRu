package com.company;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String ruLetters = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        ArrayList<Character> lowerLetters = new ArrayList<>();
        ArrayList<Character> upperLetters = new ArrayList<>();
        for (int i = 0; i < ruLetters.length(); i++) {
            lowerLetters.add(ruLetters.charAt(i));
            upperLetters.add(ruLetters.toUpperCase().charAt(i));
        }

        String textToDecode = "Еъёчхф Вхзёюлх, адздёиу ф ждэщхб, црбх еёдюэчъщъгюъв южаижжзчх, ждчъёнъгжзчдв." +
                " Ъы зёюивй жёхчгюв бюнс ж ъы вдгивъгзхбсгрв аёхкдв. \n" +
                "Зъеъёс вгъ дмъчющгд, мзд гъюэцъьгджзс тздшд аёхкх фчбфъзжф жбъщжзчюъв гъждчъёнъгжзчх мъбдчъмъжадшд" +
                " югщючющиивх. \n" +
                "Ф юэимюб чхни южздёюу ю чгыж юэвъгъгюф, здмгъъ дзёхэюч еджздфггиу юэвъгмючджзс мъбдчъмъжаюк едёдадч." +
                " \n" +
                "Ю зъв гъ въгъъ, еджбъщдчхбх гъищхмх. Ф еёюнъб а чрчдщи, мзд чюгдя чжъви вдя югзъббъаз, х чдэвдьгд, " +
                "вды мёъэвъёгдъ жзёъвбъгюъ ад чжъви шхёвдгюмгдви. \n" +
                "Гхязю ёънъгюъ вгъ едвдшбх еёдшёхввх югзиюзючгдшд зюех, жеълюхбсгд ждэщхггхф щбф юэимъгюф " +
                "деёъщъбъггрк жздёдг мъбдчъмъжадя щиню. \n" +
                "Въгф вдьгд гхэчхзс дзлдв Вхзёюлр, х ъы, цъэ еёъичъбюмъгюф, вхзъёсу.";
        StringBuilder sourceText = new StringBuilder(textToDecode);

        int theShift = 0;
        for (int j = 0; j < ruLetters.length(); j++) {
            theShift++;
            for (int i = 0; i < textToDecode.length(); i++) {
                char c = textToDecode.charAt(i);
                if (lowerLetters.contains(c)) {
                    if (lowerLetters.indexOf(c) + theShift >= lowerLetters.size()) {
                        sourceText.setCharAt(i, lowerLetters.get(lowerLetters.indexOf(c) -
                                (lowerLetters.size() - theShift)));
                    } else {
                        sourceText.setCharAt(i, lowerLetters.get(lowerLetters.indexOf(c) + theShift));
                    }
                }
                if (upperLetters.contains(c)) {
                    if ((upperLetters.indexOf(c) + theShift) >= upperLetters.size()) {
                        sourceText.setCharAt(i, upperLetters.get(upperLetters.indexOf(c) -
                                (upperLetters.size() - theShift)));
                    } else {
                        sourceText.setCharAt(i, upperLetters.get(upperLetters.indexOf(c) + theShift));
                    }
                }
            }
            System.out.println(sourceText);
            System.out.println("");
        }
    }
}

