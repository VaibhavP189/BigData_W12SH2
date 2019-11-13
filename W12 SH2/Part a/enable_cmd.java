package HBase;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.MasterNotRunningException;
import org.apache.hadoop.hbase.ZooKeeperConnectionException;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class enable_cmd {
	
	public static void main(String[] args) throws MasterNotRunningException, ZooKeeperConnectionException, IOException
	{
		Configuration config = HBaseConfiguration.create();
		HBaseAdmin admin = new HBaseAdmin(config);
		
		Boolean isTableEnabled = admin.isTableEnabled("Student_Table");
		System.out.println(isTableEnabled);
		
		if(!isTableEnabled)
		{
			admin.enableTable("Student_Table");
			System.out.println("Table is enabled..");
		}
		
	}
}
