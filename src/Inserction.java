public class Inserction {
    public int[] sort(int[] arreglo) {
        for(int i = 1; i < arreglo.length; i++){
            int key = arreglo[i];
            int j = i - 1;
            while(j >= 0 && arreglo[j] < key){
                arreglo[j + 1] = arreglo[j]; 
                /*
                el número que estaba en la posición j se copia 
                y se mueve un espacio hacia la derecha (j + 1)
                */
                if (arreglo[j] < key) {
                    System.out.println("El aux= " + key + " " + "se inserta en la pos " + (j));
                }
                j--;
                /* 
                el j-- es para que se deje de comparar el valor de key con el valor 
                del arreglo en la posición j, y se pase a la siguiente posición del arreglo,
                hasta que se encuentre la posición correcta para insertar el valor de key.
                */
                arreglo[j + 1] = key;
            
            }
            
            /* 
            Ejemplo Educativo en pasada1:
             Como j en la pasada1 termina en -1 sale del bucle y 
             se va al arreglo donde se suma [j + 1] que da 0, nos da a entender que ahora la llave 
             (key) que es 6 se va a insertar en la posición 0 del arreglo y el arreglo va a quedar 
             ordenado de mayor a menor.

             arreglo[j + 1] = key no puede estar dentro del while porque si lo ponemos dentro del while, 
             el valor de key se va a insertar en la posición j + 1 cada vez que se cumpla la condición 
             del while, y no es lo que queremos, queremos que se inserte en la posición correcta después 
             de que se haya terminado de comparar con todos los elementos del arreglo.
             */
            
        }
        return arreglo;
    }

}
