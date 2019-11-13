package HBase;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.MasterNotRunningException;
import org.apache.hadoop.hbase.ZooKeeperConnectionException;
import org.apache.hadoop.hbase.client.HBaseAdmin;
import org.apache.hadoop.hbase.util.Bytes;

public class is_Disabled_cmd {

	public static void main(String [] args) throws MasterNotRunningException, ZooKeeperConnectionException, IOException
	{
		Configuration config = HBaseConfiguration.create();
		HBaseAdmin admin = new HBaseAdmin(config);
		HTableDescriptor des1= new HTableDescriptor(Bytes.toBytes("samplTable3"));
		admin.createTable(des1);
		
		Boolean isTableDisabled = admin.isTableDisabled("samplTable3");
		System.out.println(isTableDisabled);
		
	}
}
