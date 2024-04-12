class Distance{
    int meters;
    int centimeters;
    Distance(int meters, int centimeters){
        this.meters=meters;
        this.centimeters=centimeters;
    }
    void display(){
        System.out.println("Distance: "+ meters+ " meters and "+centimeters+" centimeters.");
    }
    Distance sum(Distance d1, Distance d2){
        int totMeters=d1.meters+d2.meters;
        int totCentimeters= d1.centimeters+ d2.centimeters;
        if (totCentimeters>=100){
            totMeters+=totCentimeters/100;
            totCentimeters%=100;
        }
        return new Distance(totMeters,totCentimeters);
    }
}

public class HAQ_4 {
    public static void main(String[] args) {
        Distance d1= new Distance(5,90);
        Distance d2= new Distance(3,40);
        Distance d3= d1.sum(d1,d2);
        System.out.println("Two distances are: ");
        d1.display();
        d2.display();
        System.out.println("Sum of distances: ");
        d3.display();
   }
}
