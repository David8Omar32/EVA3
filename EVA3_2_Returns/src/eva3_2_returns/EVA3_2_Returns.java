package eva3_2_returns;
public class EVA3_2_Returns {
    public static void main(String[] args) {
        int valor;
        valor = sumarDosEnteros(100,50);
        System.out.println("Resultado= " + valor);
        System.out.println("Resultado= " + sumarDosEnteros(100,50));
    }
    public static int sumarDosEnteros(int num1, int num2){
        int res;
        res = num1 + num2;
        return res;
    }
}
