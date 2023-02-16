
package prueba.pkg2;

import java.util.Arrays;

/**
 *
 * @author sebastian camargo
 */
public class ConjuntoLibro {
    public Libro[] libros;
    private int i = 0;

    public ConjuntoLibro() {
    }

    public ConjuntoLibro(int longitud) {
        this.libros = new Libro[longitud];
    }
    
    public void agLibro(Libro libro){
      libros[i] = libro;
      i++;
    }
        
    public void elLibro(String titulo){
        
        for (int i = 0; i < libros.length; i++) {
            if (libros[i].getTitulo().equals(titulo)){
                libros[i] = libros[libros.length - 1];
                libros[libros.length - 1] = null;
                libros = Arrays.copyOf(libros, libros.length - 1);
                break;
            }
            
        }

    }
    
public void mostrarLibrosCalificacion() {

        for (int i = 0; i < libros.length; i++) {

            for (int j = 0; j < libros.length-i-1; j++) {

                if (libros[j].getCalificacion() > libros[j+1].getCalificacion()){
                    Libro temp = libros[j];
                    libros[j] = libros[j+1];
                    libros[j+1] = temp;

                }

            }

        }
        System.out.println(Arrays.toString(libros));
    }

    
    public void  mostrarTodos(){
               
        for (int i = 0; i < libros.length; i++){
            
          System.out.println(libros[i]);
        }
        
       
    }
    
        
}
    

