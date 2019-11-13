package HBase;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.MasterNotRunningException;
import org.apache.hadoop.hbase.ZooKeeperConnectionException;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class Disable_cmd {
	public static void main(String [] args) throws MasterNotRunningException, ZooKeeperConnectionException, IOException
	{
		Configuration config = HBaseConfiguration.create();
		HBaseAdmin admin = new HBaseAdmin(config);
		Boolean isTableDisabled = admin.isTableDisabled("Student_Table");
		System.out.println(isTableDisabled);
		
		if(!isTableDisabled)
		{
			admin.disableTable("Student_Table");
			System.out.println("Table is Disabled...");
		}
		
	}

}
