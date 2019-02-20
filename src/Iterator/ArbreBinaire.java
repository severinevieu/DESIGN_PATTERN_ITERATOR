package Iterator;

public class ArbreBinaire implements Container {
    public String etiquette [] = {"fils gauche", "fils droit"};


    @Override
    public Iterator getIterator(){
        return new EtiquetteIterator();

    }

    private class EtiquetteIterator implements Iterator{

        int index;

        @Override
        public boolean hasNext() {

            if (index < etiquette.length){
                return true;
        }
                return false;
        }

        @Override
        public Object next() {
           if (this.hasNext()){
               return etiquette[index++];
           }

            return null;
        }
    }
}



