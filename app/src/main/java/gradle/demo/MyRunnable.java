/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gradle.demo;


import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;

public class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Hello from a thread!");
		NetworkTableInstance inst = NetworkTableInstance.create();
		inst.startServer("networktables.ini","0.0.0.0");

        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        while (true) {
			try {
				Thread.sleep(1000);                 //1000 milliseconds is one second.
			} catch(InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
        }
    }

}
