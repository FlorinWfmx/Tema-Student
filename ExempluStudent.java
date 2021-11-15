public class ExempluStudent {
    public static void main (String[]args){


        double [] noteStudent1 = new double[]{5,9,6,8};
        Student s1 = new Student ("Ion", "Info", 2, noteStudent1);
        System.out.print (s1.sePrezinta());
        for (double nota : noteStudent1){
            System.out.print (nota + " ");

        }

        System.out.print (".\n");


        double [] noteStudent2 = new double[]{7,8,10,4};
        Student s2 = new Student ("Dan", "Mate", 3, noteStudent2);
        System.out.print (s2.sePrezinta());
        for (double nota : noteStudent2){
            System.out.print (nota + " ");

        }
        System.out.print (".\n");


        double [] noteStudent3 = new double[]{10,7,8,6};
        Student s3 = new Student ("Ana", "Chimie", 1, noteStudent3);
        System.out.print (s3.sePrezinta());
        for (double nota : noteStudent3){
            System.out.print (nota + " ");

        }
        System.out.print (".\n");

        System.out.println ("Media notelor elevului " + s1.nume + " este "+ s1.getMedie()+ ".");
        System.out.println (s1.nume + s1.esteIntegralist()+ ".");

        System.out.println ("Media notelor elevului " + s2.nume + " este "+ s2.getMedie()+ ".");
        System.out.println (s2.nume + s2.esteIntegralist()+ ".");

        System.out.println ("Media notelor elevului " + s3.nume + " este "+ s3.getMedie()+ ".");
        System.out.println (s3.nume + s3.esteIntegralist()+ ".");

    }
}
