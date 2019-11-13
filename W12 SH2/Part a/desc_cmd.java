package HBase;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.MasterNotRunningException;
import org.apache.hadoop.hbase.ZooKeeperConnectionException;
import org.apache.hadoop.hbase.client.HBaseAdmin;
import org.apache.hadoop.hbase.util.Bytes;

public class desc_cmd {

	public static void main(String[] agrs) throws MasterNotRunningException, ZooKeeperConnectionException, IOException
	{
		Configuration config = HBaseConfiguration.create();  // Instantiating configuration class
		HBaseAdmin admin = new HBaseAdmin    // Instantiating HbaseAdmin class

		// get table description using getTableDescriptor method
		System.out.println(admin.getTableDescriptor(Bytes.toBytes("Student_Table")));
	
			
	}
}
