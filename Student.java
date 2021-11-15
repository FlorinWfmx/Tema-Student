public class Student {
    String nume;
    int grupa;
    char serie;
    int anStudiu;
    String facultate;
    double [] note = new double [] {4,7,8,9};


    Student() {
    }


    Student(String nume, String facultate, int anStudiu, double[] note) {

        this.nume = nume;
        this.grupa = grupa;
        this.facultate = facultate;
        this.anStudiu = anStudiu;
        this.note = note;
    }

    Student(String nume, char serie, double[] note) {
        this.nume = nume;
        this.serie = serie;
        this.note = note;
     }
    
//Urmeaza metoda sePrezinta
    String sePrezinta(){
        String prezentare = "Studentul " + this.nume + " este elev la " + this.facultate + " in anul "
                + this.anStudiu + ", avand notele ";
        return prezentare;
    }
    
//Urmeaza metoda getMedie

     double getMedie() {
         double medie = 0;
         for (int i = 0; i < note.length; i++) {
             medie = medie + note[i] / note.length;
         }

         return medie;
     }
    
//Urmeaza metoda getMin

     int getMin(){
             int notaMin = (int) note[0];
             int i;
             for (i = 0; i < note.length; i++) {
                 if (note[i] < notaMin)
                     notaMin = (int) note[i];
             }
             return notaMin;
         }

//Urmeaza metoda getMax

     int getMax(){
        int notaMax = (int) note[0];
        int i;
        for (i=0; i<note.length; i++){
            if (note[i]>notaMax){
                notaMax= (int) note[i];
            }
        }
        return notaMax;
     }

//Urmeaza metoda esteIntegralist

     String esteIntegralist() {
         String pesteCinci = null;
         int i;
         for (i = 0; i < note.length; i++) {
             if (note[i] > 5) {
                 pesteCinci = " este integralist, neavand note sub 5";
             } else {
                 pesteCinci = " nu este integralist, avand note sub 5";
             }
            }
         return pesteCinci;
     }
}
