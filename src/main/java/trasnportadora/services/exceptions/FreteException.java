package trasnportadora.services.exceptions;

public class FreteException extends Exception{
    public FreteException(Exception e) throws FreteException {
        super(e);
    }
}
