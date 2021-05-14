package Codesignal;
import java.util.ArrayList;
import java.util.HashMap;

public class Devices {

	    public static void main(String[] args) {
	       Devices devices1 = new Devices();
	       String[][] conns={{"192.167.0.0", "192.167.0.1"}, {"192.167.0.2", "192.167.0.0"},{"192.167.0.0", "192.167.0.3"}};
	       String[] togIps={"192.167.0.1", "192.167.0.0", "192.167.0.2", "192.167.0.0", "0.0.0.0"};
	       int[] impCntFinal;
	       impCntFinal = devices1.numberOfDevices(conns,togIps);
	       for (int i=0; i<impCntFinal.length; i++) {
	    	   System.out.println("impact result: "+impCntFinal[i]);
	       }
	    }
		
        int[] numberOfDevices(String[][] connections, String[] toggleIps) {
             class Device {
                String ipAddress;
                boolean isActive;
                // can be a HashSet instead which will prevent duplicates
                ArrayList<String> connections;
                Device(String ipAddress) {
                   this.ipAddress = ipAddress;
                   this.connections = new ArrayList();
                   this.isActive = false;
                }
              }
              int impactCounts[] = new int[toggleIps.length];
              // map with key: ipAddress, value: {state, other devices it's connected to}
              HashMap<String, Device> devices = new HashMap();
              // populate the map with all of the devices and what other devices they are connectedTest Session ID: 7CEyLWicmXLa9wuSZ


         for (int i=0; i<connections.length; i++) {
            String connection1 = connections[i][0];
            String connection2 = connections[i][1];
            // refactor this if there is time. At minimum the if statements can be combined...
            if (devices.putIfAbsent(connection1, new Device(connection1)) != null) {
            // the device already exists so now add the new connection if it doesn't exist
               if (!devices.get(connection1).connections.contains(connection2)) {
                  devices.get(connection1).connections.add(connection2);
               }
            } else {
                 devices.get(connection1).connections.add(connection2);
            }
            if (devices.putIfAbsent(connection2, new Device(connection2)) != null) {
               if (!devices.get(connection2).connections.contains(connection1)) {
                  devices.get(connection2).connections.add(connection1);
                }
             } else {
                devices.get(connection2).connections.add(connection1);
            }
          }
          // toggle the devices and check if that device and all of its connected devices are active
         for (int i=0; i<toggleIps.length; i++) {
            impactCounts[i] = 0;
            Device device = devices.get(toggleIps[i]);
            if (device != null) {
                device.isActive = !device.isActive;
                for (String connection: device.connections) {
                     if (devices.get(connection).isActive) {
                          impactCounts[i]++;
                     }
                }
             }
           }
       return impactCounts;
     }
}


