package HBase;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.MasterNotRunningException;
import org.apache.hadoop.hbase.ZooKeeperConnectionException;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class alter_cmd {
	
	public static void main (String[] args) throws MasterNotRunningException, ZooKeeperConnectionException, IOException
	
	{
		Configuration config = new HBaseConfiguration().create(); // Instantiating configuration object
		HBaseAdmin admin = new HBaseAdmin(config); // Instantiating HBaseAdmin class
		admin.deleteColumn("Student_Table", "student_Data");       // Deleting a column family
		System.out.println("One Column Familiy successfully deleted..");
		
	}

}
