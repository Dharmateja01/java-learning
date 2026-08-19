package exceptionhandling;

public class CustonExceptionRuntime extends RuntimeException{
    CustonExceptionRuntime(String message){
        super(message);
    }

    public CustonExceptionRuntime() {
    }
}
