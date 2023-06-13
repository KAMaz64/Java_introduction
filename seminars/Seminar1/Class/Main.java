public class Main {
    
    public static void main(String[] args) {
        int i = 875;
        float f = .543f;
        long l;
        double d;
        short sh;
        byte b;
        char ch = 'g';
        boolean bl;
       /*  // все примитивные типы: 
       просто 1 число */
        
       int[] ints = new int[12];
       //    new указывает java , что нужно выделить память под объект
       
    //    Random random = new Random();
    //    for (int j = 0; j < 10; j++) {
    //     ints[j] = random.nextInt(2000);
    //    } 

       int[] tmp = new int[ints.length + 3];
       for (int j = 0; j < ints.length; j++) tmp[j] = ints[j];
       ints = tmp;

       i = 0;
       for (int j = 0; j < 12; j++) {
            i +=j;
             
        }
        System.out.println(i);
    
       i = 0;
       for (int j = 0; j < 12; j++) {
        

        }
    }
}
