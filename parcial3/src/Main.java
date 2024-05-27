//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void Ordenar(int[] numeros){
        int aux;
        for(int i = 0; i < numeros.length; i++){
            for(int j = i+1; j <numeros.length; j++){
                aux = numeros[i];
                numeros[i] = numeros[j];
                numeros[j] = aux;
            }
        }
    }

    public static void Mostrar(int[] nums){
        System.out.println();
        for(int n : nums){
            System.out.println(n + " ");
        }
    }

    public static boolean Repetido(int conta, int[] nums, int gen){
        boolean res = false;
        for(int i = 0; i < conta; i++){
            if( gen == nums[i]){
                res =  true;
                break;
            }
        }


        return res;
    }

    public static void Divisores(int numero){
        String tipo;
        System.out.println("Divisores de "+numero+": ");
        for(int i = 1; i <= numero; i++){
            if(numero % i == 0){
                tipo = Pares(i) ? "par" : "impar";
                System.out.println(i+ ": "+tipo);
            }
        }
        System.out.println("");
    }

    public static boolean Pares(int numero){
        return numero % 2 == 0;
    }


    public static boolean Primo(int numero){
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int[] numeros = new int[6];
        int contador = 0, generado = 0;
        String tipoPrimo;

        while(contador < numeros.length){
            generado = (int)(Math.random()*20);
            if(!Repetido(contador, numeros, generado)){
                numeros[contador] = generado;
                tipoPrimo = Primo(numeros[contador]) ? "primo" : "no primo";
                System.out.println(numeros[contador]+ " (" + tipoPrimo + ")");
                Divisores(numeros[contador]);
                contador++;
            }
        }


        Mostrar(numeros);

    }
}