package exceptionhandling;

public class CustomTest extends CustomException {
    public void vote(int age) throws CustomException{
        if(age<18){
            throw new CustomException("under age and not eligibe to vote");
        }
        else{
            System.out.println("eligible to vote");
        }
    }
    public static void main(String[] args) throws CustomException {
        CustomTest ct=new CustomTest();
        ct.vote(17);
    }
}
