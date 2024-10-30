import java.io.File;

public class RenombrarDirectorios {
    
    public void renombrarDirectorios(String path){
        ///Validemos que el path sea un directorio
        File directorio = new File(path);
        if(!directorio.exists() || !directorio.isDirectory()){
            System.out.println("La ruta path no es un directorio valido");
            return;
        }
        ///ACA vamos a cambiar los nombres
        System.out.println("La ruta path es valida");
    }
}
