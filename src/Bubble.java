public class Bubble {
    public int[] sort2(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++){

            // FOR j
            for(int j = 1; j < arreglo.length; j++){
                // COMPARACION if
                if(arreglo[j -1] > arreglo[j]){
                    // INTERCAMBIO DE VALORES
                    int aux = arreglo[j - 1];
                    arreglo[j - 1] = arreglo[j];
                    arreglo[j] = aux;
   
                }
            }
        }
        return null;

    


    }
}    

             
