
package HBase;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.Delete;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.util.Bytes;

public class delte_All_cmd {
	
	public static void main(String[] args) throws IOException
	{
		Configuration config = new HBaseConfiguration().create();
		HTable table = new HTable(config, "Student_Table");
		
		Delete del = new Delete(Bytes.toBytes("1"));
		table.delete(del);
		table.close();
		
		System.out.println("Specified row is deleted..!");
	}

}
