package Package_Interview;

public class    Class_VisaAndFlight {
    String[] Visa={"UK Visa", "USA Visa", " Candan Visa", "Visitor's Visa","Student's Visa", "Tourist's Visa"};
    public void DisplayVisa_Avaible(){
        for(int i = 0; i < Visa.length; i++){
            System.out.println(Visa[i]);
        }
    }
String[] Flight={"Ethiopian Airline", "RwandAir", "Uganda Airlines", "Air France", "Kuwait Airways"};
    public void DisplayFlight(){
        for(int j=0; j < Flight.length; j++){
            System.out.println(Flight[j]);
        }
    }
}
