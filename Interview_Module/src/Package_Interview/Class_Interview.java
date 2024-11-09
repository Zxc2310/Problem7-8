package Package_Interview;

public class Class_Interview {
    public int IntervieweeID;
    public String Name;
    public int Score;

    {
        IntervieweeID = 19;
        Name = "Rahman";

        System.out.println("Interviewee's ID is " + " " + IntervieweeID);
        System.out.println("Interviewee's name  is " + " " + Name);
    }
    String[] Questions={" What is the purpose of your trip to the US?",
            "How long do you plan to stay in the US? The length of your stay will depend on your purpose of travel.",
            " What are your plans while in the US? Where will you be staying?",
            "Have you traveled to the US before? Have you ever been denied a visa to any country?",
            "Do you have family members in your home country? What properties or assets do you have in your home country? "};
    public void DisplayQuestions(){
        for(int z =0; z < Questions.length; z++){
            System.out.println(Questions[z]);
        }
    }


    public void ScoreInfo(){
        int Cal2 = 4;
        int totalScore;
        totalScore = Score * Cal2;
        System.out.println("Total Score is " + " " +totalScore);
    }
}
