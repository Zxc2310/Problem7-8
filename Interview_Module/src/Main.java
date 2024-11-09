package Package_Interview;


public class Main {
    public static void main(String[] args) {

        Class_Interview interviewee = new Class_Interview();
        interviewee.Score = 85; // You can set any score here
        System.out.println("Interviewee's information:");
        interviewee.ScoreInfo(); // Display calculated score

        System.out.println("\nInterview Questions:");
        interviewee.DisplayQuestions(); // Display questions

        // Create an instance of Class_VisaAndFlight
        Class_VisaAndFlight travelInfo = new Class_VisaAndFlight();

        System.out.println("\nAvailable Visa Types:");
        travelInfo.DisplayVisa_Avaible(); // Display visa options

        System.out.println("\nAvailable Flights:");
        travelInfo.DisplayFlight(); // Display flight options
    }
}
