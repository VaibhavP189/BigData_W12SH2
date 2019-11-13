package HBase;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.MasterNotRunningException;
import org.apache.hadoop.hbase.ZooKeeperConnectionException;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class exists_cmd {

	public static void main(String[] args) throws MasterNotRunningException, ZooKeeperConnectionException, IOException
	{
		Configuration config = HBaseConfiguration.create();
		HBaseAdmin admin = new HBaseAdmin(config);
		Boolean isExist = admin.tableExists("Student_Table");
		
		if(!isExist)
		{
			System.out.println("table does not Exist.");
		}
		else{
			System.out.println("Table Exists");
		}
		
	}
}
