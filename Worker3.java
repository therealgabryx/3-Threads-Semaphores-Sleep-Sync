class Worker3 implements Runnable {
  private String name;

  public Worker3(String name) {
    this.name = name;
  }

 @Override
  public void run() {
    try {
        Thread.sleep(1000);
      } catch (Exception e) { 
          e.printStackTrace();
      }
  System.out.println("Worker 3 " + name + " works\n");
  }
}