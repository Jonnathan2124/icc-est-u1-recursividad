public class Recursividad{

    
    public int factorial(int n){
        System.out.println("Calculando el factorial de: "+n);
        // Caso bas: n sea 0! y 1! son iguales a 1
        if(n==0 || n==1){
            System.out.println("Caso de base alcanzado el factorial de "+n+" es 1");
            return 1;
        }
        int resultado = n * factorial(n-1);
        System.out.println("Resultado parcial para "+n+" * factorial("+(n-1)+") = "+resultado);
        return resultado;
        //return n * factorial(n-1);
    }
    //Calcular la suma de los numeros consecutivos
    // n=5 resultado=5+4+3+2+1 = 15
    public int sumaConsecutivos(int n){
        //Caso base
        if(n==1){
            return 1;
        }
        return n + sumaConsecutivos(n-1);
    }

    //Calcula la potencia de numero

    public int potencia(int base, int exponente){
        //Caso base
        if(exponente==0){
            return 1;
        }
        return base * potencia(base, exponente -1);
    }

    //CREA UN METODO QUE SUMA LOS DIGITOS DE UN NUMERO 
    //SI MANDO 456 SEA IGUAL A 15
    //4 + 5 + 6 = 15
    //PISTA SE USA % MOD

    public int sumaDigito(int n){
        //Caso base
        if(n < 10){
            return n;
        }
        int resultado = n % 10;
        return resultado + sumaDigito(n/10);
    }

    public int fibonacci(int n){
        ///Caso o caso base: los dos primeros numeros de fibonacci son 0 y1
        //if(n==0){
        //    return 0;
        //} else if(n==1){
        //    return 1;
        //}
        //return fibonacci(n-1) + fibonacci(n-2);

        if(n==0)return 0;
        if(n==1)return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }
    
}