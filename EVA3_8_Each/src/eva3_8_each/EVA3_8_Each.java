package eva3_8_each;
public class EVA3_8_Each {
    public static void main(String[] args) {
        String [] dias = {"Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"};
        
        /*for (int i = 0; i < dias.length; i++) {
            System.out.println(dias[i]);
        }*/
        
        for(String cadena: dias){
            System.out.println(cadena);
        }
        
        int[] billones = {22,4,58,234,75645,3,4512,234,523,3,452,3,4,232};
        for(int billetes: billones){
            System.out.println(billetes);
        }
    }
    
}
