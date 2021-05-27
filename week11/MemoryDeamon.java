public class MemoryDeamon extends Thread implements Runnable{
    long memoryUsed = 0;

    public void run(){
        Runtime rt = Runtime.getRuntime();
        long used;

        while (true){
            used = rt.totalMemory() - rt.freeMemory();
            if (used != memoryUsed){
                System.out.println("\t memory used: "+ used);
                memoryUsed = used;
            }
        }
    }

    public static void main (String args[]){
        MemoryDeamon memmory1 = new MemoryDeamon();
        Thread thread1 = new Thread(memmory1);
        thread1.start();
        memmory1.run();
    }

}
