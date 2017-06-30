package cassandra.helpers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.mendix.core.Core;
import com.mendix.logging.ILogNode;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.timeseriesgroup.mendix.cassandra.CassandraConnector;
import com.timeseriesgroup.mendix.cassandra.CassandraConnectors;
import com.timeseriesgroup.mendix.cassandra.ClusterProperties;

public class Cassandra {
	
    static ILogNode _logNode = Core.getLogger("TimeSeries");
    
    public static List<IMendixObject> executeQuery(String query, IMendixObject resultObject, IContext context)
    {
    	try {
			_logNode.info("Calling Cassandra at " + Core.getConfiguration().getConstantValue("Cassandra.ClusterLocation").toString() + " with query " + query);
			List<IMendixObject> resultList = new ArrayList<IMendixObject>();
			CassandraConnector connector = getConnector();
			Iterable<Map<String, Object>> result = connector.executeQuery(query);
			_logNode.debug(result);
			
			for(Map<String,Object> row : result) {
				IMendixObject mo = Core.instantiate(context, resultObject.getType());
				
				for(Entry<String,Object> entry : row.entrySet()) {
					if(mo.hasMember(entry.getKey())) {
						mo.setValue(context, entry.getKey(), entry.getValue());
					}
				}
				resultList.add(mo);
			}
			_logNode.info("Call to Cassandra succesfull. Got " + resultList.size() + " results.");
			return resultList;
		} catch (Exception e) {
			_logNode.error("Error while calling Cassandra: " + e);
			e.printStackTrace();
			return null;
		}
    }
    
    
    private static CassandraConnector getConnector()
    {
    	CassandraConnector connector = CassandraConnectors.getOrCreateConnector(
    	        Core.getConfiguration().getConstantValue("Cassandra.ClusterName").toString(), // Arbitrary cluster name
    	        ClusterProperties.builder(Core.getConfiguration().getConstantValue("Cassandra.ClusterLocation").toString()), // Can be multiple hosts when contacting a cluster.
    	        Core.getConfiguration().getConstantValue("Cassandra.KeyspaceName").toString()); // Keyspace name
    	return connector;
    }

}
