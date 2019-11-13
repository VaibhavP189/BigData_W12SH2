package HBase;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.util.Bytes;

public class scan_cmd {
	
	public static void main(String[] args) throws IOException
	{
		Configuration config = HBaseConfiguration.create();
		HTable table = new HTable(config, "Student_Table");
		
		Scan scan  = new Scan();
		scan.addColumn(Bytes.toBytes("student_Data"),Bytes.toBytes("first_Name"));
		scan.addColumn(Bytes.toBytes("student_Data"),Bytes.toBytes("city"));
		
		ResultScanner resultScanner = table.getScanner(scan);
		
		for (Result result = resultScanner.next(); result != null; result = resultScanner.next())
		{
			System.out.println("Scanning : " +result);
		}
		resultScanner.close();
	}

}
