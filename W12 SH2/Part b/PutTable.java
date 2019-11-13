package HBase;


import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.util.Bytes;

public class PutTable {
	
	public static void main(String[] args) throws IOException
	{
		Configuration config = HBaseConfiguration.create();
		HTable ht = new HTable(config, "Student_Table");
		Put put1 = new Put(Bytes.toBytes("1"));
		put1.add(Bytes.toBytes("student_courses"), Bytes.toBytes("Course_Name"), Bytes.toBytes("DBCS"));
		put1.add(Bytes.toBytes("student_courses"), Bytes.toBytes("Course_ID"), Bytes.toBytes("1"));
		put1.add(Bytes.toBytes("student_courses"), Bytes.toBytes("Enrolled_Students"), Bytes.toBytes("55"));
		
		put1.add(Bytes.toBytes("student_Data"), Bytes.toBytes("first_Name"), Bytes.toBytes("Sanchit"));
		put1.add(Bytes.toBytes("student_Data"), Bytes.toBytes("last_Name"), Bytes.toBytes("Sharma"));
		put1.add(Bytes.toBytes("student_Data"), Bytes.toBytes("city"), Bytes.toBytes("YNR"));
		

		Put put2 = new Put(Bytes.toBytes("2"));
		put2.add(Bytes.toBytes("student_courses"), Bytes.toBytes("Course_Name"), Bytes.toBytes("Network_Security"));
		put2.add(Bytes.toBytes("student_courses"), Bytes.toBytes("Course_ID"), Bytes.toBytes("2"));
		put2.add(Bytes.toBytes("student_courses"), Bytes.toBytes("Enrolled_Students"), Bytes.toBytes("55"));
		
		put2.add(Bytes.toBytes("student_Data"), Bytes.toBytes("first_Name"), Bytes.toBytes("Dolly"));
		put2.add(Bytes.toBytes("student_Data"), Bytes.toBytes("last_Name"), Bytes.toBytes("Chandel"));
		put2.add(Bytes.toBytes("student_Data"), Bytes.toBytes("city"), Bytes.toBytes("YNR"));
		
		
		Put put3 = new Put(Bytes.toBytes("3"));
		put3.add(Bytes.toBytes("student_courses"), Bytes.toBytes("Course_Name"), Bytes.toBytes("Big_Data"));
		put3.add(Bytes.toBytes("student_courses"), Bytes.toBytes("Course_ID"), Bytes.toBytes("3"));
		put3.add(Bytes.toBytes("student_courses"), Bytes.toBytes("Enrolled_Students"), Bytes.toBytes("55"));
		
		put3.add(Bytes.toBytes("student_Data"), Bytes.toBytes("first_Name"), Bytes.toBytes("Puneet"));
		put3.add(Bytes.toBytes("student_Data"), Bytes.toBytes("last_Name"), Bytes.toBytes("Garg"));
		put3.add(Bytes.toBytes("student_Data"), Bytes.toBytes("city"), Bytes.toBytes("YNR"));
		
		
		Put put4 = new Put(Bytes.toBytes("4"));
		put4.add(Bytes.toBytes("student_courses"), Bytes.toBytes("Course_Name"), Bytes.toBytes("Mobile_Apps"));
		put4.add(Bytes.toBytes("student_courses"), Bytes.toBytes("Course_ID"), Bytes.toBytes("4"));
		put4.add(Bytes.toBytes("student_courses"), Bytes.toBytes("Enrolled_Students"), Bytes.toBytes("20"));
		
		put4.add(Bytes.toBytes("student_Data"), Bytes.toBytes("first_Name"), Bytes.toBytes("Vaibhav"));
		put4.add(Bytes.toBytes("student_Data"), Bytes.toBytes("last_Name"), Bytes.toBytes("Pahwa"));
		put4.add(Bytes.toBytes("student_Data"), Bytes.toBytes("city"), Bytes.toBytes("Barara"));
		
		
		Put put5 = new Put(Bytes.toBytes("5"));
		put5.add(Bytes.toBytes("student_courses"), Bytes.toBytes("Course_Name"), Bytes.toBytes("stats"));
		put5.add(Bytes.toBytes("student_courses"), Bytes.toBytes("Course_ID"), Bytes.toBytes("5"));
		put5.add(Bytes.toBytes("student_courses"), Bytes.toBytes("Enrolled_Students"), Bytes.toBytes("55"));
		
		put5.add(Bytes.toBytes("student_Data"), Bytes.toBytes("first_Name"), Bytes.toBytes("Sanchit1"));
		put5.add(Bytes.toBytes("student_Data"), Bytes.toBytes("last_Name"), Bytes.toBytes("Sharma"));
		put5.add(Bytes.toBytes("student_Data"), Bytes.toBytes("city"), Bytes.toBytes("YNR"));
		
		
		
		
		
		ht.put(put1);
		ht.put(put2);
		ht.put(put3);
		ht.put(put4);
		ht.put(put5);
						
	}

}


