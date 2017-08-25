public class Libro
{
    private String titulo;
    private String autor;
    private int paginas;
    private String numeroDeReferencia;
    private int prestamos;
    
    public Libro(String titIni,String autIni,int numPag)
    {
        titulo=titIni;
        autor=autIni;
        paginas=numPag;
        numeroDeReferencia="";
        prestamos=0;
    }
    
    public void prestar()
    {
        prestamos+=1;
    }
    
    public int dimePrestamos()
    {
        return prestamos;
    }
    
    public String dimeNumRef()
    {
        return numeroDeReferencia;
    }
    
    public void cambiaNumRef(String NumRefInicial)
    {
        if(NumRefInicial.length()>=3)
        {
            numeroDeReferencia=NumRefInicial;
        }
        else
        {
            numeroDeReferencia=numeroDeReferencia;
        }
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
        cadResultados+="AUTOR:";
        cadResultados+=autor+" ";
        cadResultados+="LIBRO:";
        cadResultados+=titulo+" ";
        cadResultados+="No.PAGINAS:";
        cadResultados+=paginas+" ";
        
        if(numeroDeReferencia.length()>0)
        {
            cadResultados+="Num.REFERENCIA:";
            cadResultados+=numeroDeReferencia+" ";
        }
        else
        {
            cadResultados+="Num.REFERENCIA:";
            cadResultados+="ZZZ"+" ";
        }
        
        cadResultados+="PRESTAMOS:";
        cadResultados+=prestamos+" ";
        
        return cadResultados;
    }
        
}