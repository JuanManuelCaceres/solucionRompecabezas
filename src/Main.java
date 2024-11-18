public class Main {
    public static void main(String[] args) {
        solucionarRompecabezas(10);
        solucionarRompecabezas(100);
        solucionarRompecabezas(2023^100);
    }

    public static void solucionarRompecabezas(int N){
        long var_A = 1;
        long var_B = 1;
        long var_C = 1;
        long var_D = 1;

        long divisor = 10000000000L; // divisor para limitar los calculos para manjear mejor los numeros grandes

        for (int i = 0; i < N; i++) {
            long resultado = (3 * var_D % divisor + var_C % divisor + 4 * var_B % divisor + var_A % divisor) % divisor; // modificacion de la formula para agregar el divisor

            var_A = var_B;
            var_B = var_C;
            var_C = var_D;
            var_D = resultado;
        }

        System.out.println(var_D);
    }
}