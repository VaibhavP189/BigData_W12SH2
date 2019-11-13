package HBase;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.MasterNotRunningException;
import org.apache.hadoop.hbase.ZooKeeperConnectionException;
import org.apache.hadoop.hbase.client.HBaseAdmin;
import org.apache.hadoop.hbase.util.Bytes;

public class truncate_cmd {
	
	public static void main(String[] args) throws MasterNotRunningException, ZooKeeperConnectionException, IOException
	{
		Configuration config = HBaseConfiguration.create();
		HBaseAdmin admin = new HBaseAdmin(config);
		admin.disableTable(Bytes.toBytes("Student_Table"));
		admin.truncateTable(Bytes.toBytes("Student_Table"), true);
		admin.enableTable("Student_Table");
	    		
	}

}
