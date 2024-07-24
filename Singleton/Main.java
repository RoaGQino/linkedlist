package Singleton;

public class Main {
//ensure that all parts of your application log to the same place, //maintain consistent logging behavior, and manage resources //efficiently.
 public static void main(String[] args) {
   
     Logger logger = Logger.getInstance();

 
     logger.log("Start");
     logger.log("Process");
     logger.log("finish.");
 }
}
