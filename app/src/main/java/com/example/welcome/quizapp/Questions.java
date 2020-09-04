package com.example.welcome.quizapp;

public class

Questions {
    public String nQuestions[]={
            "which is the first planet in the solar system?",
            "which is the second planet in the solar system?",
            "which is the third planet in the solar system?",
            "which is the fourth planet in the solar system?",
            "which is the fifth planet in the solar system?",
            "which is the sixth planet in the solar system?",
            "which is the seventh planet in the solar system?",
            "which is the eight planet in the solar system?",
            "which is the ninth planet in the solar system?"

    };

    private String nChoices [][] = {
            {"Mercury","Venus","Earth","Mars"},
            {"Saturn","Venus","Earth","Mars"},
            {"Neptune","Venus","Pluto","Earth"},
            {"Jupiter","Uranus","Mars","Saturn"},
            {"Uranus","Venus","Earth","Mars"},
            {"Pluto","Jupiter","Saturn","Mercury"},
            {"Venus","Earth","Uranus","Mars"},
            {"Mercury","Venus","Jupiter","Neptune"},
            {"Pluto","Earth","Jupiter","Neptune"}

    };
    private String nCorrectAnswers [] = {"Mercury","Venus","Earth","Mars","Uranus","Jupiter","Saturn","Neptune","Pluto"
    };

    public String getquestion(int a){
        String question = nQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice = nChoices[a][0];
        return choice;
    }
    public String getChoice2(int a){
        String choice = nChoices[a][1];
        return choice;
    }
    public String getChoice3(int a){
        String choice = nChoices[a][2];
        return choice;
    }
    public String getChoice4(int a){
        String choice = nChoices[a][3];
        return choice;
    }
    public String getCorrectAnswers(int a){
        String answer = nCorrectAnswers[a];
        return answer;
    }

}
