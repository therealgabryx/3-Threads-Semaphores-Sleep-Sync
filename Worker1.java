class Worker1 implements Runnable {
  private String name;

  public Worker1(String name) {
    this.name = name;
  }

  @Override
  public void run() {
    try { 
        Thread.sleep(10);
      } catch (Exception e) {
          e.printStackTrace();
      }
    System.out.println("Worker 1 " + name + " works");
    try {
        Thread.sleep(1000);
      } catch (Exception e) {
          e.printStackTrace();
      }
  }
}

