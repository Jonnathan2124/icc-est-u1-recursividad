public class App {
    public static void main(String[] args) throws Exception {

        //Recursividad rec=new Recursividad();
        //int resultado = rec.factorial(5);
        //System.out.println(resultado);

        //System.out.println(rec.sumaConsecutivos(5));
        
        //System.out.println(rec.potencia(5, 3));

        //System.out.println(rec.sumaDigito(456));

        //System.out.println(rec.fibonacci(8));

        RenombrarDirectorios dir = new RenombrarDirectorios();
        dir.renombrarDirectorios("src/directorios");
    }
}
