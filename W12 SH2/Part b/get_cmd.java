package HBase;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.MasterNotRunningException;
import org.apache.hadoop.hbase.ZooKeeperConnectionException;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.HBaseAdmin;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.util.Bytes;

public class get_cmd {
	
	public static void main (String[] args) throws MasterNotRunningException, ZooKeeperConnectionException, IOException
	{
		Configuration config = HBaseConfiguration.create();
		HBaseAdmin admin = new HBaseAdmin(config);
		HTable table = new HTable(config, "Student_Table");
		
		Get g = new Get(Bytes.toBytes("2"));
		Result result = table.get(g);
		
		byte values[] = result.getValue(Bytes.toBytes("student_courses"), Bytes.toBytes("Course_Name"));
		byte values1[] = result.getValue(Bytes.toBytes("student_courses"), Bytes.toBytes("Course_ID"));
		
		String name = Bytes.toString(values);
		String Id = Bytes.toString(values1);
		
		System.out.println("Course Name: " + name + " \nCourse ID: "+ Id);
	
		
	}

}
