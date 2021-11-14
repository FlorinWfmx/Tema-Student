public class ExempluStudent {
    public static void main (String[]args){
        Student s1 = new Student ("Ion", 14, "Info", 2);
        Student s2 = new Student ("Dan", 24, "Mate", 3);
        Student s3 = new Student ("Ana", 18, "Chimie", 1);



        System.out.println (s1.sePrezinta());
        System.out.println (s2.sePrezinta());
        System.out.println (s3.sePrezinta());

        System.out.println ("Media notelor elevului " + s1.nume + " este "+ s1.getMedie());

        System.out.println (s1.nume + s1.esteIntegralist());

    }
}
