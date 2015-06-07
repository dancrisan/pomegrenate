/**
 * The Hello class implements an application that
 * simply prints "Hello World!" to standard output.
 */

import com.clusterpoint.api.CPSConnection;
import com.clusterpoint.api.request.CPSInsertRequest;
import com.clusterpoint.api.response.CPSModifyResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.clusterpoint.api.request.CPSLookupRequest;
import com.clusterpoint.api.response.CPSLookupResponse;
import java.util.List;
//import java.util.Element;
import org.w3c.dom.Element;
import java.util.Iterator;
import com.clusterpoint.api.request.CPSRetrieveRequest;
import com.clusterpoint.api.response.CPSListLastRetrieveFirstResponse;


class testJavaToClusterPoint{
    public static void main(String[] args) {
        System.out.println("This reads from a Clusterpoint DB"); // Display the string.

        try
		{
			//CPSConnection conn = new CPSConnection("tcp://cloud-us-0.clusterpoint.com:9007", "My_DB_name", "bob@gmail.com", "12345678", "100337", "document", "//document/id"); 
			CPSConnection conn = new CPSConnection("tcp://cloud-us-0.clusterpoint.com:9007", "DATABASE_NAME", "EMAIL", "PASSWORD", "ACCOUNT_ID", "document", "//document/id"); 

			//insert of 9, put the id position that you want to read 
			CPSRetrieveRequest retr_req = new CPSRetrieveRequest("9");
			System.out.println("request retrieved...");

			CPSListLastRetrieveFirstResponse retr_resp = (CPSListLastRetrieveFirstResponse) conn.sendRequest(retr_req);
			System.out.println("response retrieved...");

			List<Element> docs = retr_resp.getDocuments();
			System.out.println("added respons eto documents...");

			Iterator<Element> it = docs.iterator();
			System.out.println("iterators created...");

			while (it.hasNext())
			{
				Element el = it.next();
				System.out.println(el.getElementsByTagName("id").item(0).getTextContent());
				System.out.println(el.getElementsByTagName("name").item(0).getTextContent());
				System.out.println("elements printend !");
			}
  
  			//Close connection
			conn.close();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}

