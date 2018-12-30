public class NewThread implements Runnable {
    Thread t;

    NewThread(){
        t = new Thread(this, "Демонстрационный пготок");
        System.out.println("Дочерний поток создан:" + t);
        t.start();

    }

    public void run() {
        try{
            for(int i = 5; i>0; i--){
                System.out.println("Дочерний поток: " +  i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e){
            System.out.println("Дочерний поток уже завершён.");
        }
        System.out.println("Дочерний поток завершён");
    }
}
