public class Libro
{
    private String titulo;
    private String autor;
    private int paginas;
    
    public Libro(String titIni,String autIni,int numPag)
    {
        titulo=titIni;
        autor=autIni;
        paginas=numPag;
    }
    
    public String dimeAutor()
    {
        return autor;
    }
    
    public String dimeLibro()
    {
        return titulo;
    }
    
     public int dimePaginas()
    {
        return paginas;
    }
    
    public String dimeDetalles()
    {
        String cadResultados="";
        cadResultados+="AUTOR: ";
        cadResultados+=autor;
        cadResultados+="LIBRO: ";
        cadResultados+=titulo;
        cadResultados+="No.PAGINAS: ";
        cadResultados+=paginas;
        
        return cadResultados;
    }
        
}