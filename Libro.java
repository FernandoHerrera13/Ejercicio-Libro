public class Libro
{
    private String titulo;
    private String autor;
    private int paginas;
    private String numeroDeReferencia;
    private int prestamos;
    
    /**El constructor inicializa las variables de instancia con la informacion necesaria
     * @param titulo
     * @param autor
     * @param paginas
     */
    public Libro(String tiulo,String autor,int paginas)
    {
        this.titulo=titulo;
        this.autor=autor;
        this.paginas=paginas;
        numeroDeReferencia="";
        prestamos=0;
    }
    /**Incrementa en uno los prestamos del libro*/
    public void prestar()
    {
        prestamos+=1;
    }
    /**Regresa la cantidad de veces que se ha prestado un numero
       *return regresa un entero que representa las veces que se ha prestado un libro
    */
    public int dimePrestamos()
    {
        return prestamos;
    }
    
    /**Regresa el numero de referencia asociado al libro
     * @return string representativo al numero de referencia asociado al libro
     */
    public String dimeNumRef()
    {
        return numeroDeReferencia;
    }
    
    /**Solicita al usuario el nuevo numero de referencia que va a asignar el libro
     * @param NumRefInicial
     */
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
    
    /**
     * @return String con el nombre del autor
     */
    public String dimeAutor()
    {
        return autor;
    }
    
    /**
     * @return String con el nombre del libro
     */
    public String dimeLibro()
    {
        return titulo;
    }
    
    /**
     * @return int con el numero de paginas del libro
     */
     public int dimePaginas()
    {
        return paginas;
    }
    
    /**Muestra la concatenacion de todos los detalles del libro
     * @return String con toda la informaicon del libro
     */
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