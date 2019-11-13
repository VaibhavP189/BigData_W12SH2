package HBase;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.MasterNotRunningException;
import org.apache.hadoop.hbase.ZooKeeperConnectionException;
import org.apache.hadoop.hbase.client.Delete;
import org.apache.hadoop.hbase.client.HBaseAdmin;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.thrift.generated.Hbase;
import org.apache.hadoop.hbase.util.Bytes;

public class delete_cmd {
	public static void main(String[] args) throws MasterNotRunningException, ZooKeeperConnectionException, IOException
	{
		Configuration confg = new HBaseConfiguration().create();
		HTable table = new HTable(confg, "Student_Table");
		
		Delete del = new Delete(Bytes.toBytes("1"));
		del.deleteColumn(Bytes.toBytes("student_courses"), Bytes.toBytes("Course_ID"));
		
		table.delete(del);
		table.close();
		System.out.println("Specified Column is deleted..!");
		
		
	}

}
