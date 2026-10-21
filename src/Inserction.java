public class Inserction {
    public int[] sort(int[] arreglo) {
        for(int i = 1; i < arreglo.length; i++){
            int key = arreglo[i];
            int j = i - 1;
            while(j >= 0 && arreglo[j] < key){
                arreglo[j + 1] = arreglo[j]; 
                if (arreglo[j] < key) {
                    System.out.println("El aux= " + key + " " + "se inserta en la pos " + (j));
                }
                j--;
                // el j-- es para que se pueda comparar con el siguiente elemento del arreglo   
                
                
            
            }
            arreglo[j + 1] = key;
            
        }
        return arreglo;
    }

}
