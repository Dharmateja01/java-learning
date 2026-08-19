package exceptionhandling;

public class CustomTestRun extends CustonExceptionRuntime{
    public void test(int a){
        if(a<18){
            throw new CustonExceptionRuntime("enter a valid number greater than 18");
        }
        else{
            System.out.println("eligible number "+a);
        }
    }
    public static void main(String[] args) {
        CustomTestRun cr=new CustomTestRun();
        cr.test(17);
    }

}
