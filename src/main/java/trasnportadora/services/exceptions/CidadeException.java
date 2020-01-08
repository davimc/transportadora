package trasnportadora.services.exceptions;

public class CidadeException extends Exception{
    public CidadeException(Exception e) throws CidadeException {
        super(e);
    }
}
