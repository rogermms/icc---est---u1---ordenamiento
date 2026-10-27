import java.util.Arrays;
import java.util.Comparator;

import models.Estudiante;

public class App {
    public  static void main(String[] args) throws Exception {
        //runEjemplosPrimitivos();
        //runEjemplosObjeto()
        runComparators();
     
    }
    private static void runComparators() {
        Integer[] original = {5,6,4,1,2,3};

        Arrays.sort(original, Comparator.reverseOrder());
        //Se modifica el int como Integer para que imprima como objeto y ya no como dato
        /*  
        /el sort de la clase Arrays ordena el arreglo original de menor a mayor naturalmente
        /solo en el caso de los primitivos, para objetos se necesita un comparador
        /los estaticos se pueden llamar sin instanciar la clase, es decir, 
        /sin crear un objeto de la clase
        */ 
       
        
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + " - ");
        }

    }
    private static void runEjemplosObjeto(){
        Estudiante e1 = new Estudiante("Juan",10.0);

        Estudiante[] estudiantes = {e1,
            new Estudiante("Maria", 7.0),
            new Estudiante("Diego", 3.5),
            new Estudiante("Pedro", 6.8)
            //Cuando son numeros su orden es ascendente
        };
        Bubble bubble = new Bubble();
        System.out.println("Original:");
        printEstudiantes(estudiantes);
        bubble.sortEstudiantes(estudiantes);
        System.out.println("Ordenado Asc:");
        printEstudiantes(estudiantes);


        



    }
    
    public static void runEjemplosPrimitivos() {
        int [] original = {5, 6, 4, 1, 2, 3};
        /**
         * el arreglo original no se puede modificar, por eso 
         * se hace un clon de este para que se pueda usar en 
         * los dos metodos de ordenamiento
         */
        int [] b = original.clone();
        int [] c = original.clone(); 
        int [] d = original.clone();
        /**
         * el clone sirve para que el arreglo original no se modifique 
         * y se pueda usar en los dos metodos de ordenamiento
         */ 

        // USAR METODO DEL ARCHIVO(clase) BUBBLE
        System.out.println("---------------------------------------------------");
        // INSTANCIAR el archivo BUBBLE
        // INSTANCIA la clase BUBBLE
        System.out.println("Original:");
        Bubble bubble = new Bubble();
        // EJECUTAR CODIGO DEL ARCHIVO BUBBLE USO LA INSTANCIA bubble
        printArray(b);
        bubble.sort(b);
        printArray(b);
        
        System.out.println("---------------------------------------------------");
        /// Instanciar el archivo SELECTION
        Selection selection = new Selection();
        printArray(c);
        selection.sort(c);
        printArray(c);
        /*
        el sort sirve para llamar el metodo de ordenamiento SELECTION, se le 
        pasa el arreglo c que es una copia del arreglo original, 
        para que se pueda usar en los dos metodos de ordenamiento y
        el printArray para imprimir el arreglo ordenado despues de usar 
        el metodo sort
        */
        System.out.println("---------------------------------------------------");
        System.out.println("-------Selecion Insertion--------");
        Inserction inserction = new Inserction();
        System.out.println("Original:");
        printArray(d);
        inserction.sort(d);
        System.out.println("Ordenado Desc:");
        printArray(d);

    }

    public static void printArray(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println();
        /**
         * este metodo sirve para imprimir el arreglo,
         * se le pasa el arreglo que se quiere imprimir y funciona
         * con un bucle for que recorre el arreglo y imprime cada elemento
         */
         }
        public static void printEstudiantes(Estudiante[] estudiantes) { //para descendente, 
        // cambiar el for a for (int i = estudiantes.length - 1; i >= 0; i--)
        {
        for (int i = estudiantes.length - 1; i >= 0; i--) {
            System.out.println(estudiantes[i].getName() + " - " + estudiantes[i].getNota());
        }
        System.out.println();
    
    }
    
    
}

}
