public class App {
    public  static void main(String[] args) throws Exception {
        int [] original = {5, 6, 4, 1, 2, 3};
        int [] b = original.clone(); 
        int [] c = original.clone(); 

        // USAR METODO DEL ARCHIVO(clase) BUBBLE
        System.out.println("---------------------------------------------------");
        // INSTANCIAR el archivo BUBBLE
        // INSTANCIA la clase BUBBLE
        System.out.println("Original:");
        Bubble Bubble = new Bubble();
        // EJECUTAR CODIGO DEL ARCHIVO BUBBLE USO LA INSTANCIA Bubble
        printArray(b);
        Bubble.sort(b);
        printArray(b);
        
        System.out.println("---------------------------------------------------");
        /// Instanciar el archivo SELECTION
        Selection Selection = new Selection();
        printArray(c);
        Selection.sort(c);
        printArray(c);

    }

    public static void printArray(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) 
            System.out.print(arreglo[i] + " - ");
        System.out.println();
        
            
    }
}
