
package prueba.pkg2;

/**
 *
 * @author sebastian camargo
 */
public class Prueba2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Libro libro1 = new Libro("100 años de soledad", "Gabriel G", 100, 9.5);
        Libro libro2 = new Libro("Hielo y fuego","George RR", 250, 10);
        Libro libro3 = new Libro("Romeo y Julieta","shakespire", 150, 8.5);
        
        ConjuntoLibro libros = new ConjuntoLibro(3);
        
        libros.agLibro(libro1);
        libros.agLibro(libro2);
        libros.agLibro(libro3);
        
            
        
        libros.mostrarLibrosCalificacion();
        
        libros.elLibro(libro2.getTitulo());
        
        libros.mostrarTodos();
        
        
        
        
    }
    
}

