package HBase;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.client.HBaseAdmin;
import org.apache.hadoop.hbase.util.Bytes;

public class Create_cmd {
	
	
	public static void main(String[] args) throws IOException
	{
		
		Configuration config = HBaseConfiguration.create(); // Instantiating configuration class.
		HBaseAdmin admin = new HBaseAdmin(config);  // Instantiating HBaseAdmin class.
		HTableDescriptor des= new HTableDescriptor(Bytes.toBytes("Student_Table"));  // Instantiating table descriptor class
	
		// Instantiating column descriptor class
		HColumnDescriptor hcd = new HColumnDescriptor(Bytes.toBytes("student_courses"));
		HColumnDescriptor hc1 = new HColumnDescriptor(Bytes.toBytes("student_Data"));
		

		HTableDescriptor des2= new HTableDescriptor(Bytes.toBytes("sampleTable1"));
		HTableDescriptor des1= new HTableDescriptor(Bytes.toBytes("samplTable2"));
		
		// Adding column families to table descriptor
		des.addFamily(hcd); 
		des.addFamily(hc1);

		// Execute the table through admin
		admin.createTable(des);
		admin.createTable(des1);
		admin.createTable(des2);

		System.out.println("Table Created..!");
	}

}
