class Main {
  public static void main(String[] args) {

    // GX Case
    /*
     Thread th1 = new Thread(new Worker1("W1")); 
     Thread th2 = new Thread(new Worker2("W2")); 
     Thread th3 = new Thread(new Worker3("W3"));
     
     try { 
      th1.start(); th1.join();
    
      th2.start(); th2.join();
     
      th3.start(); th3.join(); 
      } catch (Exception e) { 
        e.printStackTrace(); 
      } 
     */

    // LH Case
    
    for (int i = 0; i < 3; i++) { 
      Thread th1 = new Thread(new Worker1("W1"));
      Thread th2 = new Thread(new Worker2("W2"));
      Thread th3 = new Thread(new Worker3("W3"));

      try {
        th1.start();
        th1.join();

        th2.start();
        th2.join();

        th3.start();
        th3.join();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    
  }
}
