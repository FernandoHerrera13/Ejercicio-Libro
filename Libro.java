public class Libro
{
    private String titulo;
    private String autor;
    
    public Libro(String titIni,String autIni)
    {
        titulo=titIni;
        autor=autIni;
    }
    
    public String dimeAutor()
    {
        return autor;
    }
    
    public String dimeLibro()
    {
        return titulo;
    }
        
}