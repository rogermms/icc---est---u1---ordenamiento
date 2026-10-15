public class App {
    public  static void main(String[] args) throws Exception {
        int [] original = {5 , 3, 4, 1, 2};
        int [] b = original.clone();  

        // USAR METODO DEL ARCHIVO(clase) BUBBLE
        // INSTANCIAR el archivo BUBBLE
        // INSTANCIA la clase BUBBLE
        Bubble Bubble = new Bubble();
        // EJECUTAR CODIGO DEL ARCHIVO BUBBLE USO LA INSTANCIA Bubble
        printArray(original);
        Bubble.sort2(b);
        printArray(b);
        
      

    }

    public static void printArray(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) 
            System.out.print(arreglo[i] + " - ");
        System.out.println();
        
            
    }
}
