
package prueba.pkg2;

/**
 *
 * @author sebastian camargo
 */
public class Libro {
     
    private String titulo;
    private String autor;
    private int Npaginas;
    private double calificacion;

    public Libro() {
    }

    public Libro(String titulo, String autor, int Npaginas, double calificacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.Npaginas = Npaginas;
        this.calificacion = calificacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNpaginas() {
        return Npaginas;
    }

    public void setNpaginas(int Npaginas) {
        this.Npaginas = Npaginas;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return String.format("titulo:%s\nautor:%s\npaginas:%d\ncalificacion:%f\n", titulo, autor, Npaginas, calificacion ); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
