public class Esercizio3 {
    public static void main(String[] args) {
        System.out.println("esercizio 3 !");
        System.out.println(perimetroRettangolo(2,3));
        System.out.println(pariOdispari(12));
        System.out.println(areaTriangolo(3,4,5));
    }
    public static double perimetroRettangolo(double l1, double l2){
        return (l1+l2) * 2;
    }
    public static int pariOdispari(int num1){
        return num1 % 2 == 0 ? 0 : 1;
    }
    public static double areaTriangolo(double a, double b, double c){
        double p = (a + b + c)/2;
        return Math.sqrt((p*(p-a)*(p-b)*(p-c)));
    }
}
