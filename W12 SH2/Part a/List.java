package HBase;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.TableDescriptors;
import org.apache.hadoop.hbase.client.HBaseAdmin;
import org.apache.hadoop.hbase.HTableDescriptor;

public class List {
	public static void main(String [] args) throws IOException
	{
	
		Configuration config = HBaseConfiguration.create();
		HBaseAdmin admin = new HBaseAdmin(config);
		HTableDescriptor[] des = admin.listTables();
		
		for(int i = 0 ; i < des.length; i++){
			System.out.println(des[i].getNameAsString());
		}
		

	}

}
