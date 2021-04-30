//package hust.soict.globalict.garbage;
import java.util.concurrent.TimeUnit;
public class ContanetationInLoops {
    long startTime, endTime, timeElapsed;
    public void processingTime(){
        startTime = System.nanoTime();
        System.out.println("1"+"2"+"3");
        endTime = System.nanoTime();
        timeElapsed = endTime - startTime;
    System.out.println("Execution time contanatation " + timeElapsed);

        startTime = System.nanoTime();
        StringBuffer sb = new StringBuffer("hey");
        StringBuffer tb = sb;
        sb.append(" girl");
        endTime = System.nanoTime();
        timeElapsed = endTime - startTime;
    System.out.println("Execution time contanatation " + timeElapsed);
    }
    public static void main (String[] args){
        ContanetationInLoops processTimet = new ContanetationInLoops();
        processTimet.processingTime();
    }
}
