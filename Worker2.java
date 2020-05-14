class Worker2 implements Runnable {
  private String name;

  public Worker2(String name) {
    this.name = name;
  }

 @Override
  public void run() {
    try {
        Thread.sleep(500);
      } catch (Exception e) { 
          e.printStackTrace();
      }
    System.out.println("Worker 2 " + name + " works");
  }
}