package thread;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.OutputStreamWriter;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;

public class writer{ 
public  static void main(String args[]){
	byte[] bytes={'e','g','d','e'};
	write(bytes);
}


		// Thread safe version.
synchronized static void write(byte[] bytes) {
try{
FileOutputStream file = new FileOutputStream("D:/Users/Suggala.vasa/workspace1/thread/src/thread/aa.txt");
	 OutputStreamWriter osw = new OutputStreamWriter(file); 
			  try {
			    boolean written = false;
			    do {
			      try {
			        // Lock it!
			        FileLock lock = file.getChannel().lock();
			        try {
			          // Write the bytes.
			          file.write(bytes);
			          written = true;
			        } finally {
			          // Release the lock.
			          lock.release();
			        }
			      } catch ( OverlappingFileLockException ofle ) {
			        try {
			          // Wait a bit
			          Thread.sleep(1000);
			        } catch (InterruptedException ex) {
			          throw new InterruptedIOException ("Interrupted waiting for a file lock.");
			        }
			      }
			    } while (!written);
			  } catch (IOException ex) {
			   // log.warn("Failed to lock " + file, ex);
				  System.out.println("Failed to lock " +ex);
			  }
			}catch(Exception e){
				System.out.println(e);
			}
			}
}


