public class Equations {
    static double hypotenous(double a, double b){
         double c = Math.sqrt((a * a) + (b * b));
        return c;

    }
    static double areaOfTriangle(double h, double b){

        double area = (h * b) /2;
        return area;

    }
    static double circumferenceOfSphere(double r){
       double circumference = 2 * Math.PI * r;
        return circumference;
    }

}
