package trasnportadora.services.exceptions;

public class ClienteException extends Exception{
    public ClienteException(Exception e) throws ClienteException{
        super(e);
    }
}
