package Iterator;

public class IteratorPattern {
    public static void main(String[]args){

            ArbreBinaire arbreBinaire = new ArbreBinaire();


        for (Iterator iter = arbreBinaire.getIterator();iter.hasNext();){
            String etiquette =(String)iter.next();
            System.out.println(etiquette);
        }

    }
}
