import java.util.ArrayList;

/**
 * Clase que modela objetos del tipo biblioteca, que guardan referencias a libros
 *
 * @author Dasins
 * @version 24/01/2018
 */
public class Biblioteca{
    private ArrayList<Libro> libros;
    
    /**
     * Constructor de objetos de la clase biblioteca.
     */
    public Biblioteca() {
        libros = new ArrayList<>();
    }
    
    /**
     * Anade un libro a la coleccion.
     * @param isbn El isbn del libro.
     * @param titulo El titulo del libro.
     * @param autor El autor del libro.
     * @param numPags El numero de paginas del libro. 
     */
    public void addLibro(int isbn, String titulo, String autor, int numPags){
        libros.add(new Libro(isbn, titulo, autor, numPags));
    }
    
    
}
